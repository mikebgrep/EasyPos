/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mikegrep.easypos.Models;

/**
 *
 * @author mike
 */
public class Product {

    public int index;
    public String productCode;
    public String productName;
    public int productQty;
    public double productPrice;

    public Product(int index, String productCode, String productName, int productQty, double productPrice) {
        this.index = index;
        this.productCode = productCode;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;

    }

    public Product(String productCode, String productName, int productQty, double productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product" + ", productName=" + productName + ", productQty=" + productQty + ", productPrice=" + productPrice + '}';
    }

    public double setProductPrice(double productPrice) {
        return this.productPrice = productPrice * this.productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

}
