package Array;

import java.util.ArrayList;

public class FirstMissingInteger {
    /*
    Problem Description
    Given an unsorted integer array, A of size N. Find the first missing positive integer.
     */
    public int firstMissingPositive(ArrayList<Integer> A) {
        for(int i=0;i<A.size();i++){
            if(A.get(i)>0 && A.get(i)<A.size() &&(A.get(i) != A.get(A.get(i)-1))){
                Integer temp = A.get(A.get(i)-1);
                A.set(A.get(i)-1,A.get(i));
                A.set(i,temp);
                i--;
            }
        }
        for(int i =0;i<A.size();i++){
            if(A.get(i)!=i+1){
                return i+1;
            }
        }
        return A.size()+1;
    }
}
