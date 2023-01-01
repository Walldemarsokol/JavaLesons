import java.util.ArrayList;
import java.util.Iterator;

//На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)
public class Test4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        for (Iterator<Integer> it =
             list.iterator();
             it.hasNext(); ) {
            int n = it.next();
            if (n % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
