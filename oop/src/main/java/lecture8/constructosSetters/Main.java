package lecture8.constructosSetters;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", 30);
        person.aging();
        int age = person.getAge();
        System.out.println(age);
    }
}
