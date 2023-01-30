/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jeelkanzaria
 */
public class DeliveryPackage {
    int packageId;
    double packageWeight;
    ArrayList<Product> productList;
    //Product product;
    Customer customer;
    
    public DeliveryPackage(){
        //this.packageId = 0;
        //this.packageWeight = 0.0;
        //this.product = new Product();
        this.productList = new ArrayList<Product>();
        this.customer = new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    
    public Product createProduct(int productId, String productName, double price){
        Product product = new Product();
        
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        
        //add to list
        this.productList.add(product);
        return product;
    }
    public Product findProduct(int pid){
        for(Product prod: this.productList){
            if(prod.getProductId() == pid){
                return prod;
            }
        }
        return null;
    }
}
