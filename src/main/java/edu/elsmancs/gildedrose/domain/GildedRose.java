package edu.elsmancs.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<NormalItem> inventory = new ArrayList<NormalItem>();

    public List<NormalItem> inventory() {
        return this.inventory;
    }

// Añadir item en la ArrayList llamada inventory
    public void addItem(NormalItem item) {
        inventory().add(item);
    }

//Update quality de la Array inventory
    public void updateQuality() {
        for (NormalItem item : inventory()) {
            item.updateQuality();
        }
    }

public String toString() {
        StringBuilder representation = new StringBuilder();
        for (NormalItem item : inventory()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
}
}
