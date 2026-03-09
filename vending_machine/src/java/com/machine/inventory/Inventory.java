package vending_machine.src.java.com.machine.inventory;

import java.util.HashMap;
import java.util.Map;
import vending_machine.src.java.com.machine.slot.ItemShelf;

public class Inventory {

    private Map<Integer, ItemShelf> shelves = new HashMap<>();
    
    public void addShelf(int slot, ItemShelf shelf)
    {
        shelves.put(slot, shelf);
    }

    public ItemShelf getShelf(int slot)
    {
        return shelves.get(slot);
    }

}
