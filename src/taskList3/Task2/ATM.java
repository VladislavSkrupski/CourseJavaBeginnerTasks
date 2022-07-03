package taskList3.Task2;

public class ATM {
    private int bill100, bill50, bill20;

    public ATM() {
    }

    public ATM(int bill100, int bill50, int bill20) {
        this.bill100 = bill100;
        this.bill50 = bill50;
        this.bill20 = bill20;
    }

    public int getBill100() {
        return bill100;
    }

    public void setBill100(int bill100) {
        this.bill100 = bill100;
    }

    public int getBill50() {
        return bill50;
    }

    public void setBill50(int bill50) {
        this.bill50 = bill50;
    }

    public int getBill20() {
        return bill20;
    }

    public void setBill20(int bill20) {
        this.bill20 = bill20;
    }

    public void inputMoney(int clientBill100, int clientBill50, int clientBill20) {
        this.bill100 += clientBill100;
        this.bill50 += clientBill50;
        this.bill20 += clientBill20;
    }

    public boolean outputMoney(int sum) {
        int buffer = sum, buffer100 = getBill100(), buffer50 = getBill50(), buffer20 = getBill20();
        int cash20 = 0;
        int cash50 = 0;
        int cash100 = 0;
        if (sum % 10 == 0 && sum <= (buffer100 * 100 + buffer50 * 50 + buffer20 * 20)) {
            switch ((sum / 10) % 10) {
                case 1:
                case 3: {
                    if (buffer50 > 0 && sum / 100 > 0) {
                        buffer -= 50;
                        cash50++;
                        buffer50--;
                    } else {
                        System.out.println("Запросите другую сумму");
                        return false;
                    }
                }
                case 5:
                case 7:
                case 9: {
                    if (buffer50 > 0) {
                        buffer -= 50;
                        cash50++;
                        buffer50--;
                    } else {
                        System.out.println("Запросите другую сумму");
                        return false;
                    }
                }
            }
            if (buffer100 > 0 && buffer / 100 > 0) {
                int minimum = Math.min(buffer / 100, buffer100);
                buffer -= minimum * 100;
                cash100 += minimum;
                buffer100 -= minimum;
            }
            if (buffer50 > 1 && buffer / 100 > 0) {
                int minimum = Math.min(buffer / 100, buffer50 / 2);
                buffer -= minimum * 100;
                cash50 += minimum * 2;
                buffer50 -= minimum * 2;
            }
            if (buffer20 > 0 && buffer / 20 > 0) {
                int minimum = Math.min(buffer / 20, buffer20);
                buffer -= minimum * 20;
                cash20 += minimum;
                buffer20 -= minimum;
            }
            if (buffer == 0) {
                setBill100(buffer100);
                setBill50(buffer50);
                setBill20(buffer20);
                System.out.println("Выдача наличных на сумму " + sum + ":");
                System.out.println("\tКупюры 100 -\t" + cash100 + " шт.");
                System.out.println("\tКупюры 50 -\t\t" + cash50 + " шт.");
                System.out.println("\tКупюры 20 -\t\t" + cash20 + " шт.");
                System.out.println("\n\tИтого выдано: " + (cash100 * 100 + cash50 * 50 + cash20 * 20));
            } else return false;
            return true;
        } else {
            System.out.println("Запросите другую сумму");
            return false;
        }
    }
}
