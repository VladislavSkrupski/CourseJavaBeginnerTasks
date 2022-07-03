package taskList3.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println("Добро пожаловать!");
        do {
            int choice;
            System.out.println("\nБаланс АТМ:");
            System.out.println("100: " + atm.getBill100() + "\t50: " + atm.getBill50() + "\t20: " + atm.getBill20());
            System.out.println("Всего в наличии: " + (atm.getBill100() * 100 + atm.getBill50() * 50 + atm.getBill20() * 20) + "\n");
            System.out.print("Какую операцию желаете осуществить?\nЧтобы внести деньги покупюрно нажмите\t1\nЧтобы снять деньги нажмите\t\t\t\t2\nЧтобы завершить работу нажмите\t\t\t3\n");
            try {
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Неверный ввод. Можно ввести только 1,2 или 3");
                continue;
            }
            switch (choice) {
                case 1: {
                    int clientBill100 = 0, clientBill50 = 0, clientBill20 = 0;
                    System.out.print("количество банкнот с номиналом 100: ");
                    clientBill100 = SetClientInput();
                    System.out.print("количество банкнот с номиналом 50: ");
                    clientBill50 = SetClientInput();
                    System.out.print("количество банкнот с номиналом 20: ");
                    clientBill20 = SetClientInput();
                    atm.inputMoney(clientBill100, clientBill50, clientBill20);
                    break;
                }
                case 2: {
                    System.out.print("Введите желаемую сумму: ");
                    if (atm.outputMoney(SetClientInput()))
                        System.out.println("Операция выполнена успешно");
                    else
                        System.out.println("Операция провалена");
                    break;
                }
                case 3:
                    break;
                default: {
                    System.out.println("Неверный ввод. Можно ввести только 1,2 или 3");
                }
            }
            if (choice == 3) break;
        } while (true);
    }

    static int SetClientInput() {
        int input;
        do {
            input = 0;
            try {
                Scanner scanner = new Scanner(System.in);
                input = scanner.nextInt();
                if (input >= 0) break;
                else {
                    System.out.println("Можно ввести только целое число от 0 и более");
                    continue;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Можно ввести только целое число от 0 и более");
                continue;
            }
        } while (true);
        return input;
    }
}

