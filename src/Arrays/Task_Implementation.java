package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//each item has an id, name ,category, price and quantity -->record
//storing the catehory in array of string
//histroy tracking of each item inclduing their action:record Item(String itemId, String name, String category, double price, int quantity) {}record ItemHistory(String action, Item item) {}//to create an instance of every Item:
// creating a static fucntion for hasselfree :

record Item(String itemId, String name, String category, double price, int quantity) {}

record ItemHistory(String action, Item item) {}
class ItemFactory {
    public static Item createItem(String itemId, String name, String category, double price, int quantity) {
        return new Item(itemId, name, category, price, quantity);
    }
}

class InventoryManager {

    // keeping the date members as private
    private String[] categories = { "Laptop", "Smartphone", "Tablet" };
    private final List<Item> items;

    // implement history later on //constructor to initialize items
    InventoryManager() {
        this.items = new ArrayList<>();
    } 
    
    // Add a new item to the inventory
    public Item addItem(Item i) {
        items.add(i);
        System.out.println("Item added!");
        return i;
    } 
    
    // Remove an item from the inventory by item ID 
    public Item removeIeItem(String id)
    {
        // get the item form it
        for (Item i : items) {
            if (i.itemId().equals(id)) {
                Item removedItem = i;
                items.remove(removedItem);
                System.out.println("Item was removed" + removedItem);
                return removedItem;
            }
        }
        System.out.println("Item with id: " + id + " doesnt exist");
        // remove it from items
        return null;
    } 
    
    // Update the price of a specific item

    public Item updateItem(String id, double price) {
        // get the item form it
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemId().equals(id)) {
                Item itemToUpdate = items.get(i);
                Double OldPrice = itemToUpdate.price();
                Item UpdatedItem = new Item(itemToUpdate.itemId(), itemToUpdate.name(), itemToUpdate.category(), price,
                        itemToUpdate.quantity());
                items.set(i, UpdatedItem); // records are immutable can't do the following
                // itemToUpdate.price()=price; 
                System.out.println("Item was updated with new price" + UpdatedItem);
                return UpdatedItem;
            }
        }
        System.out.println("Item with id: " + id + " doesnt exist");
        // remove it from items
        return null;
    } // Search for an item by name

    public List<Item> SearchItemByName(String name) {
        // get the item form it
        List<Item> itemListWithGivenName = new ArrayList<>();
        boolean flag = false;
        for (Item i : items) {
            if (i.name().equals(name)) {
                itemListWithGivenName.add(i);
                flag = true;
            }
        }
        // if item with given name doesnt exit
        if (!flag) {
            System.out.println("Item with name: " + name + " doesnt exist");
        } else {
            System.out.println("Items with name: " + name + " are as follows: ");
            System.out.println(itemListWithGivenName);
        }
        return itemListWithGivenName.size() > 0 ? itemListWithGivenName : null;
    }

}
// class with main method: 
class InventorySystem {

    public static void main(String[] args) {
        
        InventoryManager manager = new InventoryManager(); // Creating items using factory method
        Item laptop = ItemFactory.createItem("1", "Dell XPS 15", "Laptop", 1500.00, 10);
        Item smartphone = ItemFactory.createItem("2", "iPhone 13", "Smartphone", 999.99, 15);
        Item tablet = ItemFactory.createItem("3", "iPad Pro", "Tablet", 100.00, 8);
        Item tablet2 = ItemFactory.createItem("4", "iPad Pro", "Tablet", 120.00, 1); // Adding items to inventory
        manager.addItem(laptop);
        manager.addItem(smartphone);
        manager.addItem(tablet);
        manager.addItem(tablet2);
        manager.removeIeItem("1");
        manager.updateItem("2", 2000);
        manager.updateItem("10", 100);
        manager.SearchItemByName("iPad Pro");
    }
}