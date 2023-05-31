package ua.hillel.brizhak.lessons.lessons15;

public enum CarType {
    CAR("Car", 50000),
    BUS("Bus"),
    TRACK("Truck"),
    BIKE("Bike");
    private String type;
    private int price;

    CarType(String type) {
        this.type = type;
    }
    CarType(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}
