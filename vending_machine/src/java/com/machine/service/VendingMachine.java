package vending_machine.src.java.com.machine.service;

import java.util.ArrayList;
import java.util.List;

import vending_machine.src.java.com.machine.inventory.Inventory;
import vending_machine.src.java.com.machine.model.Coin;
import vending_machine.src.java.com.machine.slot.ItemShelf;

public class VendingMachine {
    private Inventory inventory;
    private List<Coin> insertedCoins;
    
    public VendingMachine()
    {
        inventory = new Inventory();
        insertedCoins = new ArrayList<>();
    }
    
    public void insertCoin(Coin coin)
    {
        insertedCoins.add(coin);
    }

    public int getInsertedAmount()
    {
        int total =0;

        for (Coin coin : insertedCoins) {
            total+=coin.getValue();
        }

        return total;
    }
    public void selectProduct(int slot)
    {
        ItemShelf shelf = inventory.getShelf(slot);
        if(shelf == null || !shelf.isAvailable())
        {
            return;
        }

        int money = getInsertedAmount();
        if(money<shelf.getProduct().getPrice())
        {
            System.out.println("insufficient Amount");
            return;
        }
        dispenseProduct(shelf);
        int change = (int) (money - shelf.getProduct().getPrice());
        if(change>0)
        {
            System.out.println("Return Change : "+change);
        }
        
        insertedCoins.clear();
    }

    private void dispenseProduct(ItemShelf shelf) {
        shelf.reduceQuantity();
        System.out.println("Dispencing : " + shelf.getProduct().getName());
    }
    public Inventory getInventory()
    {
        return inventory;
    }
}
