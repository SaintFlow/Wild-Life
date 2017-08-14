package commonflow.wildlife;

import org.junit.Test;

import commonflow.wildlife.dummy.Encyclopedia;

import static org.junit.Assert.*;

/**
 * Created by Randy on 8/14/2017.
 */
public class EncyclopediaTest
{
    @Test
    public void hasAnimalTest()
    {
        Encyclopedia ency = new Encyclopedia();
        assertTrue(ency.hasAnimal("Eastern Chipmunk"));
        assertTrue(ency.hasAnimal("Beaver"));
        assertTrue(ency.hasAnimal("Seagull"));
        assertTrue(ency.hasAnimal("Coyote"));
        assertTrue(ency.hasAnimal("Raccoon"));
        assertTrue(ency.hasAnimal("Squirrel"));

        assertFalse("Should not have Elephant", ency.hasAnimal("Elephant"));
    }
}
