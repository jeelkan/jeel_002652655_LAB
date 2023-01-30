/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modifyindex;

/**
 *
 * @author jeelkanzaria
 */
public class ModifyIndex {

    /**
     * @param args the command line arguments
     */
    public static int[] modifyArray(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                arr[i] *=2;
            }
            else{
                arr[i] *=3;
            }
        }
      return arr;  
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {0,1,2,3,4,5,6};
        int[] modifiedArray = modifyArray(arr);
        System.out.println("Displaying Array:");
        
        for(int i=0;i<modifiedArray.length;i++){
            System.out.println(modifiedArray[i]+ " ");
        }
    }
    
}
