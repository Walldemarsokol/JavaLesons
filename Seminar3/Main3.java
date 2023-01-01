import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создайте массив String[]. Из него получите ArrayList<String>
//используйте метод Arrays.asList.
//        Попробуйте в получившийся ArrayList<String> добавить новую строку,
//        что произойдет?
//Arrays.asList создает массив,который нельзя модифицировать(неизменяемый)
// что бы можно было его модифицировать необходимо создать другой массив(коллекцию)
// и поместить предыдущий уже в него
public class Main3 {
    public static void main(String[] args) {
        String[] array = {"asdasd", "qwe", "123123", "123asd0"};
        List<String> list = Arrays.asList(array);
        List<String> modelist1 = new ArrayList<>(list);
        System.out.println(list);
        modelist1.add(1, "qweqwrqrqwr");
        System.out.println(modelist1);

    }
}
