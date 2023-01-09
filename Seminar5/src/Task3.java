import java.util.HashSet;
import java.util.Set;

public class Task3 {
    //дан массив чисел.вернуть тру если значения повторяются дважды или вернуть фолс,
    //если значения неповторятся
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
