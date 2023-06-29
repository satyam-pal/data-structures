package BitManipulations;

import java.util.ArrayList;

public class TwoNumberAppearOnce {

    /*
    Problem Description
    Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
    Find the two integers that appear only once.

    Return the two numbers in ascending order.
     */

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xor = 0;
        for(Integer i:A){
            xor = xor^i;
        }
        int temp = 0;
        while(((1<<temp)&xor) ==0){
            temp++;
        }
        int a = 0;
        int b = 0;
        for(Integer i:A){
            if((i & (1<<temp)) > 0){
                a = a^i;
            }
            else{
                b = b^i;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(a<b){
            res.add(a);
            res.add(b);
        }
        else{
            res.add(b);
            res.add(a);
        }
        return res;
    }
}
