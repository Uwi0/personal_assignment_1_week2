public class InventoryManager {

    public static void main(String[] args) {
        Item[] inventory = new Item[10];
        int currentItemCount = 0;

        inventory[currentItemCount++] = new Item("Pensil", 50, 200);
        inventory[currentItemCount++] = new Item("Buku", 30, 15000);
        inventory[currentItemCount++] = new Item("Penghapus", 20, 500);

        System.out.println("Enter the name of the item to update: Pensil");
        System.out.println("Enter the new stock amount: 60\n");
        updateStock("Pensil", 60, inventory, currentItemCount);

        displayInventory(inventory, currentItemCount);

        System.out.println("Enter the name of the item to search: Buku");
        searchItem("Buku", inventory, currentItemCount);
    }

    public static void displayInventory(Item[] inventory, int itemCount) {
        System.out.println("Inventory after update:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + inventory[i]);
        }
        System.out.println();
    }

    public static void updateStock(String name, int newStock, Item[] inventory, int itemCount) {
        for (int i = 0; i < itemCount; i++) {
            if (inventory[i].name().equalsIgnoreCase(name)) {
                inventory[i] = new Item(inventory[i].name(), newStock, inventory[i].price());
                return;
            }
        }
        System.out.println("Item with name '" + name + "' not found.");
    }

    public static void searchItem(String name, Item[] inventory, int itemCount) {
        System.out.println("Search result:");
        for (int i = 0; i < itemCount; i++) {
            if (inventory[i].name().equalsIgnoreCase(name)) {
                System.out.println(inventory[i]);
                return;
            }
        }
        System.out.println("Item not found.");
    }
    
}