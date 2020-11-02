/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coffee;

/**
 *
 * @author Kunal
 */
public class OrderCoffee {
    private String name;
    CoffeeSize size; 
    
    public OrderCoffee(String name, CoffeeSize size){
        this.name = name;
        this.size = size;
    }
    public static void main(String[] args) {
       OrderCoffee o1 = new OrderCoffee("Latte", CoffeeSize.SMALL);
        System.out.println(
                "Order:\n" + "Coffee: "+ o1.name + "(" + o1.size + ")" 
                        +"\nPrice :"  + o1.size.getPrice()+"$");
    }
    
}
