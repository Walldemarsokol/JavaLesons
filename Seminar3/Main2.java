import java.util.ArrayList;

//Создайте массив с “сырым типом”, добавьте туда
//        разные типы данных. Удалите только числа.


//необходимо использовать Iterator
public class Main2 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add("hchjcg");
        array.add(123123);
        array.add("qweqwe");
        array.removeIf(current -> current instanceof Integer);
        System.out.println(array);
    }
}
