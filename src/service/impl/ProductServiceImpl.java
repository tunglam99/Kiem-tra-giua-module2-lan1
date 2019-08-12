package service.impl;

import model.Product;
import repository.impl.ProductRepositoryImpl;
import service.ProductService;

public class ProductServiceImpl implements ProductService {

    ProductRepositoryImpl productRepository =new ProductRepositoryImpl();

    @Override
    public void display() {
        productRepository.display();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void repair(int index, Product product) {
        productRepository.repair(index,product);
    }

    @Override
    public void remove(int index) {
        productRepository.remove(index);
    }

    @Override
    public Product search(String name) {
        return productRepository.search(name);
    }

    @Override
    public void sortUpPrice() {
        productRepository.sortUpPrice();
    }

    @Override
    public void sortDownPrice() {
        productRepository.sortDownPrice();
    }
}
