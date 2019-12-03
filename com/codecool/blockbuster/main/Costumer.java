package com.codecool.blockbuster.main;

import com.codecool.blockbuster.main.product.Product;

import java.util.Random;

public class Costumer {

    public int getDaysOfRent(){
        Random r = new Random();
        return r.nextInt((14 - 3) + 1) + 3;
    }

    public void setRentalDate(Product product, int daysOfRent){
        product.setRentedDaysLeft(daysOfRent);
    }


    public void pay(BlockBuster blockBuster, int price){
        blockBuster.setRevenue(blockBuster.getRevenue()+price);
    }

    public void rent(BlockBuster blockBuster, Product product){
        int daysOfRent = getDaysOfRent();
        int price = product.getRentalcost()*daysOfRent;
        setRentalDate(product,daysOfRent);
        pay(blockBuster,price);
        product.setRentedDaysLeft(daysOfRent);
        product.setRentedStatus(true);
    }


}
