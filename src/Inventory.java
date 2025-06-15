public class Inventory {
    private Item[] items;
    private int currentItemCount;

    public Inventory(int capacity) {
        this.items = new Item[capacity];
        this.currentItemCount = 0;
    }

    public void addItem(Item item) {
        if (currentItemCount < items.length) {
            items[currentItemCount++] = item;
        }
    }

    public void display() {
        System.out.println("Store Inventory:");
        for (int i = 0; i < currentItemCount; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
        System.out.println();
    }

    public void updateStock(String name, int newStock) {
        for (int i = 0; i < currentItemCount; i++) {
            if (items[i].name().equalsIgnoreCase(name)) {
                items[i] = new Item(items[i].name(), newStock, items[i].price());
                System.out.println("Stock for item '" + name + "' has been updated.\n");
                return;
            }
        }
        System.out.println("Item with name '" + name + "' not found.\n");
    }

    public void searchItem(String name) {
        System.out.println("Search result for '" + name + "':");
        for (int i = 0; i < currentItemCount; i++) {
            if (items[i].name().equalsIgnoreCase(name)) {
                System.out.println(items[i]);
                return;
            }
        }
        System.out.println("Item not found.");
    }
}