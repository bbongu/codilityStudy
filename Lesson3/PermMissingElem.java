package Lesson3;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
    	int[] A = {1,2,6,5,3};
		solution(A);	
	}

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int rst = 1;
        int len = A.length;

        Arrays.sort(A);

        for(int i=0; i<len; i++){
           if(A[i]<0 || A[i]>100000) rst = 0;
           else rst=rst==A[i]?rst+1:rst;
        }
        System.err.println("rst : " + rst);
        return rst;
    }
}