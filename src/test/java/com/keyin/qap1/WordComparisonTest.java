package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WordComparisonTest {

    @Test
    public void wordComparisonTest(){
        Assertions.assertTrue(WordComparison.findSequenceInWord("_char_", "is_find_in_this_char_sequence"));
    }

    @Test
    public void testGetName() {

        WordComparison wordComparison = new WordComparison ("Jamie", "Toronto", "Ontario");

        Assertions.assertSame("Jamie", wordComparison.getName());


        System.out.println("Name = " + wordComparison.getName() + ", condition is True.");

    }

    @Test
    public void testGetCity() {

        WordComparison wordComparison = new WordComparison("Blake", "St.John's", "Newfoundland");

        Assertions.assertNotSame("Edmonton", wordComparison.getCity());

        System.out.println("The City is " + wordComparison.getCity());
    }

    @Test
    public void testGetProvince() {

        WordComparison wordComparison = new WordComparison("Blake", "St.John's", "Newfoundland");

        Assertions.assertNotSame("Alberta", wordComparison.getProvince());

        System.out.println("The Province is " + wordComparison.getProvince());
    }



    @Test
    public void testSetName() {

        WordComparison  wordComparison = new WordComparison ("Jamie", "St.John's", "Newfoundland");

        String result = wordComparison.setName("Blake");

        Assertions.assertEquals("Blake", result);

        System.out.println("The name is suppose to be " + wordComparison.getName());
    }
}
