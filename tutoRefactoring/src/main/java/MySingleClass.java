import java.time.LocalDate;

public class MySingleClass {

    public MySingleClass() {
    }

    /**
     * Additionne firstParameter et secondParameter
     * @param firstParameter - premier paramètre
     * @param secondParameter - second paramètre
     * @return
     */
    public int add(int firstParameter, int secondParameter) {
        return firstParameter + secondParameter ;
    }

    public static void main(String[] args) {
        new MySingleClass().add(1,2);

        System.out.println("Hello world");

        if (DateUtils.isNowBetween(LocalDate.now(), LocalDate.of(2024, 01, 01),
                                                    LocalDate.of(2024, 12, 31))){
            System.out.println("Oui");
        }
        else {
            System.out.println("Non");
        }
    }

}