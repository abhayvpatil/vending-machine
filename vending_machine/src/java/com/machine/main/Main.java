package vending_machine.src.java.com.machine.main;

import vending_machine.src.java.com.machine.model.Coin;
import vending_machine.src.java.com.machine.model.Product;
import vending_machine.src.java.com.machine.service.VendingMachine;
import vending_machine.src.java.com.machine.slot.ItemShelf;

//Testing the vending machine application
public class Main {
    
    public static void main(String args[])
    {
        VendingMachine machine = new VendingMachine();

        Product coke = new Product("Coke",30);
        Product lays = new Product("Lays",20);

        machine.getInventory().addShelf(1,new ItemShelf(coke,10));
        machine.getInventory().addShelf(2,new ItemShelf(lays,20));

        machine.insertCoin(Coin.TEN);
        machine.insertCoin(Coin.TWENTY);

        machine.selectProduct(1);
    }
}
