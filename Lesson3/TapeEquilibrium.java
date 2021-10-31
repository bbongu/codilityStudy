package Lesson3;

import java.util.Arrays;

public class TapeEquilibrium {
    public static void main(String[] args) {
    	int[] A = {1,2,6,5,3};
		int rst = solution(A);	
		System.err.println(rst);
	}

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int rst=0;
        int p=1;
        int tArr[] = new int[A.length];

        if(A==null || A.length<2 || A.length>100000) rst = 0;

        for(int i=0; i<A.length; i++){
             int t1=0;
             int t2=0;
             
             if(A[i]<-1000 || A[i]>1000){
                 rst=0;
                 break;
             }
             if(i<p) t1+=A[i];

             for(int j=p ;j<A.length; j++){
                t2+=A[j];
             }
             p+=1;
             tArr[i]=(t1-t2)<0?(t1-t2)*(-1):t1-t2;
        }   
        
        Arrays.sort(tArr);
        rst= tArr[0];
        return rst;
    }
}