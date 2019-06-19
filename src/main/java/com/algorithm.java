package com;

import java.util.ArrayList;
import java.util.HashSet;

public class algorithm {

	//http://www.csdn.net/article/2014-04-10/2819237-Top-10-Algorithms-for-Coding-Interview
	//http://www.jiuzhang.com/course/1/
	//https://www.geeksforgeeks.org/remove-an-element-at-specific-index-from-an-array-in-java/
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
    s.charAt(2);
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
	
	public static boolean palinDromeNumber(int x){
		
		char[] a =  Integer.toString(x).toCharArray();
		
		String temp = "";
		
		for (int i=a.length-1;i>=0;i--) {
			
			temp+=a[i]; 
		}
		
		String str = new String(temp);
		
		
		if (!Integer.toString(x).equals(str)) {
			
			return false;
		}
		
			return true;
	}
	
	public static int binarySearch (int a [], int first,int last,int toSearchNumber) {
		
		if (last>=first){
			
			int mid = first + (last - first)/2;
			if (a[mid]==toSearchNumber) {
				
				return mid;
			}
			if (a[mid]>toSearchNumber) {
				
				return binarySearch (a,  first,mid-1,toSearchNumber);
			}else {
				
				return binarySearch (a,   mid+1,last,toSearchNumber);
			}
		}
		  return -1;
	}
	public int removeDupNumber(int [] a, int n) {

           if (n==0||n==1) {
               return n;
           }
            
            int j = 0;
            int[] temp = new int[n];

            for (int i = 0; i < n - 1;i++ )
            {
                if (a[i]!=a[i+1]) {

                    temp[j++]=a[i];
                
                }
            }

            temp[j++] = a[n - 1];

            for (int i = 0; i < j;i++ )
            {
                a[i] = temp[i];
            }


            return j;

        }
		
		static bool isNotFour(int n)
        {
            return n != 4;
        }

		public int [] deleteOneNumber(int [] a, int key) {

            int index = findNumer(a, key);
            int [] temp = new int [a.Length-1] ;
            int j =0;
            for (int i = 0; i < a.Length;i++ )
            {

                if (i == index) {

                    continue;
                }

                temp[j++] = a[i];

            }

            for (int i = 0; i < j;i++ )
            {
                Console.WriteLine(temp[i]);
            }


             return temp;
        }
		
		public int findNumer(int[] a, int key)
        {
            for (int i = 0; i < a.Length; i++)
            {
                if (key == a[i])
                {

                    return i;
                }
            }

                return -1;
        }

	
}
