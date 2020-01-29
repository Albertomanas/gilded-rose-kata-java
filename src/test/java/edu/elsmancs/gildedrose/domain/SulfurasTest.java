package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.Sulfuras;


public class SulfurasTest {

    @Test
    public void crearSulfuras() {

        Sulfuras sulfuras = new Sulfuras("Pato", 2, 0);
        assertEquals("Pato", sulfuras.getName());
        assertEquals(2, sulfuras.getSell_in(), 0);
        assertEquals(0, sulfuras.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Sulfuras sulfuras = new Sulfuras("Pato", 2, 0);
        System.out.println(sulfuras.toString());
    }

    @Test
    public void arribafifty(){
        Sulfuras sulfuras = new Sulfuras("Pato",40,56);
        assertEquals("Pato", sulfuras.getName());
        assertEquals(40, sulfuras.getSell_in(), 0);
        assertEquals(56, sulfuras.getQuality(), 0);
    }
}
