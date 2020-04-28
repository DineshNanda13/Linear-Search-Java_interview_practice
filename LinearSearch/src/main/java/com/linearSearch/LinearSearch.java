package com.linearSearch;

/**
 *
 * @author Dinesh Nanda
 * 
 */

//Time Complexity : O(n)

public class LinearSearch {
    
    public static int searchIndex(int[] list, int item){
        
        for(int i = 0; i < list.length; i++){
            if(list[i] == item){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int arr [] = {4, 12, 20, 43, 87, 99};
        int element = 87;
        
        int index = searchIndex(arr, element);
        
        if(index == -1){
            System.out.println("Element not in list");
        }else{
            System.out.println("Item index is "+ index);
        }
    }
}
