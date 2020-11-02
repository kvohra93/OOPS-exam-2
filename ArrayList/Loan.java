/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

public class Loan {
    private String type;
    private double amount;

    public Loan(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan is of type " + type + " and for amount of " + amount;
    }
        
}
