public record Item(String name, int stock, double price) {

    @Override
    public String toString() {
        return "Name: " + name + ", Stock: " + stock + ", Price: " + (int)price;
    }
}

