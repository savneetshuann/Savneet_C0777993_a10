package com.savneet;
import com.savneet.Rates;

public class Commision extends Rates implements IDisplay{
    double  advance;

    public Commision( double sales, double advance) {
        super(sales);
        this.advance = advance;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    @Override
    public double calculatePay() {
        return (this.sales*getRates()/100)-this.advance; //Calculate pay
    }

    @Override
    public void display() {
        if (this.calculatePay() <0)
        {
            System.out.println("Amount to be reimbursed $"+Math.abs(this.calculatePay())); //negative then reimburse
        }
        else {
            System.out.println("Pay for this month is $"+this.calculatePay()); //total pay
        }

    }
}
