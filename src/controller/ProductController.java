package controller;

import model.Product;
import service.impl.ProductServiceImpl;

public class ProductController {
    ProductServiceImpl productService =new ProductServiceImpl();

    public void display() {
        productService.display();
    }

    public void add(Product product) {
        productService.add(product);
    }

    public void repair(int index, Product product) {
        productService.repair(index,product);
    }

    public void remove(int index) {
        productService.remove(index);
    }

    public Product search(String name) {
        return productService.search(name);
    }

    public void sortUpPrice() {
        productService.sortUpPrice();
    }

    public void sortDownPrice() {
        productService.sortDownPrice();
    }
}
