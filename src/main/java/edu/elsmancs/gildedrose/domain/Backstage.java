package edu.elsmancs.gildedrose.domain;

public class Backstage extends NormalItem {

    public Backstage(String name, int sell_in, int quality) {
        super(name, sell_in, quality);
    }

    @Override
    public int updateQuality() {
        if (getSell_in() >= 10) {
            computeQuality(1);
        } else if (getSell_in() >= 5) {
            computeQuality(2);
        } else {
            computeQuality(3);
        }
        setSell_in();
        return 0;
    }
}