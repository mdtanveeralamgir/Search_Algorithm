package com.company;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Explore {
    public void  printArr(int arr[]){
        for (int value:arr) {
            System.out.println(value);
        }
        System.out.println("*****");
    }

    public void  printArrPoint(int arr[], int start, int end){
        for (int value = start; value <= end; value++) {
            System.out.println(arr[value]);
        }
//        System.out.println("*****");
    }
    public void Recursion(int []inputArray, int startIndex, int endIndex)
    {
        if(startIndex < endIndex)
        {
            int middleIndex = (startIndex + endIndex)/2;
            Recursion(inputArray, startIndex, middleIndex);
            Recursion(inputArray, middleIndex + 1, endIndex);
            printArrPoint(inputArray, startIndex, middleIndex);
            System.out.println("*Start - Middle*");
            printArrPoint(inputArray, middleIndex + 1, endIndex);
            System.out.println("*Middle - end*");

        }
    }
}
