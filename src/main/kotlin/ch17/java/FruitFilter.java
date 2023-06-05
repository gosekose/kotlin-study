package ch17.java;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FruitFilter {

    static public List<Fruit> filter(List<Fruit> fruits, Predicate<Fruit> predicate) {
        return fruits.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
