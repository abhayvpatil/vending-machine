package vending_machine.src.java.com.machine.model;


//Enum is the special class that represents a group of predefined constant values.

public enum Coin {

     ONE(1),
     FIVE(5),
     TEN(10),
     TWENTY(20);

     private int value;

     Coin(int value)
     {
        this.value = value;
     }

     public int getValue()
     {
        return value;
     }

}
