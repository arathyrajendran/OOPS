class Product {
    String pname;
    String pcode;
    int price;

    public Product() {
    }

    public Product(String var1, String var2, int var3) {
        this.pname = var1;
        this.pcode = var2;
        this.price = var3;
    }

    public String getpname() {
        return this.pname;
    }

    public void setpname(String var1) {
        this.pname = var1;
    }

    public String getpcode() {
        return this.pcode;
    }

    public void setpcode(String var1) {
        this.pcode = var1;
    }

    public int getprice() {
        return this.price;
    }

    public void setprice(int var1) {
        this.price = var1;
    }

    public void display() {
        System.out.println("pcode: " + this.pcode);
        System.out.println("pname: " + this.pname);
        System.out.println("price: " + this.price);
    }
}
