package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.elsmancs.gildedrose.domain.AgedBrie;


public class BackstageTest {

    @Test
    public void crearBackstage() {

        Backstage backstage = new Backstage("Backstage", 2, 0);
        assertEquals("Backstage", backstage.getName());
        assertEquals(2, backstage.getSell_in(), 0);
        assertEquals(0, backstage.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Backstage backstage = new Backstage("Backstage", 2, 0);
        System.out.println(backstage.toString());
    }

    @Test
    public void updateQualitybackstageItem() {

        Backstage backstage = new Backstage("Backstage", 40, 30);
        backstage.updateQuality();
        assertEquals(39, backstage.getSell_in(), 0);
        assertEquals(31, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualitybackstageItemSellInCERO() {

        Backstage backstage = new Backstage("Backstage", 0, 30);
        backstage.updateQuality();
        assertEquals(-1, backstage.getSell_in(), 0);
        assertEquals(33, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualitybackstageItemBajoCERO() {

        Backstage backstage = new Backstage("Backstage", -1, 30);
        backstage.updateQuality();
        assertEquals(-2, backstage.getSell_in(), 0);
        assertEquals(33, backstage.getQuality(), 0);
    }

    @Test
    public void updateBackstageSellInFive() {

        Backstage backstage = new Backstage("Backstage", 5, 30);
        backstage.updateQuality();
        assertEquals(4, backstage.getSell_in(), 0);
        assertEquals(32, backstage.getQuality(), 0);
    }

    @Test
    public void updateBackstageSellOverTen() {

        Backstage backstage = new Backstage("Backstage", 10, 30);
        backstage.updateQuality();
        assertEquals(9, backstage.getSell_in(), 0);
        assertEquals(31, backstage.getQuality(), 0);
    }

    @Test
    public void updateBackstageFifty() {

        Backstage backstage = new Backstage("Backstage", 10, 87);
        backstage.updateQuality();
        assertEquals(9, backstage.getSell_in(), 0);
        assertEquals(50, backstage.getQuality(), 0);
    }

}