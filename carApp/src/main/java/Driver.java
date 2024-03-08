
/**
 * Driver class.
 */
public class Driver {
    /**
     * Driver's adulthood age value.
     */
    public static final int ADULTHOOD = 18;
    /**
     * Driver's name.
     */
    private String name;
    /**
     * Driver's age.
     */
    private int age;

    /**
     * Driver's constructor method.
     * @param name Driver's name
     * @param years Driver's age
     */
    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    /**
     * Check if driver is adult.
     * @return True if driver's age > ADULTHOOD else False
     */
    public boolean isAdult() {
        return age >= ADULTHOOD;
    }

    /**
     * Get driver's name.
     * @return Driver's name
     */
    public String getName() { return this.name; }
}
