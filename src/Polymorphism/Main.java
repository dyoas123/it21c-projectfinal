
package Polymorphism;


public class Main {
    public static void main (String []args){
        Polymorphism_SebenEleben my_sebeneleben = new Polymorphism_SebenEleben("Guard");
        Polymorphism_IceCream my_icecream = new Polymorphism_IceCream ("surbetes");
        Polymorphism_Junkfoods my_junkfoods = new Polymorphism_Junkfoods("dyank pods");
        
        my_sebeneleben.eat();
        my_icecream.tagak();
        my_junkfoods.migo();
        
        System.out.println("----");
        my_sebeneleben.sleep();
        my_icecream.sebenelebenHumans();
        my_junkfoods.sebenelebenHumans();
    }
           
}
