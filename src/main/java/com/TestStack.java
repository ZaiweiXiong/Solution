package com;
import java.util.Stack;

/**
 * Created by David on 2016/9/18.
 */
public class TestStack {
        Stack stack = new Stack();


    public Stack TestStack (){

        return this.stack;
    }
    public void pop(){

        //return stack.pop();
    }
    public void push(Object obj){

        stack.push(obj);
    }
    public boolean isEmpty(){

        return stack.isEmpty();
    }
    public void peek(){
        stack.peek();
    }

}
