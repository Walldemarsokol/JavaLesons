public class Person {
    //есть значения по умолчанию:
    // для ссылочного типа null
    // для примитива 0
    String name; // поля(свойства) они будут уникальны для каждого объекта
    int age;
    // конструктор - это функция, имя которой совпадает с именем класса
    // есть конструктор по умолчанию

    public Person( String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(){

    }
    //локальные параметры перезатирают другие переменные
    public static void main(String[] args) {
        Person vlad = new Person();//это конструктор - он создает объект
        vlad.name = "Vlad";
        vlad.age = 29;
        System.out.println(vlad.name);
        System.out.println(vlad.age);

        Person some = new Person();
        some.name = "Some";
        some.age = Integer.MAX_VALUE;
        System.out.println(some.name);
        System.out.println(some.age); 
    }
}
