package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {

    /*
    Problem Description
    Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
     */

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0;int b = 0;
        while(a<A.size() || b<B.size()){
            if(a >= A.size()){
                result.add(B.get(b));
                b++;
            }
            else if(b >= B.size()){
                result.add(A.get(a));
                a++;
            }
            else{
                if(A.get(a)>B.get(b)){
                    result.add(B.get(b));
                    b++;
                }
                else{
                    result.add(A.get(a));
                    a++;
                }
            }
        }
        return result;
    }
}
