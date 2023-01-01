import java.util.ArrayList;
import java.util.Collections;

//На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа.
// Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(2);
        list.add(9);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 2 == 0) {
                list1.add(list.get(j));
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, list1.get(k));
                k += 1;
            }
        }
        System.out.println(list);
    }
}