package exercise1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car1 = new Car();
        System.out.print(car1);
        car1.setAll(123, "Toyota", "Corolla",  LocalDate.of(2000, 1, 1), 5);
        System.out.println();
        System.out.print(car1);
    }
}
