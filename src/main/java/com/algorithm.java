package com;

import java.util.ArrayList;
import java.util.HashSet;

public class algorithm {

	//http://www.csdn.net/article/2014-04-10/2819237-Top-10-Algorithms-for-Coding-Interview
	//http://www.jiuzhang.com/course/1/
	/*
	toCharArray() //get char array of a String
	Arrays.sort()  //sort an array
	Arrays.toString(char[] a) //convert to string
	charAt(int x) //get a char at the specific index
	length() //string length
	length //array size 
	substring(int beginIndex) 
	substring(int beginIndex, int endIndex)
	Integer.valueOf()//string to integer
	String.valueOf()/integer to string
	
	String str = Integer.toString(b);
	StringBuffer sb = new StringBuffer(str);
	StringBuffer strq = sb.reverse();
	int i = Integer.valueOf("1");
	String s = Integer.valueOf(1).toString();
	String s="temp";
    s.charAt(1);
	*/
	
	
	public static void quickSort(int[] arr, int low, int high) {
		
		
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
	public static int lengthOfLongestSubstring(String s) {
	    if(s==null || s.length()==0)
	        return 0;
	 
	    HashSet<Character> set = new HashSet<Character>();
	 
	    int max=0;
	 
	    int i=0;
	    int start=0;
	    while(i<s.length()){
	        char c = s.charAt(i);
	        if(!set.contains(c)){
	            set.add(c);
	        }else{
	            max = Math.max(max, set.size());
	 
	            while(start<i&&s.charAt(start)!=c){
	                set.remove(s.charAt(start));
	                start++;
	            }
	            start++;
	        }
	 
	        i++;
	    }
	 
	    max = Math.max(max, set.size());
	 
	    return max;
	}
	
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		
		int[] total = new int[triangle.size()];
		int l = triangle.size() - 1;
	 
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
	 
		// iterate from last second row
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
	 
		return total[0];
	}
}
