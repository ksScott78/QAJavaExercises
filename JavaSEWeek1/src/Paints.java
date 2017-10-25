public class Paints {

    private String name;
    public double capacity;
    public double price;
    public double coverage;


    public Paints(String name, double capacity, double price, double coverage) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.coverage = coverage;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {

        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public double getCoverage() {
        return coverage;
    }

    public String toString() {
        return "Name: " + this.name + "\t \t Capacity(Litres): " + this.capacity + "\t \t Price: " + this.price + "\t \t Coverage(meters squared): " + this.coverage;
    }

}

