
/**
 * Car class.
 */
public class Car {
    /**
     * Cars acceleration value.
     */
    public static final int ACCELERATION = 10;
    /**
     * Car's max speed.
     */
    public static final int MAX_SPEED = 120;
    /**
     * Car's model.
     */
    private String model;
    /**
     * Car's color.
     */
    private String color;
    /**
     * Car's speed.
     */
    private int speed;

    /**
     * Car constructor method.
     * @param model Car's model
     * @param color Car's color
     */
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    /**
     * Get the car's speed.
     * @return Car's speed
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Make the car accelerate.
     */
    public void accelerate() {
        if (speed + ACCELERATION <= MAX_SPEED) {
            speed += ACCELERATION;
            // afficher détails
            showDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    /**
     * Show the details of the car.
     */
    private void showDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }

    /**
     * Make the car slow down.
     */
    public void slowDown() {
        if (speed - ACCELERATION >= 0) {
            speed -= ACCELERATION;
            // afficher détails
            showDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    /**
     * Start the car.
     * @param driver Car's driver
     */
    public void start(Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getName() + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    /**
     * Stop the car.
     * @param driver Car's driver
     */
    public void stop(Driver driver) {
        System.out.println(driver.getName() + " arrête la voiture.");
    }

    /**
     * Change the car's speed.
     * @param newSpeed Car's new speed
     * @param driver Car's driver
     */
    public void changeSpeed(int newSpeed, Driver driver) {
        System.out.println(driver.getName() + " change la vitesse de la voiture à " + newSpeed);
        if (getSpeed() >= newSpeed) {
            while (getSpeed() > newSpeed) {
                slowDown();
            }
        } else  {
            while (getSpeed() < newSpeed) {
                accelerate();
            }
        }
    }
}

