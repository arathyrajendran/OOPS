public class exp1 {
    public static void main(String[] args) {
        // Initializing the product pl
        Product pl = new Product("Benz", "car123", 100000);
        System.out.println("********** Displaying pl ***************");
        pl.display(); // Displaying pl

        // Creating product p2
        Product p2 = new Product("Jaguar", "car426", 250000);
        System.out.println("********** Displaying p2 ***************");
        p2.display(); // Displaying p2

        // Creating product p3
        Product p3 = new Product("Maruthi", "car800", 550000);
        System.out.println("********** Displaying p3 ***************");
        p3.display(); // Displaying p3

        // Comparing prices and selecting the product with the lowest price
        Product p = (p3.getPrice() < (pl.getPrice() < p2.getPrice() ? pl.getPrice() : p2.getPrice()) ? p3 : (pl.getPrice() < p2.getPrice() ? pl : p2));
        
        System.out.println("\n********** Displaying product with lowest price ***************");
        p.display(); // Displaying the product with the lowest price
    }
}

class Product {
    String pname, pcode;
    int price;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    // Getter and Setter methods
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Display method to show product details
    public void display() {
        System.out.println("Pcode:............... " + this.pcode);
        System.out.println("Pname:............... " + this.pname);
        System.out.println("Price:............... " + this.price);
    }
}public class exp1 {
    public static void main(String[] args) {
        // Initializing the product pl
        Product pl = new Product("Benz", "car123", 100000);
        System.out.println("********** Displaying pl ***************");
        pl.display(); // Displaying pl

        // Creating product p2
        Product p2 = new Product("Jaguar", "car426", 250000);
        System.out.println("********** Displaying p2 ***************");
        p2.display(); // Displaying p2

        // Creating product p3
        Product p3 = new Product("Maruthi", "car800", 550000);
        System.out.println("********** Displaying p3 ***************");
        p3.display(); // Displaying p3

        // Comparing prices and selecting the product with the lowest price
        Product p = (p3.getPrice() < (pl.getPrice() < p2.getPrice() ? pl.getPrice() : p2.getPrice()) ? p3 : (pl.getPrice() < p2.getPrice() ? pl : p2));
        
        System.out.println("\n********** Displaying product with lowest price ***************");
        p.display(); // Displaying the product with the lowest price
    }
}

class Product {
    String pname, pcode;
    int price;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    // Getter and Setter methods
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Display method to show product details
    public void display() {
        System.out.println("Pcode:............... " + this.pcode);
        System.out.println("Pname:............... " + this.pname);
        System.out.println("Price:............... " + this.price);
    }
}