package Lesson3;

public class FlogJmp {
    public static void main(String[] args) {
		solution(10,85,10);	
	}

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int res = 1;


        if(X>Y || X<1 || X>1000000000 || Y<1 || Y>1000000000 || D<1 || D>1000000000) res=0;
        else{
                res = (int)Math.ceil((double)(Y-X)/D);
        }
        System.err.println("res : " + res);
        return res;
    }
}