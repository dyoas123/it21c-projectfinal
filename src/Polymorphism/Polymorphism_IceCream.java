/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;


public class Polymorphism_IceCream extends Polymorphism_SebenEleben{
    Polymorphism_IceCream(String name){
        super(name);
        
    }
    void tagak(){
        System.out.println(name + " na tagak");
    }
public void dirty(){
    System.out.println("hugaw na"+ name);
}            
}
