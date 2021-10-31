package Lesson;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(10);
	}

	private static int solution(int N) {
        // write your code in Java SE 8
        int temp = 0;
        int result=0;
        int checkcnt=0;

        String binaryStr = Integer.toBinaryString(N);
        char arr[] = binaryStr.toCharArray();
        System.err.println("~~ binaryStr : " + binaryStr);

        for(int i=0; i<arr.length; i++){
            if(arr[i]=='0'){
                temp+=1;           
            }else{
                checkcnt+=1;
                temp=0;
            }           
            result = result<temp?temp:result;    
        }
            result = checkcnt<2?0:result;
        return result;
	}
}
