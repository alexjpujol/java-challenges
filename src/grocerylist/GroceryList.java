package grocerylist;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void removeGroceryItem(String item) {
        groceryList.remove(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + "." + " " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
//        boolean exists = groceryList.contains(oldItem);
        int position = groceryList.indexOf(oldItem);
        if (position <= 0) {
            groceryList.set(position, newItem);
            System.out.println("You have modified " + oldItem + " to " + newItem);
        } else {
            System.out.println("That item isn't in the list");
        }
    }

    public void findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0 && position <= groceryList.size()) {
            System.out.println(searchItem + " is the " + (position + 1) + " item in your list.");
        } else {
            System.out.println("Item not in the list");
        }
    }

}
