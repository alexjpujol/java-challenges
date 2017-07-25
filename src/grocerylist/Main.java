package grocerylist;

public class Main {



    public static void main(String[] args) {

        GroceryList myList = new GroceryList();

        myList.addGroceryItem("Cream of Wheat");
        myList.addGroceryItem("Eggs");
        myList.addGroceryItem("Rib Eye Steak");
        myList.modifyGroceryItem("Eggs", "Free Range Eggs");
        myList.modifyGroceryItem("Rib Eye Steak", "Grass Fed Rib Eye Steak");
        myList.removeGroceryItem("Chicken");
        myList.findItem("Cream of Wheat");

        myList.printGroceryList();
    }


}
