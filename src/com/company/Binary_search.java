package com.company;

public class Binary_search {
    public int arr[] = {1,3,23,24,24,40,59,67,200};
    public int find = 1;
    public int startIndex = 0;
    public int endIndex = arr.length - 1;
    public int midPoint = 0;

    public int findIndex(){
        int result = -1;
        while(startIndex <= endIndex){ //Looping until startIndex, endpoint cross over each other
            midPoint = (int)Math.floor((startIndex + endIndex)/2); //Finding middle point
            if(arr[midPoint] == find) //The result
            {
                result = midPoint;
                break;
            }
            else if(arr[midPoint] > find) //If searching element is less than the middle point
            {
                endIndex = midPoint - 1;
            }
            else //If searching element is higher than the middle point
            {
                startIndex = midPoint + 1;
            }

        }
        return result;
    }

}
