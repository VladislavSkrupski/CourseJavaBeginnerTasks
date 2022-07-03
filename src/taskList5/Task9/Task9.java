package taskList5.Task9;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
    Задача 9
    Количество баллов: 15
    Создать переменную типа Calendar с первоначальной датой 1 января 1970 года. Добавить к этой дате 85 дней. Вывести дату в консоль.
 */
public class Task9 {
    public static void main(String[] args) {
        int month;
        String textMonth = "";
        Calendar calendar = new GregorianCalendar();
        calendar.set(1970,Calendar.JANUARY,1);
        calendar.add(Calendar.DATE, 85);
        month = calendar.get(Calendar.MONTH);
        switch (month){
            case 0:{textMonth="января";break;}
            case 1:{textMonth="февраля";break;}
            case 2:{textMonth="марта";break;}
            case 3:{textMonth="апреля";break;}
            case 4:{textMonth="мая";break;}
            case 5:{textMonth="июня";break;}
            case 6:{textMonth="июля";break;}
            case 7:{textMonth="августа";break;}
            case 8:{textMonth="сентября";break;}
            case 9:{textMonth="октября";break;}
            case 10:{textMonth="ноября";break;}
            case 11:{textMonth="декабря";break;}
        }
        System.out.println(calendar.get(Calendar.DATE) + " " + textMonth + " " + calendar.get(Calendar.YEAR) + " года");

    }
}
