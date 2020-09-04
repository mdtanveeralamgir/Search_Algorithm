package com.company;

public class MergeSort {

    public static void mergeSorting(int arr[]){
        mergeSorting(arr, 0, arr.length-1);
    }

    public static void mergeSorting(int arr[], int startingIndex, int endIndex)
    {
            if(endIndex <= startingIndex)
                return;
            int middle = (startingIndex + endIndex)/2;
            mergeSorting(arr, startingIndex, middle);
            mergeSorting(arr, middle + 1, endIndex);
            merging(arr, startingIndex, middle, endIndex);

    }

    public static void merging(int arr[], int startingIndex, int middleIndex, int endIndex)
    {

        int tempArray[] = new int[endIndex - startingIndex + 1];
        int leftSlot = startingIndex; //index counter for left side of the array
        int rightSlot = middleIndex + 1; //index counter for right side of the array
        int counter = 0; //Counter for temp array index
        while(leftSlot <= middleIndex && rightSlot <= endIndex)
        {
            if(arr[leftSlot] < arr[rightSlot])
            {
                tempArray[counter] = arr[leftSlot];
                leftSlot++;
            }
            else
            {
                tempArray[counter] = arr[rightSlot];
                rightSlot++;
            }
            counter++;
        }

        if(leftSlot <= middleIndex)
        {
            while(leftSlot <= middleIndex)
            {
                tempArray[counter] = arr[leftSlot];
                counter++;
                leftSlot++;
            }
        }
        else if(rightSlot <= endIndex)
        {
            while (rightSlot <= endIndex)
            {
                tempArray[counter] = arr[rightSlot];
                counter++;
                rightSlot++;
            }
        }

        for(int i = 0; i < tempArray.length; i++)
        {
            arr[startingIndex + i] = tempArray[i];
        }
    }
}
