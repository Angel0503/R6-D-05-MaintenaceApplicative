import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerate() {
        car.accelerate();
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testSlowDown() {
        car.accelerate();
        car.slowDown();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testStartCar() {
        Driver driver = new Driver("John", 20);
        Car car = new Car("Sedan", "Bleu");
        car.start(driver);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        Driver driver = new Driver("John", 20);
        Car car = new Car("Sedan", "Bleu");
        car.stop(driver);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangeSpeed() {
        Driver driver = new Driver("John", 20);
        Car car = new Car("Sedan", "Bleu");

        car.changeSpeed(80, driver);
        assertThat(car.getSpeed()).isEqualTo(80);
    }

    @Test
    public void testShowDetails() {
        // How to assert the output using AssertJ for console output?
        // Note: Testing console output is often more complex and depends on additional libraries.
    }
}
