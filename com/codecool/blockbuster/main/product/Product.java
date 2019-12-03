package com.codecool.blockbuster.main.product;

public abstract class Product implements OnPlatform {

    protected String name;
    protected Integer relaseDate;
    protected int rentalCost;
    protected boolean rentedStatus;
    protected int rentedDaysLeft;
    protected Platform platform;

    public String getName() {
        return name;
    }

    public Product(String name, Integer relaseDate, int rentalcost) {
        this.name = name;
        this.relaseDate = relaseDate;
        this.rentalCost = rentalcost;
        this.rentedStatus = false;
        this.rentedDaysLeft = 0;

    }

    public int getRentedDaysLeft() {
        return rentedDaysLeft;
    }


    public boolean isRentedStatus() {
        return rentedStatus;
    }

    public void setRentedStatus(boolean rentedStatus) {
        this.rentedStatus = rentedStatus;
    }

    public void setRentedDaysLeft(int rentedDaysLeft) {
        this.rentedDaysLeft = rentedDaysLeft;
    }

    public int getRentalcost() {
        return rentalCost;
    }
}
