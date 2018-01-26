package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // While loops allows code to be executed repeatedly based on a given Boolean condition

        boolean whileCondition = true;
        int count = 0;

        while(whileCondition){
            System.out.println("Our while condition is true. Adding 1 to our count");
            count = count + 1;
            if(count == 3) {
                System.out.println("Our count is at 3");
                whileCondition = false;
            }
        }

        //Do While is an exit-condition loop. This means that the code must always be executed first and then the
        // expression or test condition is evaluated. If it is true, the code executes the body of the loop again.

        boolean doWhileCondition = true;
        count= 0;

        do {
            System.out.println("Our do while condition is true. adding 1 to our count.");
            count = count +1;
            if(count == 3) {
                System.out.println("Our count is at 3");
                doWhileCondition = false;
            }
        } while (doWhileCondition);

        //For loops is a control flow statement for specifying iteration, which allows code to be executed repeatedly.

        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        //Foreach used with arrays, print each "" that has the contained content that is searched for

        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Strawberry");
        fruit.add("Grape");

        for(String food : fruit) {
            if (food.contains("b") || food.contains("B")) {
                System.out.println(food);
            }
        }
    }
}
