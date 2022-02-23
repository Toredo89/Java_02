package lesson_3;

import java.util.ArrayList;

public class RunClass1 {
    public static void main(String[] args) {

        Box box1 = new Box();

        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        System.out.println("Вес коробки №1: " + box1.getWeight());

        Box box2 = new Box();

        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println("Вес коробки №2: " + box2.getWeight());

        System.out.println("Результат работы метода compare() класса Box, параметры (пример: box1.compare(box2))");
        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");

        System.out.println("В коробке Box1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());

        Box box3 = new Box();

        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());

        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("В коробке Box3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());

        box1.shiftSingleItem(box3);

        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №1: " + box1.getWeight());

        try {
            box2.shiftSingleItem(box3);
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №2: " + box2.getWeight());

        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());


    }



}