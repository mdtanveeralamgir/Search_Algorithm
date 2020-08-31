package com.company;

public class Main {

    public static void main(String[] args) {

//	    Binary_search bs = new Binary_search();
//	    System.out.println(bs.findIndex());
//**************************************************************************
//	    Recarsion rs = new Recarsion();
//	    rs.reducedByOne(50);
//	    int arr[] = {1,2,3,4,5};
//	    int result = rs.recursive_linear_search(0, 4, arr);
//		System.out.println(result);
//**************************************************************************
		//Selection sorting
		SelectionSort ss = new SelectionSort();
		int arr[] = {1,3,2,5,4};
		arr = ss.selectionSorting(arr);
		for (int value:arr) {
			System.out.println(value);
		}
    }


}
