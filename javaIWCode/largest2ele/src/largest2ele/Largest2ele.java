/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest2ele;

import java.util.Arrays;





/**
 *
 * @author S com
 */
public class Largest2ele {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={5,2,4,6,5};
        Arrays.sort(arr);
        
        for(int i=arr.length-2;i>0;i--){
            if(arr[i]!=arr.length-1){
                System.out.println("the largest element is: "+arr[i]);
            }
            else{System.out.println("no second largest element");
            }
    }
        
    }
    
}
