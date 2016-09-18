package com;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution {


	public int reverse(int x) {
		//flag marks if x is negative
		boolean flag = false;
		if (x < 0) {
			x = 0 - x;
			flag = true;
		}
	 
		int res = 0;
		int p = x;
	 
		while (p > 0) {
			int mod = p % 10;
			p = p / 10;
			res = res * 10 + mod;
		}
	 
		if (flag) {
			res = 0 - res;
		}
	 
			return res;
	}
	  public int reverset(int x) {
		  int min = Integer.MIN_VALUE;
		  int max = Integer.MAX_VALUE;
		  int c=0;
		  if (min< x && x <max){
			  
			  if (x<0){
				  int b = -x;
				  String str = Integer.toString(b);
				  StringBuffer sb = new StringBuffer(str);
				  StringBuffer strq = sb.reverse();
				  String s= strq.toString();
			      int temp = Integer.parseInt(s);
				  c=-temp;
				  System.out.println("after c->"+c);
			  }else {
				  String str = Integer.toString(x);
				  StringBuffer sb = new StringBuffer(str);
				  StringBuffer strq = sb.reverse();
				  String s= strq.toString();
			      int temp = Integer.parseInt(s);
				  System.out.println("after reverse->"+temp);
				  	return temp;
			  }
		  }
		 
		  	
		  	  		return c;   
	    }
	//66. Plus One
	 public int[] plusOne(int[] digits) {
		    if(digits==null||digits.length==0)
		        return new int[0];
		 
		    int carry = 1;    
		    for(int i=digits.length-1; i>=0; i--){
		        int sum = digits[i]+carry;
		        if(sum>=10){
		            carry=1;
		        }else{
		            carry=0;
		        }
		        digits[i]=sum%10;
		    }
		 
		    if(carry==1){
		        int[] result = new int[digits.length+1];
		        System.arraycopy(digits, 0, result, 1, digits.length);
		        result[0]=1;
		        return result;
		    }else{
		      
		        return digits;
		    }
		}

public static int firstNonRepeatedCharacter(String inputString){
    Map<Character,Integer>  map= new LinkedHashMap<Character ,Integer>(); 
    
    
    char ar[]=inputString.toCharArray();
    char ch ;
   
    for (int i=0; i<ar.length; i++){
     ch=ar[i];
     
     if(map.containsKey(ch))  
         map.put(ch, map.get(ch)+1 );
     else       
         map.put(ch, 1) ;
     
    }    
   
    for (int i=0; i<ar.length; i++ ){
     ch= ar[i];
     if( map.get(ch)  == 1 )  
       return i;
    }
    	return -1 ;
}
public int firstUniqChar(String s, String u){

for (int i=0;i<s.length();i++) {
		
		//System.out.println("chart[i]->"+s.charAt(i));
		int t=0;
		for (int j=0;j<s.length();j++) {
			
			if (s.charAt(i)==s.charAt(j)) {
				t++;
				
			}
			//System.out.println("chart[j]->"+s.charAt(j));
		}
			//System.out.println("t->"+t);	
			if (t==1) {
				
				System.out.println(s.charAt(i));
				return i;
			}
			
	}		
			return -1;
}
	 public int[] intersection(int[] nums1, int[] nums2) {
	        if (nums1 == null || nums2 == null) {
	            return null;
	        }
	        
	        HashSet<Integer> hash = new HashSet<Integer>();
	        for (int i = 0; i < nums1.length; i++) {
	            hash.add(nums1[i]);
	        }
	        
	        HashSet<Integer> resultHash = new HashSet<Integer>();
	        for (int i = 0; i < nums2.length; i++) {
	            if (hash.contains(nums2[i]) && !resultHash.contains(nums2[i])) {
	                resultHash.add(nums2[i]);
	            }
	        }
	        
	        int size = resultHash.size();
	        int[] result = new int[size];
	        int index = 0;
	        for (Integer num : resultHash) {
	            result[index++] = num;
	        }
	        
	        return result;
	    }
	
	 public int[] intersectiont(int[] nums1, int[] nums2) {
		 
		     Vector<Integer> v = new Vector<Integer>();
	         Set<Integer> set =  new HashSet<Integer>();
	         List<Integer> list = new ArrayList<Integer>();
	         
	         for (int i=0;i<nums1.length;i++){
	        	 set.add(nums1[i]);
	         }
	         
	         Iterator it = set.iterator();
	         while (it.hasNext()){
	        	 Object o = it.next();
	        	 int temp = Integer.parseInt(o.toString());
	        	 //System.out.println("temp:"+temp);
	        	 for (int j=0;j<nums2.length; j++){
	        		 if (temp==nums2[j]){
	        			 System.out.println("temp:"+temp);
	        			 //v.add(temp);
	        			 list.add(nums2[j]);
	        		 }
	        	 }
	        	
	         }
	         int [] nums3 = new int[1];
	           nums3[0]=list.get(0);
	         System.out.println("v->"+list.size());
	         System.out.println("num3->"+nums3.length);
		      return nums3;
	    }
	 public boolean canConstructt(String ransomNote, String magazine) {
		  
		 	if(ransomNote.length() == 0)
	            return true;
	        int[] cnt = new int[26];
	        for (int i = 0; i < magazine.length(); i++) cnt[magazine.charAt(i) - 97]++;
			for (int i = 0; i < ransomNote.length(); i++) if (--cnt[ransomNote.charAt(i) - 97] < 0) return false;
			return true;
	    }
	
public boolean canConstruct(String ransomNote, String magazine) {
        		
	          boolean t = false;
	          
	          if (ransomNote.length()<magazine.length()){
	        	  
	        	  for (int j=0;j<ransomNote.length();j++) {
	      	    	
		    	    	String temp = String.valueOf(ransomNote.charAt(j));
		    	    	if(magazine.contains(temp)){
		    	    		t= true;
		    	    	}
		    	    }
			   }
	     
	    	   				return t;
	    	  }
	
	public TreeNode invertTree(TreeNode root) {
	    if (root == null) {
	        return null;
	    }
	    TreeNode right = invertTree(root.right);
	    TreeNode left = invertTree(root.left);
	    root.left = right;
	    root.right = left;
	    return root;
	}
	
	
	
	
	
	
	
	
	//Maximum Depth of Binary Tree
	public int maxDepth( TreeNode root) {
        
        if(root == null)    return 0;
         
        return getDepth(root, 1);
    }
     public int getDepth( TreeNode node, int depth) {
        int left = depth, right = depth;
        if(node.left != null) left = getDepth(node.left, depth + 1);
        if(node.right != null) right = getDepth(node.right, depth + 1);
         
        return left > right ? left : right;
    }
	
public	int singleNumber(int[] nums) { 
		
		  int left = nums[0];  
		  
		     for(int i =1; i< nums.length; i++)  
		     {  
	            left = left ^ nums[i];  
		      }  
		     
		     	return left;  
	   }  
	
	public char findTheDifference(String s, String t) {
        char ans = 0;
        for (int i = 0; i < s.length(); i++) {
        	ans ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
        	ans ^= t.charAt(i);
        }
        	return ans;
    }
    
	
	 public char findTheDifference(String s,String t,String c) {
		 
		   
		    char different='d';
		   
		    char char_t[] = t.toCharArray();
		    
		    if (s==""){return char_t[char_t.length-1]; }
		    else {
		    	char char_s[] = s.toCharArray();
				   
			    
		    	for (int i=0;i<char_s.length;i++){
			    	for (int j=0;j<char_t.length;j++){
			    		if(char_s[i]!=char_t[j]){
			    			different = char_t[j];
			    			
			    		}
			    	}
			    	
			    }
		    	
		    }
		    
		    
		    System.out.println("different->"+different);
	        	
		    return different;   
	    }
	 
	 public static String getRandomString(int length) {
	        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        Random random = new Random();//
	        StringBuffer sb = new StringBuffer();//StringBuffer
	        for (int i = 0; i < length; ++i) {
	        	
	            int number = random.nextInt(62);// [0,62)
	 
	            sb.append(str.charAt(number));
	        }
	        	return sb.toString();
	    }
	
	 public int trailingZeroes(int n) {
	        if ( n<0 ) return -1;
	        int count = 0;
	        for (long i=5; n/i>=1; i*=5) {
	            count += n / i;
	        }        
	        return count;
	    }
public void generate(int numRows,int t) {
	//Pascal's Triangle
	//Given numRows, generate the first numRows of Pascal's triangle.
	
	/*[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]*/
	    List<Integer> list = new ArrayList<Integer>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);
	    for (int row=1;row<=numRows;row++) {
	    	
	    	 for (int i=0;i<row;i++) {
	 	    	
	 	    	System.out.print(list.get(i));
	 	    }
	    	 	System.out.print("\n");
	    }
	 }

