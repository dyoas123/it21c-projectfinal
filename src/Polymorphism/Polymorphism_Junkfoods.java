/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;


public class Polymorphism_Junkfoods extends Polymorphism_SebenEleben{
    Polymorphism_Junkfoods(String name){
        super(name);
        
    }
    void migo(){
        System.out.println(name + "na ngayo");
    }
    public void sebenelebenHumans(){
        System.out.println("na ngayo si"+ name);
    }
}
