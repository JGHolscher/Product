import java.util.*;

public class Product {
    String ID = "";
    String name = "";
    String description = "";
    double cost = 0;
    private static int startSeed = 0;

    public Product(String name, String description, int ID, double cost)
    {
        this.name = name;
        this.description = description;
        this.ID = String.valueOf(ID);
        this.cost = cost;
    }

    public Product(String name, String description, double cost) {
        startSeed++;
        this.name = name;
        this.description = description;
        this.ID = "00000" + startSeed;
        this.cost = cost;
    }

    public static void startSeed(int i) {
    }

    public static int startSeed() {
        return 0;
    }


    public String toCSVDataRecord(){
        return this.name + ", " + this.description + ", " + this.ID + ", " + this.cost + "\n";
    }


    public String getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = String.valueOf(ID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", ID='" + ID + '\'' +
                ", cost=" + cost +
                '}';
    }

}

