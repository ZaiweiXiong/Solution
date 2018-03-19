package com;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.Scanner;

public class MyJavaTest {
	
	//http://staff.scem.uws.edu.au/~zhuhan/pprof/
	@DataProvider(name = "Authentication")
	
	public static Object[][] createData1() {
		 
        return new Object[][] {
        		
        		{ "", new Integer(5) }
        		
        };
 
	}
 
	@Test
	public void PPYes (){
		
		 System.out.println();
	     System.out.println("        Programming Proficiency, Yes!!!");
	     System.out.println("        ===============================");   
	     System.out.println();
	}
	
	@Test
	public void hourglassShape () {
		
		//first triangle	  
		for (int row=0;row<5-1;row++) {
			
			for (int j=0;j<row;j++) {
				
				System.out.print(" ");
			}
			for (int column=5-row;column>0;column--) {
				
				 	System.out.print("# ");
				 	
				}
					
				System.out.println();
					
			
			}
		//second triangle
		for (int row=0;row<5;row++) {
			
			 for (int j=5-row;j>1;j--) {
				
				System.out.print(" ");
			}
				
			 for (int conlumn=0;conlumn<row+1;conlumn++) {
					
				 	System.out.print("# ");
				 	
				}
			
			 System.out.println();
		}
		 
		
		  System.out.println("       ===============================");   
	}
	
	@Test 
	public void testPrintHourglassShape  () {
		
		for (int row=5;row>0;row--) {
			
			for (int j=row;j<5;j++) {
				
				 System.out.print(" ");
			}
			for (int coulmn=row;coulmn>0;coulmn--) {
				
				 System.out.print("@ ");
			}
			 System.out.println();
		}
		
		for (int row=2;row<=5;row++) {
			
			
			for (int j=row;j<5;j++) {
				
				 System.out.print(" ");
			}
			
			
			for (int coulmn=0;coulmn<row;coulmn++){
				
				 System.out.print("@ ");
			}
			
			 	System.out.println();
		}
	}
	
	
	@Test
	
	public void StudentGrades () {
		
		System.out.println ("///////////////////\\\\\\\\\\\\\\\\\\\\"
                 + "\\\\\\\\\\\\\\\\\\");
		System.out.println ("==          Student Points          ==");
		System.out.println ("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////"
                 + "///////////////");
		System.out.println();

		// Print table
		System.out.println ("Name\t\tLab\tBonus\tTotal");
		System.out.println ("----\t\t---\t-----\t-----");
		System.out.println ("Joe\t\t43\t7\t" + (43 + 7));
		System.out.println ("William\t\t50\t8\t" + (50 + 8));
		System.out.println ("Mary Sue\t39\t10\t" + (39 + 10));
		System.out.println ("Sarah\t\t46\t9\t" + (46 + 9));
		System.out.println ("Hank\t\t35\t6\t" + (36 + 6));
		
		
	}
	
	@Test
	public void  Circle () {
		
		final double PI = 3.14159;
	    int radius = 10;
	    double area = PI * radius * radius;
	    System.out.println("The area of a circle with radius " + radius +
	               " is " + area);
	   
	 
	    Scanner scan = new Scanner(System.in) ;
	    System.out.println("please input radius: ");
	    radius  = scan.nextInt();
	   
	    
	    area = PI * radius * radius;
	    System.out.println("The area of a circle with radius " + radius +
	               " is " + area);
	}
	
	@Test 
	
	public void testNumber () {
		
		int dollars =20;
		double money = dollars;
		System.out.println("money "+money);
		
		int total = 50;
		float result = (float)total/6;
		System.out.println("result "+ result);
		
		 String name = new String("George Bush"); 
		System.out.println("name "+ name);
		
		System.out.println("There " + "Everywhere");
		System.out.println("But not" + "in Texas");
		
		float t =20.3f;
		int a=0;
		a=(int)t;
		System.out.println("a->"+t);
		
	}
	
		 			
@Test(dataProvider = "Authentication")
	
	private void go(String s,Integer n) {

        //String s = "";
        for (int i = 0; i < n; i++) s += " *";
        String w = "";
        for (int i = 0; i < n; i++) w += " ";

        for (int i = n; i > 0; i--) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
        for (int i = 2; i <= n; i++) {
            System.out.print(w.substring(i));
            System.out.println(s.substring((n - i) * 2));
        }
    }
	
}
