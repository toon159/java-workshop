public class Main {
    public static void main(String[] args) {
        Car a = new Car("BMW", 10, 200);
        Person b = new Person("Alice", 30);

        printAge(a);
        printAge(b);

        test();
    }

    static void printAge(Age age) {
        System.out.println(age.getAge("The age is "));
    }

    static void test(){
        System.out.println();
    }

}
