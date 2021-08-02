/*
This is the generic Item class that is used throughout the whole project for storing the data of the individual
variables. If you wish to modify and create your own custom Item class then set your own new private variables,
modify each of the following methods and their return type that are present in the class.
The functionality of each method in the class can be deduced from the name.
 */



public class Item {
    private int value;

    public Item(){
        this.value = 0;
    }

    public Item(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public boolean equals(Item value){
        return this.value==value.getValue();
    }

    public void printValue(){
        System.out.println(this.value);
    }

    public int hash(){
        return this.value*13+5;
    }

}
