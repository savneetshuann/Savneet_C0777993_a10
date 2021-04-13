package com.savneet;


public abstract class Rates {

    double sales;


    public Rates(double sales) {

        this.sales = sales;
    }

    public double getRates() {
        double rates = 0.0;
        if (getSales() < 10000) {
            rates = 5;
        } else if (this.sales >= 10000 && this.sales < 15000) {
            rates = 10;
        } else if (this.sales >= 15000 && this.sales < 18000) {
            rates = 12;
        } else if (this.sales >= 18000 && this.sales < 22000) {
            rates = 15;
        } else if (this.sales >= 22000) {
            rates = 16;
        }
        return rates;
    }


    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public abstract double calculatePay();


}


