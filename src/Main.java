public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory(10);

        inventory.addItem(new Item("Pensil", 50, 200));
        inventory.addItem(new Item("Buku", 30, 15000));
        inventory.addItem(new Item("Penghapus", 20, 500));

        inventory.display();
        inventory.updateStock("Pensil", 60);
        inventory.display();
        inventory.searchItem("Buku");
    }
}