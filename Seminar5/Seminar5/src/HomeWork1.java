import java.util.*;

public class HomeWork1 {
    //Имея два массива строк words1 и words2,
    // вернуть количество строк, встречающихся
    // ровно один раз в каждом из двух массивов.
    public static void main(String[] args) {

    }

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> cnt1 = new HashMap();
        Map<String, Integer> cnt2 = new HashMap();
        cnt1 = count(words1);
        cnt2 = count(words2);
        int ans = 0;
        for (String w : words1) {
            if (cnt1.getOrDefault(w, 0) == 1 && cnt2.getOrDefault(w, 0) == 1) {
                ans += 1;
            }
        }
        return ans;
    }

    public Map<String, Integer> count(String[] words) {
        Map<String, Integer> cnt = new HashMap<>();
        for (String w : words) {
            cnt.put(w, cnt.getOrDefault(w, 0) + 1);
        }
        return cnt;
    }
}
