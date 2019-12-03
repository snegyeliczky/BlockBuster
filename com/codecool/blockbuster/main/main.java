package com.codecool.blockbuster.main;

import com.codecool.blockbuster.main.product.Product;

import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {
        System.out.println("Strarted");
        BlockBuster blockBuster = new BlockBuster();

        for (int i = 0; i < 30; i++) {
            blockBuster.stockCheck();
            if (blockBuster.isCostumerComeIn()){
                Product productToRent = blockBuster.nextRentable();
                if (productToRent != null){
                    System.out.println(productToRent.getName());
                    Costumer costumer = new Costumer();
                    costumer.rent(blockBuster,productToRent);
                    System.out.println("ok");
                    System.out.println(i);
                }
            }

        }
    }
}
