// public class program {
//     public static void main(String[] args) {
//         System.out.println("Bye world");
//     }
// }

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age);
//         System.out.println(salary);
//     }
// }
// class Program
// {
//   public static void main(String[] args) {
//       float e = 2.7f;
//       double pi = 3.1415;
//       System.out.println(e);        // 2.7
//       System.out.println(pi);       // 3.1415
//   }
// }

// class Program
// {
//   public static void main(String[] args) {
//       char ch = '1';
//       System.out.println(Character.isDigit(ch));  // true
//       ch = 'a';
//       System.out.println(Character.isDigit(ch));  // false
//   }
// }

// public class program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1);  // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2);  // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3);  // false
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         String msg ="Hello world";
//         System.out.println(msg); // Hello world
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);  // 123
//         var d = 123.456;
//         System.out.println(d);  // 123.456
//         System.out.println(getType(a));  // Integer
//         System.out.println(getType(d));  // Double
//         d = 1022;
//         System.out.println(d);  // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     } 
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

// class Program
// {
//   public static void main(String[] args) {
//       System.out.println(Integer.MAX_VALUE); // 2147483647
//       System.out.println(Integer.MIN_VALUE); // -2147483648
//   }
// }
//Операторы
// Присваивание: =

// Арифметические: *, /, +, -, %, ++, --

// Операции сравнения: <, >, ==, !=, >=, <=

// Логические операции:  ||, &&, ^, !

// Побитовые операции <<, >>, &, |, ^

//Массивы
//Одномерные
// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10

//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5
//     }
// }
//Двумерные
// public class program {
//     public static void main(String[] args) {

//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

// public class Program {
//     public static void main(String[] args) {

//         int[][] arr = new int[3][5];
       
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

//Неявные преобразования
// public class program {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i);  // 123
//         System.out.println(d);  // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d);  // 3.1415
//         System.out.println(i);  // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d);  // 3.9415
//         System.out.println(i);  // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b);  // 123
//         b = Byte.parseByte("1234");
//         System.out.println(b);  // NumberFormatException: Value out of range
//     }
//  }
//Получаем данные из терминала
//строки
// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();
//    }
// }
//примитивы
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
// }}

// Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);       
//        int i = iScanner.nextInt();
//        System.out.println(i);       
//        iScanner.close();
//    } }
//Форматированный вывод
// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }
// public class Program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }
//Виды спецификаторов

// %d: целочисленных значений

// %x: для вывода шестнадцатеричных чисел

// %f: для вывода чисел с плавающей точкой

// %e: для вывода чисел в экспоненциальной форме, 
// например, 3.1415e+01

// %c: для вывода одиночного символа

// %s: для вывода строковых значений
// public class Program {
//     public static void main(String[] args) {
       
//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi);    // 3,141500
//         System.out.printf("%.2f\n", pi);  // 3,14
//         System.out.printf("%.3f\n", pi);  // 3,141
//         System.out.printf("%e\n", pi);    // 3,141500e+00
//         System.out.printf("%.2e\n", pi);  // 3,14e+00
//         System.out.printf("%.3e\n", pi);  // 3,141e+00
//     }
// }
//область видимости переменных
// public class Program {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);           
//         }     
//         System.out.println(i);  // error: cannot find symbol
//     }
//  }
// public class program {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);           
//         }     
                // int o = 1244
//         System.out.println(o);  // 1244
//     }
//  }
//Методы
// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }  
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }}
//Управляющие конструкции:условный оператор
// public class Program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// public class Program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
//         if (a > b) c = a;
//         if (b > a) c = b;

//         System.out.println(c);
//     }
// }
//Тернарный оператор
// public class Program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int min = a < b ? a : b;
//         System.out.println(min);
//     }
// }
//Оператор выбора
// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         int mounth = value;
//         String text = "";
//         switch (mounth) {
//             case 1:
//                 text = "Autumn";
//                 break;
// 		...
//             default:
//                 text = "mistake";
//                 break;
//         }
//         System.out.println(text);
//         iScanner.close();
//     }
// }

// В java доступны следующие циклы:
// цикл while;
// цикл do while;
// цикл for; и его модификация for in

//Цикл while
// public class Program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

//Цикл do while
// public class Program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }

//continue, break
// Операторы для управления циклами — continue и break.
// Выполнение следующей итерации цикла — continue.
// Прерывание текущей итерации цикла — break. 
// * ближайшего к оператору

//Оператор цикла for
// public class Program {
//     public static void main(String[] args) {

//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }
//Вложенные циклы
// public class Program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//         // * * * * *
//     }
// }

//for: 
//работает только для коллекций
// public class Program {
//     public static void main(String[] args) {

//         int arr[] = new int[10];
//         for (int item : arr) {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int arr[] = new int[] {1,2,3,4,5,77};
//         for (int item : arr) {
//             System.out.println(item);
//         }
//     }
// }

//Работа с файлами
//Создание и запись\дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class Program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } }
//Чтение.Вариант посимвольно
// import java.io.*;
// public class Program {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     } }

//     import java.io.*;
// //Вариант чтения построчно
// public class Program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }