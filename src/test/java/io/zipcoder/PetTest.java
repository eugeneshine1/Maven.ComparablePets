package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class PetTest {
    @Test
    public void testCompare() {
        Pet [] pets = new Pet[3];
        Fish fish = new Fish("blob");
        for (int i = 0; i < pets.length - 1; i++) {
            pets[i] = new Pet(fish.name);
        }

        pets[2] = fish;
        String given = "blob";

        Arrays.sort(pets);
        String actual = pets[2].getName();
        Assert.assertEquals(given,actual);
    }
}
