package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class GenerateAllParenthesis {

    /*
    Problem Description
    Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*A.
     */
    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> res = new ArrayList<>();
        if(A == 0){
            return res;
        }
        if(A == 1){
            res.add("()");
            return res;
        }
        ArrayList<String> temp = generateParenthesis(A-1);
        for(String s:temp){
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                    String t = s.substring(0,i+1)+"()"+s.substring(i+1,s.length());
                    if(!res.contains(t)){
                        res.add(t);
                    }
                }
            }
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                    String t = s.substring(0,i+2)+"()"+s.substring(i+2,s.length());
                    if(!res.contains(t)){
                        res.add(t);
                    }
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
