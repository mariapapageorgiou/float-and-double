package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;            // the f and d are not necessary, but it is a good practise to do it.
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);


        // CHALLENGE: Convert a given number of pounds to kilograms
        //
        // STEPS:
        // 1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
        // 2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store
        //    the result in a 2nd appropriate variable.
        // 3. Print out the result.
        //
        // HINT: 1 pound is equal to 0.45359237 of a kilogram.

        double numberOfPounds = 100d;
        double poundToKilo = 0.45359237d;
        double convertedKilograms = numberOfPounds * poundToKilo;
        System.out.println("Converted kilograms = " + convertedKilograms);


        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;           // different way of formatting a double with underscores
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
