public class Person implements Age{
    String name;
    int age;

    public Person (String newname, int newage){
        name = newname;
        age = newage;
    }

    @Override
    public String getAge(String a) {
        return a + age;
    }
}
