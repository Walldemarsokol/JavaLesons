package libraryGuide;

public class Main {
    public static void main(String[] args) {


        Reader st1 = new Reader();
        Reader st2 = new Reader();
        Reader st3 = new Reader();

        st1.setName("Сивакин Иван Владимирович");
        st1.setNumber(119);
        st1.setDate("25/09/1998");
        st1.setFacult("Машиностроения");
        st1.setPhone("7 995 514 55 88");
        System.out.println( "\n" + "Студент " + st1.getName() + " с номером читательного билета " + st1.getNumber() + " который учится на факультете " + st1.getFacult() + " зарегистрирован.");
        System.out.println("Дата рождения: " + st1.getDate() + "\n" + "личный номер телефона: " + st1.getPhone());


        st2.setName("Дмитров Максим Генадьевич");
        st2.setNumber(115);
        st2.setDate("12/05/2000");
        st2.setFacult("Машиностроения");
        st2.setPhone("7 962 277 55 88");
        System.out.println("\n" + "Студент " + st2.getName() + " с номером читательного билета " + st2.getNumber() + " который учится на факультете " + st2.getFacult() + " зарегистрирован.");
        System.out.println("Дата рождения: " + st2.getDate() + "\n" + " личный номер телефона: " + st2.getPhone());
        System.out.println();

        st3.setName("Сараеев Дмитрий Павлович");
        st3.setNumber(111);
        st3.setDate("02/11/2001");
        st3.setFacult("Машиностроения");
        st3.setPhone("7 953 852 33 19");
        System.out.println("\n" + "Студент " + st3.getName() + " с номером читательного билета " + st3.getNumber() + " который учится на факультете " + st3.getFacult() + " зарегистрирован.");
        System.out.println("Дата рождения: " + st3.getDate() + "\n" + "личный номер телефона: " + st3.getPhone());
        System.out.println();

        st1.takeBook( "Менеджмент в машиностроении");
        st1.returnBook("Технология машиностроения");

        st2.takeBook("Технология машиностроения. Дистанционный курс");

        st3.takeBook("Технология машиностроения");
        st3.returnBook("Технология машиностроения. Лабораторный практикум");



        st1.info();
        st2.info();
        st3.info();
    }
}