package ua.hillel.brizhak.homeworks.homework17;

public enum Drinks {
    COFFEE(50,"Coffee"),
    TEA(35, "Tea"),
    LEMONADE(30, "Lemonade"),
    MOJITO(75, "Mojito"),
    MINERAL(20, "Mineral"),
    COCACOLA(25, "Coca-Cola"),
    EXIT(0);

    private int price;
    private String type;



    Drinks(String type) {
        this.type = type;
    }

    Drinks(int price) {
        this.price = price;
    }

    Drinks(int price, String type) {
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
}
