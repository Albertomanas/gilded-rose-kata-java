package edu.elsmancs.gildedrose.domain;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import java.util.List;


public class GildedRoseTest {
    private GildedRose shop = null;
    private NormalItem normalItem = null;
    private AgedBrie agedBrie = null;
    private Backstage backstage = null;
    private Conjured conjured = null;
    private Sulfuras sulfuras = null;

    @Before
    public void SetUpInventario() {
        shop = new GildedRose();
        normalItem = new NormalItem("pato", 20, 20);
        agedBrie = new AgedBrie("aged", 17, 41);
        backstage= new Backstage("backstage", 33, 12);
        conjured = new Conjured("conjured", 14, 9);
        sulfuras = new Sulfuras("sulfuras", 47, 32);
    }
    @Test
    public void ToStringTest() {
        shop.addItem(normalItem);
        normalItem = new NormalItem("pato", 20, 20);
        shop.addItem(normalItem);
        System.out.println("toString() GildedRose test:");
        System.out.println(shop.toString());
    }

    @Test
    public void addItemTest(){
        shop.addItem(normalItem);
        shop.addItem(agedBrie);
        shop.addItem(backstage);
        shop.addItem(conjured);
        shop.addItem(sulfuras);
        assertEquals(5, shop.inventory().size(), 0);
        List<NormalItem> items = List.of(normalItem, agedBrie, backstage, conjured, sulfuras);
        assertArrayEquals(items.toArray(), shop.inventory().toArray());

        System.out.println("GildedRose addItem test:");
        System.out.println(shop.toString());
    }

    @Test
    public void updateQuality() {
        shop.addItem(normalItem);
        shop.addItem(agedBrie);
        shop.addItem(backstage);
        shop.addItem(conjured);
        shop.addItem(sulfuras);
        assertEquals(5, shop.inventory().size(), 0);
        System.out.println("Día 0:" + '\n' + shop.toString());
        shop.updateQuality();
        assertEquals(19, shop.inventory().get(0).getQuality(), 0);
        assertEquals(42, shop.inventory().get(1).getQuality(), 0);
        assertEquals(13, shop.inventory().get(2).getQuality(), 0);
        assertEquals(7, shop.inventory().get(3).getQuality(), 0);
        assertEquals(32, shop.inventory().get(4).getQuality(), 0);

        System.out.println("Dia 1:" + '\n' + shop.toString());
    }
}
