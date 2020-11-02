/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Kunal
 */
public class Circle {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    } 

    @Override
    public String toString() {
        return "This Circle has a radius of " + radius + " and is of " + color + " color";
    }
    
    
}