public static void sta(int n)  
{  
    for (int i = 0; i<n; i++ )  
    {  
        for (int j = i; j<n; j++)  
        {  
            System.out.print(" ");  
        }  
        for (int k = 0; k<2*i; k++)  
        {  
            System.out.print("*");  
        }  
        System.out.println();  
          
    }  
}  

public List<ArrayList<Integer>> generate(int numRows) {
    
	List <ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	if (numRows <= 0)
		return result;

	ArrayList<Integer> pre = new ArrayList<Integer>();
	pre.add(1);
	result.add(pre);

	for (int i = 2; i <= numRows; i++) {
		ArrayList<Integer> cur = new ArrayList<Integer>();

		cur.add(1); //first
		for (int j = 0; j < pre.size() - 1; j++) {
			cur.add(pre.get(j) + pre.get(j + 1)); //middle
		}
		cur.add(1);//last

		result.add(cur);
		pre = cur;
	}

	return result;

       
   }


      

	public int compareVersion(String version1, String version2) {
	    String[] arr1 = version1.split("\\.");
	    String[] arr2 = version2.split("\\.");
	 
	    int i=0;
	    while(i<arr1.length || i<arr2.length){
	        if(i<arr1.length && i<arr2.length){
	            if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
	                return -1;
	            }else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
	                return 1;
	            }
	        } else if(i<arr1.length){
	            if(Integer.parseInt(arr1[i]) != 0){
	                return 1;
	            }
	        } else if(i<arr2.length){
	           if(Integer.parseInt(arr2[i]) != 0){
	                return -1;
	            }
	        }
	 
	        i++;
	    }
	 
	    return 0;
	}

	
	public int compreversion (String version1, String version2) {
		   //String [] version1.split("\\.");
		   
		   double v1 = Double.parseDouble(version1);
		   double v2 = Double.parseDouble(version2);
		   if(v1>v2){
			   
			   return 1;
			   
		   }else if (v1<v2){
			   
			   return -1;
			   
		   }else {
			   
			   return 0;
		   }
		   
		   
			
	}
	 public int getSum(int a, int b) {
		 
		 String stra = Integer.toString(a);
		 String strb = Integer.toString(b);
		 String str = new BigInteger(stra).add(new BigInteger(strb)).toString() ;
		 int sum = Integer.valueOf(str);
		 //return printf("%*c%*c",  a, '\r',  b, '\r');
		 //System.out.println("sum->"+sum);
	      
		 return sum;
	      
	    }
