/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mikegrep.easypos.Models;

import com.github.anastaciocintra.escpos.EscPos;
import com.github.anastaciocintra.escpos.EscPosConst;
import com.github.anastaciocintra.escpos.Style;

public class OrderProduct {
        public String productCode;
        public String productName;
        public int productQty;
        public double productPrice;

    
        public OrderProduct(String productCode, String productName, int productQty, double productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productQty = productQty;
        this.productPrice = productPrice;
     
    }
        
   
        public double getPrice(int qty) {
           return this.productPrice  *= qty;
        }

    @Override
    public String toString() {
        String productPriceStr = String.format("%.2f x %d", productPrice,productQty);
        String qtyPriceStr = String.format("%.2f", getPrice(productQty));
        return String.format("%-15s%12s   %10s",productName,productPriceStr, qtyPriceStr );
    }

        
}
