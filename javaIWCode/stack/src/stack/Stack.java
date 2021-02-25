/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.*;
 
/**
 *
 * @author S com
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Stack<Integer> STACK= new Stack();  
        STACK.push(1);
        STACK.push(2);
        STACK.pop();
        for (int i=0; i< STACK.length;i++){
            System.out.println(STACK[i]);
                  
        }
    }
    
}
