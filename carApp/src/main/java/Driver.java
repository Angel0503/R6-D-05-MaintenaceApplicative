public class Driver {
    public static final int ADULTHOOD = 18;
    private String name;
    private int age;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return age >= ADULTHOOD;
    }

    public String getName() { return this.name; }

}
