/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mikegrep.easypos.Models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mike
 */
public class Order {
    
    public String tableNumber;
    public ArrayList<OrderProduct> products;
    public double totalPrice;
    
    public Order(String tableNumber){
        this.tableNumber = tableNumber;
        products = new ArrayList();
        totalPrice = 0;
    }

    @Override
    public String toString() {
        return "Order{" + "tableNumber=" + tableNumber + ", products=" + products   + '}';
    }
    
    public double totalBillOrder() {
        double total = 0;
        for(OrderProduct product: products) {
            total += product.productPrice;
        }
        return total;
    }
    
    public double taxOrder() {
        return (totalBillOrder() / 10) * 2;
        
    }
    
    public double subTotalOrder() {
        return totalBillOrder() - taxOrder();
    }
    
    public double totalNegative() {
       return -totalBillOrder();
    }
    
    public String formatDouble(double value) {
        return String.format("%.2f", value);
    }

   
}
