package com;

import java.util.ArrayList;
import java.util.Stack;

public class LinkedList {
	
	public ListNode reverseList(ListNode head) {  
        if(head==null || head.next==null) return head;  
          
        ListNode pre = head;  
        ListNode p = head.next;  
        pre.next = null;  
        ListNode nxt;  
        while(p!=null) {  
            nxt = p.next;  
            p.next = pre;  
            pre = p;  
            p = nxt;  
        }  
        return pre;  
    }  
	
	 public ArrayList<Integer> preorderTraversal(TreeNode root) {
	        ArrayList<Integer> returnList = new ArrayList<Integer>();
	 
	        if(root == null)
	            return returnList;
	 
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        stack.push(root);
	 
	        while(!stack.empty()){
	            TreeNode n = stack.pop();
	            returnList.add(n.val);
	 
	            if(n.right != null){
	                stack.push(n.right);
	            }
	            if(n.left != null){
	                stack.push(n.left);
	            }
	 
	        }
	        return returnList;
	    }

}
