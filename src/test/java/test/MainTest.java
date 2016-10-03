package test;


import com.Solution;
import com.TestStack;
import org.testng.annotations.Test;

import java.util.Stack;


/**
 * Created by David on 2016/9/17.
 */
public class MainTest {

    @Test
    public void testMethod(){

        //algorithm.lengthOfLongestSubstring("11");
        System.out.println("testMethod");
        Solution s = new Solution();
        System.out.println(s.reverseString("type"));
        System.out.println("test");



    }
    @Test
    public void testMethodtwo(){

        System.out.println("This is test method two!");
        Stack stack = new Stack();
        // populating stack
        stack.push("Java");
        stack.push("Source");
        stack.push("code");
        System.out.println("Removed object is: "+stack.pop());
        System.out.println("Elements after remove: "+stack);
        System.out.println("Top object is: "+stack.peek());
        System.out.println("Searching 'code' in stack: "+stack.search("Source"));
        System.out.println("Is stack empty: "+stack.empty());
        TestStack ts = new TestStack();
        ts.push("1");
        ts.push("2");

    }


}
