package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 0;
	    int arr[] = {1,3,23,24,24,40,59,67,200};
	    int find = 24;
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midPoint = 0;
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
	    System.out.println(result);
    }


}
