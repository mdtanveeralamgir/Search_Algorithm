package com.company;

public class InsertionSorting {
    /*
    sort the elements as we iterate through the array
     */

    public int[] insertionSorting(int arr[]){
        int index = 0;
        int min = 0;
        int secondIndex = 0;
        int temp = 0;
        int tempIndex = 0;
        for(index = 1; index < arr.length; index++)
        {
            min = arr[index];
            tempIndex = index;
            for(secondIndex = index-1; secondIndex >=0; secondIndex--)
            {
                if(arr[secondIndex] > min)
                {
                    temp = arr[secondIndex];
                    arr[secondIndex] = min;
                    arr[tempIndex] = temp;
                    tempIndex = secondIndex;
                    min = arr[tempIndex];
                }
            }
        }
        return arr;
    }
}
