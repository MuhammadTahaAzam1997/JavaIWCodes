/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author S com
 */
class A {
   int a=10;
   int b=20;
   String name="Taha";
   
//   overloading
   
   void car(){
       System.out.println("method1");
   }
   
   void car(int a){
         System.out.println("method2");
   }
   
    void car(int a, int b){
          System.out.println("method3");
   }
    
     void car(String c, int b){
           System.out.println("method4");
   }

//overriding
    
   
}

class B extends A{
    void A(){
        System.out.println("name"+name);
    }
    
    @Override
    void car(){
        System.out.println("Method A");
    }
}