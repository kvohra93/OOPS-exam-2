/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismAndInheritance;

public class Owl extends PetBird {
    
    public Owl(String name,String color){
        super(name,color);
    }
    @Override
    public void sing(){
        System.out.println("HOOT HOOT HOOOT");
    }
    
}
