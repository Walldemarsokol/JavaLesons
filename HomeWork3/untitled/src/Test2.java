//На вход методу приходят два ArrayList<Integer> и целое число num.
//        Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        int num = 5;
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(4);
        list1.add(5);
        list1.add(5);
        list1.add(5);
        System.out.println(list1);
        list2.add(5);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        list2.add(1);
        list2.add(5);
        list2.add(5);
        list2.add(5);
        System.out.println(list2);
        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == num) {
                count += 1;
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) == num) {
                count -= 1;
            }
        }
        if (count == 0) {
            System.out.println("Число num встречается одинаковое кол-во раз.");
        } else {
            System.out.println("Количество совпадений числа num в двух массивах разное.");
        }
    }
}
