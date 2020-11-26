package Level1;

import java.util.Arrays;

public class solution24 {
	
	// 자연수 뒤집어 배열로 만들기
	
	// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형대로 리턴하세요.
	
	public static int[] solution(long n) {
        
		// 받아온 n값을 String으로 변환 후
        String nStr = String.valueOf(n);
        
        // nArr이라는 배열에 하나씩 담아준다.
        String[] nArr = nStr.split("");
        //[1,2,3,4,5]
        
        // answer이라는 int배열의 크기를 지정하여 선언하고
        int[] answer = new int[nArr.length];
        // result라는 변수를 선언한다.
        int result = 0;
        
        // for문으로 nArr의 뒤부터 맨 처음까지 for문을 돌리며
        for(int i = nArr.length-1; i >= 0; i--) {
        	// answer의 result번지에 nArr의 뒤부터 처음까지의 index를 int형태로 형변환 후 넣어준다.
        	answer[result] = Integer.parseInt(nArr[i]);
        	result++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(12345)));
	}

}
