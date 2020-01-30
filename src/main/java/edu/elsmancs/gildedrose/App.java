package edu.elsmancs.gildedrose;


import edu.elsmancs.gildedrose.domain.NormalItem;
import edu.elsmancs.gildedrose.domain.AgedBrie;
import edu.elsmancs.gildedrose.domain.Backstage;
import edu.elsmancs.gildedrose.domain.Conjured;
import edu.elsmancs.gildedrose.domain.Sulfuras;
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido a Ollivanders!" );
        GildedRose shop = new GildedRose();
        NormalItem normalItem = new NormalItem("+5 Dexterity Vest", 10, 0);
        AgedBrie agedBrie = new AgedBrie("Aged Brie", 5,5 );
        Backstage backstage = new Backstage("Backstage", 4,5);
        Conjured conjured = new Conjured("Conjured", 5, 5);
        Sulfuras sulfuras = new Sulfuras("Sulfuras", 6, 6);

        shop.addItem(normalItem);
        shop.addItem(agedBrie);
        shop.addItem(backstage);
        shop.addItem(conjured);
        shop.addItem(sulfuras);


        System.out.println(shop.toString());
        shop.updateQuality();
        System.out.println(shop.toString());
    }


}
