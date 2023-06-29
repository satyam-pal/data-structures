package BitManipulations;

import java.util.List;

public class SingleNumberOccuringThrice {
    /*
    Problem Description
    Given an array of integers, every element appears thrice except for one, which occurs once.

    Find that element that does not appear thrice.
     */
    public int singleNumber(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            if(max<A.get(i)){
                max = A.get(i);
            }
        }
        int maxShift = 0;
        // max = 31;
        while((1<<maxShift)<max){
            maxShift++;
        }
        int num = 0;
        for(int i=0;i<=maxShift;i++){
            int count = 0;
            for(int j=0;j<A.size();j++){
                int t = (1<<i);
                if( (t & A.get(j))> 0)
                    count++;
            }
            if(count%3 != 0){
                num = num+(1<<i);
            }
        }
        return num;
    }
}
