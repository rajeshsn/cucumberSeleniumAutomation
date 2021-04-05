package com.rajesh.automationframework.main;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayImplementation {

 public void growArray(int[] oldArr){

     int [] newArray = new int [10];

   int size1= newArray.length;

     int size = oldArr.length;

     int threshold = (int) (0.75*size);

   for(int i=0;i<=size;i++) {

       newArray[i] = oldArr[i];

       if (threshold >= i) {

           int arr[] = new int[2 * size1];

           arr[i] = newArray[i];

           System.out.println(arr[i]);
       }
   }

 }

    public static void main(String[] args) {

int a[] = new int []{1,2,3,4,5,6,5,7,7,7,7,6,8,9};

ArrayImplementation arGrow = new ArrayImplementation();

arGrow.growArray(a);

    }

}