public boolean isValid(String s) {
	
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
 
	Stack<Character> stack = new Stack<Character>();
 
	for (int i = 0; i < s.length(); i++) {
		char curr = s.charAt(i);
 
		if (map.keySet().contains(curr)) {
			stack.push(curr);
		} else if (map.values().contains(curr)) {
			if (!stack.empty() && map.get(stack.peek()) == curr) {
				stack.pop();
			} else {
				return false;
				}
			}
		}
 
			return stack.empty(); 
    }
	
	public void regualExpression () {
		
		/*
		Pattern pattern = Pattern.compile("b*g");  
        Matcher matcher = pattern.matcher("bbg");  
        System.out.println("regualExpression->"+matcher.matches());  
        System.out.println(pattern.matches("regualExpression->"+"b*g","bbg")); 
        */
        
		 
		 String regex = "\\([^\\(\\)]*(\\([^\\(\\)]*\\)[^\\(\\)]*)*\\)"; 
		 String str="11(a(b))";
		
         Pattern pDate = Pattern.compile(regex);
         Matcher mDate = pDate.matcher(str); 
         if (mDate.find()) {
        	 System.out.println("regualExpression->Yes"); 
         }else {
        	 System.out.println("regualExpression->No"); 
         }
         
         /*
         String string="[1,2,3]";
         String regex="[\\[\\]]";
         String[] arr = string.split(regex);
         for (String string2 : arr) {
         System.out.println("string2->"+string2);
         }
         */
	}
	
	 public void rotate(int[] nums, int k) {
		 
		 int n = nums.length;
		 int i = (n-k);
		 int j =  0;
		 
		 
		 if (nums == null || k < 0) {
			    throw new IllegalArgumentException("Illegal argument!");
			}
		 if (nums.length>0){
			 
			 
			 while (i<=(n-1)) {
				 
				 System.out.println("nums[i]->"+nums[i]);
				 i++;
				 
				 if (i>(n-1)&j<(n-k)) {
					 
					while (j<(n-k)) {
						
						 System.out.println("nums[j]->"+nums[j]);
						 j++;
						 System.out.println("j->"+j);
					} 
				 }
				
			 }
		 }
	}
	
	 public String reverseVowels(String s) {
		 	
		    int i = 0;
		    int j = s.length()-1;
		    char[] c = s.toCharArray();
		    
		    while (i<j) {
		    	
		    	if (!isVowels(c[i])) {
		    		i++;
		    		continue;
		    	}
		    	if (!isVowels(c[j])) {
		    		j--;
		    		continue;
		    	}
		    	
		    	char temp = c[i];
		    	c[i] = c[j];
		    	c[j] = temp;
		    	i++;
		    	j--;
		    	
		    }
		    
		    s = new String(c);
		   
	        System.out.println("reserve->"+s);
	        
		 	return s;
	    }
	 
	 public boolean isVowels (char v) {
		 
		 boolean vowe = false;
		 String Vowels ="AEIOUaeiou";
		 for (int i=0;i<Vowels.length();i++) {
			 
			 if (v == Vowels.charAt(i)) {
				 vowe=true;
			 } 
		 }
		 		return vowe;
	 }
	 
