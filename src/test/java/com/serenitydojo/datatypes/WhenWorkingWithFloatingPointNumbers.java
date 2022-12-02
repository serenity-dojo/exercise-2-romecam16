package com.serenitydojo.datatypes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbers {

    //
    // Exercise 1: Convert 27 degrees Celsius to Fahrenheit
    // The equation is: fahrenheit = (9 / 5) * celsius + 32
    //
    @Test
    public void convertToFahrenheit() {
        double celsius = 27.0d;
        double fahrenheit = 0.0d;
        double equivalenceFahrenheitToCelsius = 9.0/5.0;
        fahrenheit = equivalenceFahrenheitToCelsius*celsius + 32;

        // TODO: Use a floating point calculation to calculate the fahrenheit equivalent of the celsius value.

        assertThat(fahrenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertKilogramsToPounds() {
        int weightInKilograms = 50;
        double weightInPounds = 0;
        double equivalenceKgToPound = 2.20462;

        weightInPounds = weightInKilograms * equivalenceKgToPound;

        // TODO: Use a floating point calculation to calculate the correct weight in pounds

        assertThat(weightInPounds, equalTo(110.231));

    }
}
