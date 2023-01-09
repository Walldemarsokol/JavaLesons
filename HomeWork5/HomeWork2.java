import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork2 {
    public static void main(String[] args) {

    }

    //Учитывая список путей информации о каталоге, включая путь к каталогу,
// и все файлы с содержимым в этом каталоге, вернуть все дубликаты файлов
// в файловой системе с точки зрения их путей. Вы можете вернуть ответ в любом порядке.
//
//Группа файлов-дубликатов состоит как минимум из двух файлов с одинаковым содержимым.
//
//Одна информационная строка каталога во входном списке имеет следующий формат:
//
//"root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
//Это означает, что в каталоге "root/d1/d2/.../dm"
// имеется n файлов (f1.txt, f2.txt ... fn.txt)
// с содержимым (f1_content, f2_content ... fn_content) соответственно.
// Обратите внимание, что n >= 1 и m >= 0. Если m = 0, это означает,
// что каталог является просто корневым каталогом.
//
//Результатом является список групп повторяющихся путей к файлам.
// Для каждой группы он содержит все пути к файлам с одинаковым содержимым.
// Путь к файлу — это строка, имеющая следующий формат:
//
//"путь_каталога/имя_файла.txt"
    public List<List<String>> findDuplicate(String[] paths) {

        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] values = path.split(" ");
            for (int i = 0; i < values.length; i++) {
                String[] name_count = values[i].split("\\(");
                name_count[1] = name_count[1].replace(")", "");
                List<String> list = map.getOrDefault(name_count[1], new ArrayList<String>());
                list.add(values[0] + "/" + name_count[0]);
                map.put(name_count[1], list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String kew : map.keySet()) {
            if (map.get(key).size() > 1) {
                res.add(map.get(key));
            }
        }
        return res;
    }
}