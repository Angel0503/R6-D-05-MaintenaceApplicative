public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver me = new Driver("John", 20);

        myCar.start(me);
        myCar.accelerate();
        myCar.changeSpeed(80, me);
        myCar.slowDown();
        myCar.changeSpeed(30, me);
        myCar.stop(me);
        System.out.println("fini");
    }
}
