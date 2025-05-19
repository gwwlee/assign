package access.hw2;

public class Item {
    private String name;
    private int price;
    private int quantity;

    Item() { this("", 0, 0); }
    Item(String name) { this(name, 0, 0);}
    Item(String name, int price){ this(name, price, 0);}

    Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public int getTotalPrice() {
        return this.price * this.quantity;
    }
}
