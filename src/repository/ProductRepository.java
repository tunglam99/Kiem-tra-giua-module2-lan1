package repository;

import model.Product;

public interface ProductRepository extends GeneralRepository<Product> {
    void repair(int index, Product product);
    void remove(int index);
    Product search(String name);
    void sortUpPrice();
    void sortDownPrice();
}
