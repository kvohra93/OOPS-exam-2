/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kunal
 */
public class ArrayListDriver {

       public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        Date date = new Date();
        Loan loan = new Loan ("Personal",10000.00);
        Circle circle = new Circle(5,"red");
        String text = "Nairobi is Dead";
        
        
        list.add(loan);
        list.add(date);        
        list.add(text);
        list.add(circle);
        
        for (Object item:list){
        
            System.out.println(item.toString());
        }
       }
    
}
