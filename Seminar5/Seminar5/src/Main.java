import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<String,Integer> map = new HashMap<>();
        String text = "sssddd asds asdds afggdf aa aa aa aa aa";
        String[] words = text.split("");
        for(String word: words) {
//            if (map.containsKey(word)){
//                map.put(word, map.get(word)+1);
//            }else{
//                map.put(word,1);
//            }
            map.putIfAbsent(word, 0);//положи,если нет
            map.put(word, map.get(word) + 1);
        }
        System.out.println(map);
    }
}