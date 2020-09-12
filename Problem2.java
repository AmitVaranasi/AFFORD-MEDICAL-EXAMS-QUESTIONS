/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afford_medical;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author amitm
 */
public class Problem2 {
        public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(chars[i] == '['||chars[i] == '{' || chars[i]=='('){
                //System.out.println("i am in");
                stack.push(chars[i]);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            else{
                char c = stack.peek();
                switch(chars[i]){
                    case '}':
                        
                        if(c == '{'){
                            stack.pop();
                        }
                        else{
                            return false;
                        }
                        break;
                    case ']':
                        //char c = stack.peek();
                        if(c == '['){
                            stack.pop();
                        }
                        else{
                            return false;
                        }
                        break;
                    case ')':
                       // char c = stack.peek();
                        System.out.println(c+" "+ chars[i]);
                        if(c == '('){
                            stack.pop();
                        }
                        else{
                            return false;
                        }
                        break;
                    default:
                        return false;
                        
                }
            }
        }
        if(stack.isEmpty()){
            return true;    
        }
        return false;}
        
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Problem2 p = new Problem2();
        System.out.println(p.isValid(str));
    }
}
