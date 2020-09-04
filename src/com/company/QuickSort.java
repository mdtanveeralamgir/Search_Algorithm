package com.company;

public class QuickSort {
    public int partition(int inputArray[], int start, int end)
    {
        int i = start -1;
        int compareWith = inputArray[end];
        int temp = 0;

        for(int j = start; j <= end; j++)
        {
            if(inputArray[j] <= compareWith)
            {
                i++;
                temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
        return i;
    }

    public void quickSort(int inputArray[], int start, int end)
    {
        int partitionPoint = 0;
        if(start < end)
        {
            partitionPoint = partition(inputArray, start, end);
            quickSort(inputArray, start, partitionPoint - 1);
            quickSort(inputArray, partitionPoint + 1, end);
        }
    }

    public void quickSort(int inputArray[])
    {
        quickSort(inputArray, 0, inputArray.length - 1);
    }
}
