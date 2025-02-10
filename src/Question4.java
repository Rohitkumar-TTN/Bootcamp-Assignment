interface Product {
    void display();
}
class ProductA implements Product {
    public void display() {
        System.out.println("This is ProductA");
    }
}
class ProductB implements Product {
    public void display() {
        System.out.println("This is ProductB");
    }
}
class Factory {
    public Product getProduct(String productType) {
        if (productType.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (productType.equalsIgnoreCase("B")) {
            return new ProductB();
        }
        return null;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product productA = factory.getProduct("A");
        productA.display();
        Product productB = factory.getProduct("B");
        productB.display();
    }
}
