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

    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Car car) {
        System.out.println(name + " arrête la voiture.");
    }

    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        int vitesseActuelle;
        if (car.getSpeed() >= newSpeed) {
            while (car.getSpeed() > newSpeed) {
                car.slowDown();
            }
        } else  {
            while (car.getSpeed() < newSpeed) {
                car.accelerate();
            }
        }
    }
}
