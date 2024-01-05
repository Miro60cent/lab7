import cars.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    private List<Car> carList;

    @BeforeEach
    void setUp() {
        carList = new LinkedList<>();
    }

    @Test
    void testAddAndGet() {
        Car car1 = new Car("Toyota", "Camry", 2022, 25000.0, 30.0, 120);
        Car car2 = new Car("Honda", "Accord", 2021, 27000.0, 28.0, 125);

        carList.add(car1);
        carList.add(car2);

        assertEquals(2, carList.size());
        assertEquals(car1, carList.get(0));
        assertEquals(car2, carList.get(1));
    }

    @Test
    void testSize() {
        assertEquals(0, carList.size());

        Car car = new Car("Ford", "Fusion", 2023, 24000.0, 32.0, 115);
        carList.add(car);

        assertEquals(1, carList.size());
    }


    @Test
    void testIterator() {
        Car car1 = new Car("Tesla", "Model S", 2023, 80000.0, 25.0, 155);
        Car car2 = new Car("Chevrolet", "Malibu", 2022, 23000.0, 29.0, 115);

        carList.add(car1);
        carList.add(car2);

        int count = 0;
        for (Car car : carList) {
            if (count == 0) {
                assertEquals(car1, car);
            } else if (count == 1) {
                assertEquals(car2, car);
            }
            count++;
        }
    }
}
