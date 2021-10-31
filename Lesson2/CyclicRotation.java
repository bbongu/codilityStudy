package Lesson2;

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4};
		int resArr[] = solution(arr, 3);		
	}
	
	  public static int[] solution(int[] A, int K) {
	        // write your code in Java SE 8
	        int len = A.length;
	        int [] resArr = new int[len];

	         boolean isValid = isValidChk(A);

	        if(K<0 && K>100 || !isValid) {
				System.err.println("K is 0 betewen and 100");
			}else {            
	            int cnt = len* K;
	            int [] strArr = new int[cnt];
	          
	            
	            for(int i=0; i<cnt; i++){
	                strArr[i] = i<len?A[i]:A[i%len];
	            }

	            for(int j=0; j<len; j++){
	                resArr[j] = len%2==0?strArr[j+K]:strArr[j+K-1];
	                System.out.print( resArr[j] + " ");
	            } 
	        }
	        return resArr;
	   
	    }

	     public static boolean isValidChk(int[] A) {
	         boolean result = true;
	         for(int i =0; i<A.length; i++){
	            if(A[i]<-1000 || A[i]>1000) {
	                result = false;
	            }
	         }
	         return result;
	     }

}
