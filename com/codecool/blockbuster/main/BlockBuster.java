package com.codecool.blockbuster.main;

import com.codecool.blockbuster.main.product.Product;
import com.codecool.blockbuster.main.product.productCatedories.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BlockBuster {
   protected int Revenue;
   private List<Product> productList;

   public boolean isRentable(Product product){
       return false;
   }

    public BlockBuster( ) {
        Revenue = 0;
        this.productList = createStock();
    }

    public Product nextRentable(){
       for (Product product : productList){
           if (!product.isRentedStatus()){
               return product;
           }
       }
       return null;
   }

    public int getRevenue() {
        return Revenue;
    }

    public void setRevenue(int revenue) {
        Revenue = revenue;
    }

    public boolean isCostumerComeIn(){
       if (new Random().nextInt(101)<76){
           return true;

       }else {
           return false;
       }

   }

   public void stockCheck(){
       for (Product product: productList) {
           if (product.getRentedDaysLeft()>0){
               product.setRentedDaysLeft(product.getRentedDaysLeft()-1);
           }else {
               product.setRentedStatus(false);
           }

       }
   }


    private List<Product> createStock(){
       List<Product> Stock = new ArrayList<Product>();
       Stock.add(new Movie("Gyürük ura",2001,20));
       return Stock;
    }

}
