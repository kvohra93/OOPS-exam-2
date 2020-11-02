/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismAndInheritance;

/**
 *
 * @author Kunal
 */
public class PetBirdDriver {
  
    public static void main(String[] args){
    PetBird b1 = new PetBird("Oscar","Black");
    PetBird b2 = new Owl ("Martin","White and Grey");
    Sparrow b3 = new Sparrow ("Lina","Brown");
    System.out.println("Oscar goes...");
    b1.sing();
    System.out.println("---------------------------");
    System.out.println("Martin goes...");
    b2.sing();
    System.out.println("---------------------------");
    System.out.println("Lina goes...");
    b3.sing();
    System.out.println("---------------------------");
    } 
    
    
}
