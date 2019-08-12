package repository.impl;

import model.Product;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductRepositoryImpl implements ProductRepository {
    ArrayList<Product> listProduct = new ArrayList<>();

    @Override
    public void repair(int index, Product product) {
        listProduct.set(index,product);
    }

    @Override
    public void remove(int index) {
        if (index > listProduct.size()|| index <0){
            System.out.println("Index > size or Index <0");
        } else {
            listProduct.remove(index);
        }
    }

    @Override
    public Product search(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            String productName = listProduct.get(i).getName();
            if (productName.equals(name)) {
                return listProduct.get(i);
            }
        }
        return null;
    }

    @Override
    public void sortUpPrice() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        });
    }

    @Override
    public void sortDownPrice() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(),o1.getPrice());
            }
        });
    }

    @Override
    public void display() {
        if (listProduct.size() != 0){
            for (int i=0; i< listProduct.size();i++){
                System.out.println("Id: "+listProduct.get(i).getId()+
                                   " Name: "+listProduct.get(i).getName()+
                                   " Price: "+ listProduct.get(i).getPrice()+
                                   " Status: "+listProduct.get(i).isStatus()+
                                   " Description: "+listProduct.get(i).getDescription());
            }
        } else {
            System.out.println("List product is empty");
        }
    }

    @Override
    public void add(Product product) {
        listProduct.add(product);
    }
}
