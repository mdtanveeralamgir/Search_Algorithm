package com.company;

public class Recarsion
{

    //Recursion function to reduce the number
    public void reducedByOne(int value)
    {
        if(value >= 12)
        {
            reducedByOne(value - 1);
        }
        //Will print from 11 to 50
        System.out.println("After recarsion the value is " + value);
    }

    public int recursive_linear_search(int startIndex, int find, int arr[])
    {
        if(startIndex > (arr.length - 1))
        {
            return -1;
        }
        else if(arr[startIndex] == find)
        {
            return startIndex;
        }
        else
        {
            return recursive_linear_search(startIndex + 1, find, arr);
        }
    }
}
