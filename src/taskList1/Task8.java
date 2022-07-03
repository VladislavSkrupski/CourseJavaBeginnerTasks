package taskList1;

import java.util.Scanner;
public class Task8 {
    /*
      Задача 8
      Количество баллов: 25
      Локатор ориентирован на одну из сторон света («С» – север, «З» – запад, «Ю» – юг, «В» – восток) и может принимать одну из трех цифровых команд:
      -1 – поворот налево, 1 – поворот направо, 2 – поворот на 180 градусов. Дан символ Х – исходная ориентация локатора
      и число N – посланная ему команда. Вывести ориентацию локатора после выполнения команды.
      Пример: Х = ‘В’, N = ‘2’, после выполнения команды ориентация будет ‘З’
     */
    public static void main(String[] args) {

        String X, N;
        int position=4;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите исходную ориентацию локатора (С, В, Ю или З):");
        do {
            X = in.nextLine();
            if (X.equals("С")||X.equals("В")||X.equals("Ю")||X.equals("З")) break;
            else System.out.println("можно ввести только С, В, Ю или З");
        } while (true);

        System.out.println("Введите команду (-1, 1 или 2):");
        do {
            N = in.nextLine();
            if (N.equals("-1")||N.equals("1")||N.equals("2")) break;
            else System.out.println("можно ввести только -1, 1 или 2");
        } while (true);
        in.close();

        switch (X){
            case "С":{ position=0; break; }
            case "В":{ position=1; break; }
            case "Ю":{ position=2; break; }
            case "З":{ position=3; break; }
        }

        if (position!=4) {
            position=(position+Integer.valueOf(N)+4)%4;
            switch (position){
                case 0: { System.out.println("Новое направление \'C\'"); break; }
                case 1: { System.out.println("Новое направление \'В\'"); break; }
                case 2: { System.out.println("Новое направление \'Ю\'"); break; }
                case 3: { System.out.println("Новое направление \'З\'"); break; }
            }
        }

//        final char NORTH='С', WEST='З', EAST ='В', SOUTH ='Ю';
//        final byte LEFT=-1, RIGHT=1, HALFTURN=2;
//        char X='С';
//        byte N=2;
//        switch (X){
//            case NORTH:{
//                switch (N){
//                    case LEFT: { System.out.println("Новое направление " + WEST); break; }
//                    case RIGHT: { System.out.println("Новое направление " + EAST); break; }
//                    case HALFTURN: { System.out.println("Новое направление " + SOUTH); break; }
//                    default: System.out.println("Нет такой команды");
//                }
//                break;
//            }
//            case EAST:{
//                switch (N){
//                    case LEFT: { System.out.println("Новое направление " + NORTH); break; }
//                    case RIGHT: { System.out.println("Новое направление " + SOUTH); break; }
//                    case HALFTURN: { System.out.println("Новое направление " + WEST); break; }
//                    default: System.out.println("Нет такой команды");
//                }
//                break;
//            }
//            case SOUTH:{
//                switch (N){
//                    case LEFT: { System.out.println("Новое направление " + EAST); break; }
//                    case RIGHT: { System.out.println("Новое направление " + WEST); break; }
//                    case HALFTURN: { System.out.println("Новое направление " + NORTH); break; }
//                    default: System.out.println("Нет такой команды");
//                }
//                break;
//            }
//            case WEST:{
//                switch (N){
//                    case LEFT: { System.out.println("Новое направление " + SOUTH); break; }
//                    case RIGHT: { System.out.println("Новое направление " + NORTH); break; }
//                    case HALFTURN: { System.out.println("Новое направление " + EAST); break; }
//                    default: System.out.println("Нет такой команды");
//                }
//                break;
//            }
//            default: System.out.println("Нет такого направления");
//        }
    }
}
