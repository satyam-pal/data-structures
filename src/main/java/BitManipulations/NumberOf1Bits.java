package BitManipulations;

public class NumberOf1Bits {
    /*
    Problem Description
    Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
     */
    public int numSetBits(int A) {
        int count = 0;
        while(A>0){
            count++;
            A = A&(A-1);
        }
        return count;
    }
}
