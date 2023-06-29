package BitManipulations;

import java.util.List;

public class SingleNumber {
    /*
    Problem Description
    Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
     */
    public int singleNumber(final List<Integer> A) {
        Integer res = 0;
        for(int i=0;i<A.size();i++){
            res = res^A.get(i);
        }
        return res;
    }
}
