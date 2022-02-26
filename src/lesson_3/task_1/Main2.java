package lesson_3.task_1;

import java.util.Arrays;

public class Main2 {

    static String[] arrayString = {"1", "2", "3", "4"};


    public static void main(String[] args) {
        SwapArrayClass<Object> swapArrayClass = new SwapArrayClass<>();
            System.out.println(Arrays.toString(swapArrayClass.swapElements(arrayString, 0, 3)));
        }
    }

