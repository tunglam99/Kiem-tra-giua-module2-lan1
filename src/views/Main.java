package views;

import controller.ProductController;
import model.Product;

import javax.security.sasl.SaslClient;
import java.lang.invoke.SwitchPoint;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int choice;
        ProductController productController =new ProductController();
        do {
            menu();
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    productController.display();
                    break;
                }
                case 2: {
                    Product product = createProduct();
                    productController.add(product);
                    break;
                }
                case 3:{
                    System.out.println("Nhap vi tri cam sua");
                    int index = input.nextInt();
                    input.nextLine();
                    System.out.println("nhap thong tin san pham moi:");
                    Product product = createProduct();
                    productController.repair(index,product);
                     break;
                }
                case 4:{
                    System.out.println("nhap vi tri can xoa");
                    int index = input.nextInt();
                    input.nextLine();
                    productController.remove(index);
                    break;
                }
                case 5:{
                    System.out.println("nhap ten san pham: ");
                    String name = input.nextLine();
                    name=input.nextLine();
                    Product product = productController.search(name);
                    if (product != null) {
                        System.out.println("Id: "+product.getId()+
                                " Name: "+product.getName()+
                                " Price: "+ product.getPrice()+
                                " Status: "+product.isStatus()+
                                " Description: "+product.getDescription());
                    } else {
                        System.out.println("khong co san pham nay " + name);
                    }
                    break;
                }
                case 6:{
                    productController.sortUpPrice();
                    break;
                }
                case 7:{
                    productController.sortDownPrice();
                    break;
                }
            }
        } while (choice !=0);
    }

    public static void menu(){
        System.out.println("1.Hien thi danh sach");
        System.out.println("2.Them moi");
        System.out.println("3.Sua thong tin");
        System.out.println("4.Xoa san pham");
        System.out.println("5.Tim san pham theo ten");
        System.out.println("6.sap xep san pham tang dan theo gia");
        System.out.println("7.sap xep san pham giam dan theo gia");
        System.out.println("0.Thoat");
    }

    public static Product createProduct(){
        Scanner input =new Scanner(System.in);
        System.out.println("Nhap Id: ");
        int id =  input.nextInt();
        input.nextLine();

        System.out.println("Nhap ten san pham: ");
        String name = input.nextLine();

        System.out.println("Nhap gia:");
        float price = input.nextFloat();
        input.nextLine();

        boolean status = true;

        System.out.println("Nhap mo ta:");
        String description = input.nextLine();

        Product product = new Product(id, name, price,status,description);

        return product;
    }
}
