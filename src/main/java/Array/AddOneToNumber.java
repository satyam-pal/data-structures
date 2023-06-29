package Array;

import java.util.ArrayList;

public class AddOneToNumber {
    /*
    Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
    The digits are stored such that the most significant digit is at the head of the list.
     */


    public ArrayList<Integer> addOne(ArrayList<Integer> A) {
        int carry = 0;
        int n = A.size()-1;
        ArrayList<Integer> res = new ArrayList<>();
        int toAdd = 1;
        int rsb = 0;
        for(int i=0;i<=n;i++){
            if(A.get(i)>0){
                rsb = i;
                break;
            }
        }
        while(carry>0 || n>=rsb){
            int temp = carry;
            if(n>=0){
                temp = temp+A.get(n)+toAdd;
                n--;
                toAdd=0;
            }
            carry = temp/10;
            temp = temp%10;
            if(temp>0 || carry >0 || n>=rsb)
                res.add(0,temp);
        }
        return res;
    }
}
