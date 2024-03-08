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
    public void testShowDetails() {
        // How to assert the output using AssertJ for console output?
        // Note: Testing console output is often more complex and depends on additional libraries.
    }
}
