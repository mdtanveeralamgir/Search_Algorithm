package com.company;

public class MergeSort {
    public void mergeSorting(int arr[], int startingIndex, int endIndex)
    {
//        int result[] = {};
        if(startingIndex < endIndex){
            int middle = (int)Math.floor((startingIndex + endIndex)/2);
            mergeSorting(arr, startingIndex, middle);
            mergeSorting(arr, middle + 1, endIndex);
            merging(arr, startingIndex, middle, endIndex);
        }

    }

    public void merging(int arr[], int startingIndex, int middleIndex, int endIndex)
    {
        int count = startingIndex;
        int leftStart = startingIndex;
        int rightStart = middleIndex + 1;
        int tempArray[] = new int [5];
        while(leftStart <= middleIndex && rightStart <= endIndex)
        {
            if(arr[leftStart] < arr[rightStart])
            {
                tempArray[count] = arr[leftStart];
                leftStart++;
//                System.out.println("Start: " + startingIndex);

            }
            else
            {
                tempArray[count] = arr[rightStart];
                rightStart++;
//                System.out.println("Middle " + middleIndex);
            }
//            System.out.println("********");
            count++;
        }
        if(leftStart <= middleIndex)
        {
            while (leftStart <= middleIndex)
            {
                tempArray[count] = arr[leftStart];
                leftStart++;
                count++;
            }
        }
        else if(rightStart <= endIndex)
        {
            while (rightStart <= endIndex)
            {
                tempArray[count] = arr[rightStart];
                rightStart++;
                count++;
            }
        }
        arr = tempArray;
    }
}
