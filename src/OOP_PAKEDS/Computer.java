/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_PAKEDS;

/**
 *
 * @author admin
 */
public class Computer {
      String computer_name;
    double computer_price;
    
    Computer (String computer_name, double computer_price){
        this.computer_name= computer_name;
        this.computer_price=computer_price;
    }
    void showComputerName(){
        System.out.println("computer_name");
    }
    void showComputerPrice(){
    }
}
