package com.company;

public class SelectionSort {
    /*
    Find the min element and swap it with the first index.
    Then start from 2nd index and find the min and swap with 2nd index.
    Continue until the end of the array
     */

    public int[] selectionSorting(int arr[]){
        int index = 0;
        int min = 0;
        int secondIndex = 1;
        int temp = 0;
        int tempIndex = 0;
        while(index < arr.length)
        {
            min = arr[index]; //getting initial min value
            secondIndex = index + 1; //Searching from the next element of recently sorted elements
            while(secondIndex < arr.length)
            {
                if(arr[secondIndex] < min) //Find new min value
                {
                    min = arr[secondIndex]; //Changing the min value
                    tempIndex = secondIndex; //Storing index of the element to be swaped
                }
                secondIndex++;
            }
            temp = arr[index];
            arr[index] = min;
            arr[tempIndex] = temp;
            index++;
        }
        return arr;
    }
}
