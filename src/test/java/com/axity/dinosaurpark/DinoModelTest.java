package com.axity.dinosaurpark;

import com.axity.dinosaurpark.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DinoModelTest {
    @Test
    void testDinoSubclasses() {
        Dinosaur rex = new CarnivoreDinosaur(1, "T-Rex");
        Dinosaur trice = new HerbivoreDinosaur(2, "Triceratops");

        assertEquals("Carne", rex.getDiet());
        assertEquals("Plantas", trice.getDiet());
        assertEquals(DinosaurStatus.IN_ENCLOSURE, rex.getStatus());

        rex.setStatus(DinosaurStatus.ESCAPED);
        assertEquals(DinosaurStatus.ESCAPED, rex.getStatus());
    }
}