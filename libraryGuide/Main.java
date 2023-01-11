package libraryGuide;

public class Main {
    public static void main(String[] args) {


        Reader st1 = new Reader();
        Reader st2 = new Reader();
        Reader st3 = new Reader();

        st1.setName("Борзов Виталий Олегович");
        st1.setNumber(119);
        st1.setDate("11/10/1997");
        st1.setFacult("Программирование и информатика");
        st1.setPhone("7 999 789 56 23");
        System.out.println( "\n" + "Студент " + st1.getName() + " с номером читательного билета " + st1.getNumber() + " который учится на факультете " + st1.getFacult() + " зарегистрирован.");
        System.out.println("Дата рождения: " + st1.getDate() + "\n" + "личный номер телефона: " + st1.getPhone());


        st2.setName("Чистяков Максим Владимирович");
        st2.setNumber(115);
        st2.setDate("05/01/1998");
        st2.setFacult("Программирование и информатика");
        st2.setPhone("7 953 504 14 14");
        System.out.println("\n" + "Студент " + st2.getName() + " с номером читательного билета " + st2.getNumber() + " который учится на факультете " + st2.getFacult() + " зарегистрирован.");
        System.out.println("Дата рождения: " + st2.getDate() + "\n" + " личный номер телефона: " + st2.getPhone());
        System.out.println();

        st3.setName("Иванов Иван Иванович");
        st3.setNumber(111);
        st3.setDate("01/04/2000");
        st3.setFacult("Программирование и информатика");
        st3.setPhone("7 999 456 23 12");
        System.out.println("\n" + "Студент " + st3.getName() + " с номером читательного билета " + st3.getNumber() + " который учится на факультете " + st3.getFacult() + " зарегистрирован.");
        System.out.println("Дата рождения: " + st3.getDate() + "\n" + "личный номер телефона: " + st3.getPhone());
        System.out.println();

        st1.takeBook( "Математика для программистов");
        st1.returnBook("Грокаем алгоритмы");

        st2.takeBook("Инжинерия цифровых технологий");

        st3.takeBook("Программирование для чайников");
        st3.returnBook("Структура цифровых процессов баз данных");



        st1.info();
        st2.info();
        st3.info();
    }
}