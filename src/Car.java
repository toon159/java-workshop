public class Car implements Age {
    String model;
    int age;
    int topspeed;

    public Car(String newmodel, int newage, int newtopspeed) {
        model = newmodel;
        age = newage;
        topspeed = newtopspeed;
    }

    @Override
    public String getAge(String a) {
        return a + age;
    }
}
