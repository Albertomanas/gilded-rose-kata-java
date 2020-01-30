package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.Conjured;


public class ConjuredTest {

    @Test
    public void crearConjured() {

        Conjured conjured = new Conjured("Ornitorrinco", 2, 0);
        assertEquals("Ornitorrinco", conjured.getName());
        assertEquals(2, conjured.getSell_in(), 0);
        assertEquals(0, conjured.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Conjured conjured = new Conjured("Ornitorrinco", 2, 0);
        System.out.println(conjured.toString());
    }

    @Test
    public void updateQualityConjured() {

        Conjured conjured = new Conjured("Ornitorrinco", 20,30);
        conjured.updateQuality();
        assertEquals(19, conjured.getSell_in(), 0);
        assertEquals(28, conjured.getQuality(), 0);
    }

    @Test
    public void updateQualityConjuredItemSellInCERO() {

        Conjured conjured = new Conjured("Ornitorrinco", 0, 10);
        conjured.updateQuality();
        assertEquals(-1, conjured.getSell_in(), 0);
        assertEquals(8, conjured.getQuality(), 0);
    }

    @Test
    public void updateQualityConjuredItemBajoCERO() {

        Conjured conjured = new Conjured("Ornitorrinco", 10, 0);
        conjured.updateQuality();
        assertEquals(9, conjured.getSell_in(), 0);
        assertEquals(0, conjured.getQuality(), 0);
    }

    @Test
    public void updateConjuredFifty() {

        Conjured conjured = new Conjured("Ornitorrinco", 10, 58);
        conjured.updateQuality();
        assertEquals(9, conjured.getSell_in(), 0);
        assertEquals(50, conjured.getQuality(), 0);
    }


}
