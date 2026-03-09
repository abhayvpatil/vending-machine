package vending_machine.src.java.com.machine.slot;

import vending_machine.src.java.com.machine.model.Product;

public class ItemShelf {
    private Product product;
    private int quantity;

    public ItemShelf(Product product, int quantity)
    {
        this.product = product;
        this.quantity =quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity()
    {
        if(quantity>0)
        {
            quantity--;
        }
    }

    public boolean isAvailable()
    {
        return quantity > 0;
    }


}