public int removeElement(int[] nums, int val) {
	
	int i = 0;
    for (int j = 0; j < nums.length; j++) {
    	
        if (nums[j] != val) {
        	
            nums[i] = nums[j];
          
            i++;
        }
        
    }
   
    	return i;
}
	
	public void removedupNumber () {
		
		 List list = new ArrayList();
         list.add(1); 
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(3);
         //Collections.reverse(list);
         
         for (int i=0;i<list.size();i++) {
        	 
        	 System.out.println("before i1 ->"+list.get(i));
        	 
        	 for (int j=0;j<i;j++) {
        		 
        		 if(list.get(i)==list.get(j)){
        			 
        			 System.out.println("dup -> "+list.get(i));
        			 list.remove(i);
        		 	}
        		
        		 
        	 	}
        	 
         	}
         	
         		System.out.println("after size -> "+list.size());
         	
         	for (int k=0;k<list.size();k++) {
         		
         		System.out.println("after -> "+list.get(k));
         	}
		
	}
	
	public int majorityElement(int[] nums) {
		
		if (nums.length == 1) {
			
			return nums[0];
		}
	 
			Arrays.sort(nums);
			return nums[nums.length / 2];
	
	}
	public int rmajorityElement(int[] nums) 
	
	{
		 if(nums.length==1){
	            return nums[0];
	        }
	 
	        Arrays.sort(nums);
	 
	        int prev=nums[0];
	        int count=1;
	        
	        System.out.println("prev nums[0]:"+prev);
	        
	        for(int i=1; i<nums.length; i++){
	        	
	            if(nums[i] == prev){
	            	
	            	System.out.println("nums[i]:"+nums[i]+":"+i);
	            	System.out.println("prev:"+prev);
	                count++;
	                if(count > nums.length/2) return nums[i];
	                
	            }else{
	                count=1;
	                prev = nums[i];
	            }
	        }
	 
	        return 0;
	    }
		
	
	
	 public boolean containsDuplicate(int[] nums) {
		 
	        	boolean contains = false;
	        	Set<Integer> set = new LinkedHashSet<Integer>();
	        	
	        	for (int i=0;i<nums.length;i++) {
	        		set.add(nums[i]);
	        	}
	        	
	        	if(set.size()<nums.length){
	        		
	        		contains=true;
	        	}
	       
	        		System.out.println("contains= "+contains);
		   			
	        		 return contains;
	    }
	
