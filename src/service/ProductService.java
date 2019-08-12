package service;

import model.Product;

public interface ProductService extends GeneralService<Product>{
    void repair(int index, Product product);
    void remove(int index);
    Product search(String name);
    void sortUpPrice();
    void sortDownPrice();
}
