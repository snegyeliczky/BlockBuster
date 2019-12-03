package com.codecool.blockbuster.main.product.productCatedories;

import com.codecool.blockbuster.main.product.Platform;
import com.codecool.blockbuster.main.product.Product;

import java.util.Date;

public class Movie extends Product {

    public Movie(String name, Integer relaseDate, int rentalcost) {
        super(name, relaseDate, rentalcost);
        setPlatform();
    }

    public void setPlatform() {
        if ( 1990 < this.relaseDate){
            this.platform = Platform.CD;
        }else{
            this.platform = Platform.VHS;
        }

    }
}
