/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismAndInheritance;


public class PetBird {
    private String name;
    private String color;
    
    public PetBird(String name, String color){
        this.name = name;
        this.color = color;    
    }
    public void sing(){
        System.out.println("chirp chirp chirp");
    } 
}    

