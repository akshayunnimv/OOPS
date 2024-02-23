class Product{
    int pcode;
    String pname;
    double price;
    
    public Product(int code,String pname,double price){
    this.pcode=pcode;
    this.pname=pname;
    this.price=price;
    }
}

public class Cycle1P1{
    public static void main(String[] args){
    System.out.println("Akshay Unni M V\n23mca010\ndt:14/02/2024\nFind the product with less price");
    Product p1 = new Product(1, "Apple", 100);
    Product p2 = new Product(2, "Grapes", 50);
    Product p3 = new Product(3, "Pineapple", 70);

    
    if((p1.price<p2.price) && (p1.price<p3.price)){
   	 System.out.println(p1.pname+ " is the cheapest product");
   	 }
    else if((p2.price<p1.price) && (p2.price<p3.price)){
   	 System.out.println(p2.pname+ " is the cheapest product");
   	 }
    else {
   	 System.out.println(p3.pname+ " is the cheapest product");
}
}
}


