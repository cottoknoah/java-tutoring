package mystore;

//interfaces are all abstract classes

public interface Product {
    double getPrice();
    void setPrice(double newPrice);
    int getStock();
    void setStock(int newStock);
}
