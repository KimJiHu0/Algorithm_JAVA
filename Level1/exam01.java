package Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class exam01 {
	
	/*
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
	      String a = n + "";
	      char[] array = a.toString().toCharArray();
	      char temp = 0;
	      for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array.length; j++) {
	            if (array[i] > array[j]) {
	               temp = array[j];
	               array[j] = array[i];
	               array[i] = temp;      
	            }
	         }
	      }
	      a = new String(array);
	      answer = Integer.parseInt(a);
	      
	      return answer;
	   }
	
	public static void main(String[] args) {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(solution(n));
	}

}
