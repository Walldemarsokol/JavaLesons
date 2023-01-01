import java.util.ArrayList;

//На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
//        Нужно реализовать алгоритм, не использовать метод equals.
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(1);
        System.out.println(list1);
        list2.add(1);
        list2.add(2);
        list2.add(1);
        list2.add(1);
        System.out.println(list2);
        System.out.println(equals(list1, list2));
    }
    private static boolean equals(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() == list2.size()) {
            int j = 0;
            for (int i = 0; i < list1.size(); i++) {
                while (j < list2.size()) {
                    if (list1.get(i) != list2.get(j)) {
                        return false;
                    } else {
                        j += 1;
                        break;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}







