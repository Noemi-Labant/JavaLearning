package StreamApi;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Main {
    public static void main(String[] args) {
        Car Audi = new Car("black", 1500, false);
        Car Mazda = new Car("mauve", 1000, false);
        Car VolkswagenEUp = new Car("white", 800, true);
        Car RenaultZoe = new Car("blue", 1200, true);
        Car JaguarPace = new Car("grey", 1100, true);

        List<Car> cars = new ArrayList<Car>();
        cars.add(Audi);
        cars.add(Mazda);
        cars.add(VolkswagenEUp);
        cars.add(RenaultZoe);
        cars.add(JaguarPace);

        Set<Car> cars1 = new java.util.HashSet<>();
        cars1.add(Audi);
        cars1.add(Mazda);
        cars1.add(VolkswagenEUp);
        cars1.add(RenaultZoe);
        cars1.add(JaguarPace);

        Exercise2(cars);
        Exercise3(cars1);

    }



    private static void Exercise2(List<Car> cars) {
        cars
        .stream()
        .filter(car -> car.getColor().startsWith("m") && car.getColor().contains("a"))
        .forEach(car -> System.out.println(car.getColor()));
    }

    private static void Exercise3(Set<Car> cars) {
        Optional<Car> minWeightCar = cars
                .stream()
                .min(Comparator.comparing(Car::getWeight));
        System.out.println(minWeightCar.get().getWeight());
    }
}
