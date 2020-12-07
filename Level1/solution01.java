package Level1;

import java.util.Arrays;

public class solution01 {
	
	/*
	 * 정수 내림차순으로 배치하기
	 * 
	 * [문제설명]
	 * 함수 solution은 정수 n을 매개변수로 입력받습니다.
	 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 * 
	 * [제한조건]
	 * n은 1이상 8000000000 이하인 자연수입니다.
	 * 
	 * [입출력 예]
	 * n : 118372
	 * return : 873211
	 */
	
	public static long solution(long n) {
		  long answer = 0;
	      
		  String[] nArr = String.valueOf(n).split("");
		  Arrays.sort(nArr);
		  
		  String nStr = "";
		  for(int i = nArr.length-1; i >= 0; i--) {
			  nStr += nArr[i];
		  }
		  answer = Long.parseLong(nStr);
		  
	      return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}

}
