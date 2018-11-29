package HashCode;

public class Chair {
    private String model;
    private String manufacturer;
    private int productionYear;

    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janinge", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        System.out.println("chair1.equals(chair2): " + chair1.equals(chair2));
        System.out.println("chair1.equals(chair3): " + chair1.equals(chair3));
        System.out.println("chair1.equals(chair4): " + chair1.equals(chair4));
        System.out.println("chair1.equals(null): " + chair1.equals(null));
    }

    public Chair(String model, String manufacturer, int productionYear) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Chair) {
            Chair otherChair = (Chair) obj;
            return model.equals(otherChair.model) &&
                    manufacturer.equals(otherChair.manufacturer) &&
                    productionYear == otherChair.productionYear;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17 * model.hashCode() + 31 * manufacturer.hashCode() + 7 * productionYear;
    }
}

