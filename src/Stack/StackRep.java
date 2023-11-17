/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author admin
 */
import java.util.Stack;
public class StackRep {
     public static void main(String[] args) {
Stack<String> stack = new Stack<String>();

        System.out.println("my subject for today is :");

stack.push("event driven programming");        
stack.push("Data structure ang algorithm");
stack.push("Multimedia Systems Development");


stack.pop();

System.out.println(stack);
     }
}
