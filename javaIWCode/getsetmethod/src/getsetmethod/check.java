/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getsetmethod;

/**
 *
 * @author S com
 */
public class check {
    
    String name;
    public void get(String n){
    this.name=n;}
    
}

class B extends check{
    public void set(){
       char str[]=name.toCharArray();
       for(int i= str.length-1; i>=0;i--){
           System.out.print(str[i]);
          
       
       }
}
}