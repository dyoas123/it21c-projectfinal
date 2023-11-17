/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author admin
 */
public class Area {
      int length;
        int width;
        
        Area (int length,int width){
            this.length = length;
            this.width = width;
                    
    }
    
        public void getArea(){
            int area = length+width;
            System.out.println("Area:"+area);
        }
}