public int titleToNumber(String s) {
	
	  String [] letters ={
			  "A","B","C","D","E","F",
			  "G","H","I","J","K","L",
			  "M","N","O","P","Q","R",
			  "S","T","U","V","W","X",
			  "Y","Z"
			  };
	 
	  if(s==null || s.length() == 0){
	        throw new IllegalArgumentException("Input is not valid!");
	    }
	  
	
	  HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	  
	    char c = 'A';
	    for(int i=1; i<=26; i++){
	        map.put(c, i);
	        c += 1; 
	    }
	    System.out.println("mapSize:"+map.size());
	    
	    int result = 0;
	    int i = s.length()-1;
	    int t = 0;
	    while(i >= 0){
	    	
	        char curr = s.charAt(i);
	        result = result + (int) Math.pow(26, t) * map.get(curr);
	      
	        t++;
	        i--;
	    }
	 
	    	return result;
     }
public void bubble () {
	
	int [] a = {3,2,6,0,10,7};
	
	for (int i=0;i<a.length;i++) {
		
		for (int j=i;j<a.length;j++) {
			if(a[i]<a[j]){
				int temp = a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	for (int k=0;k<a.length; k++) {
		
		System.out.println("after:"+ a[k]);
	}
}
public void deleteNode(ListNode node) {
	
    
	    node.val = node.next.val;
	    node.next = node.next.next;
       
}

	 public boolean canWinNim(int n) {
		 
	        boolean canWin=false; 
	        
	        if (n%4!=0){
	        	
	        	canWin=true;
	        	
	        }
	        
	        	return canWin;
	    }
	
	 public void moveZeroes(int[] nums) {
		 
		 boolean exe = true;
		 
		    if (exe){
		    	System.out.println("exe: "+exe);
		    	 for (int i=0;i<nums.length;i++) {
			        	
		 	        
		        		
		        		for (int j=i;j<nums.length;j++) {
			        		
			        		if (nums[i]<nums[j]|nums[i]>(-1)) {
			        			
			        			if (nums[i]==0){
			        				int temp = nums[i];
				        			nums[i]=nums[j];
				        			nums[j]=temp;
			        			}
			        			
			        			
			        		}
			        	}
		        		
		        	
		        
		        }
		    	 
		    }else {
		    	System.out.println("illegal!");
		    	}
	       
	        for (int k=0;k<nums.length;k++) {
	        	
	        	System.out.println(nums[k]);
	        }
	    }
	 public String reverseString(String s) {
		 
		/*
		 String str="";
	     char [] c = s.toCharArray();
	     
	     for (int i=c.length-1; i>=0; i--) {
	    	
	    	 String s_ = String.valueOf(c[i]);
	    	 str+=s_;
	    	
	    	 
	     }
	        System.out.println("after reverse: "+str);
		 	return str;
		*/
		StringBuffer sb = new StringBuffer(s);
		StringBuffer strq = sb.reverse();
		System.out.println("strq: "+ strq);
		s= strq.toString();
		 return s;
	    }
}
