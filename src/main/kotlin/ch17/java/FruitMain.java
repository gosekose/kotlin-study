package ch17.java;

import java.util.ArrayList;
import java.util.List;

public class FruitMain {

    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) fruits.add(new Fruit("사과", 1_000 + i * 100));
            else fruits.add(new Fruit("바나나", 1_000 + i * 200));
        }

        // 사과 가격이 1000보다 작은 물품을 보여주세요
        List<Fruit> under1000 = FruitFilter.filter(fruits, f -> f.getPrice() < 1000);

        System.out.println(under1000.size());

        // 사과 가격이 2000보다 작은 물품을 보여주세요
        List<Fruit> under2000 = FruitFilter.filter(fruits, f -> f.getPrice() < 2_000);
        System.out.println(under2000.size());
    }
}
