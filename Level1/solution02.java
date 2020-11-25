package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class solution02 { 
	
	/*
	 * [문제설명]
	 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
	 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
	 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
	 * 
	 * [제한조건]
	 * arr은 길이 1 이상인 배열입니다.
	 * 인덱스 i,j에 대해 i != j이면 arr[i] != arr[j]입니다.
	 * 
	 * [입출력 예]
	 * arr : [4,3,2,1] 
	 * return [4,3,2]
	 * arr : [10]
	 * return : [-1]
	 */
	
	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		
		if(arr.length == 1) {
			answer[0] = -1;
		} else {
			answer = new int[arr.length-1];
			for(int i = 0; i < arr.length-1; i++) {
				answer[i] = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		String str = input + "";
		
		String[] strs = new String[str.length()];
		int[] arr = new int[str.length()];
		
		strs = str.split("");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
		
		System.out.println(Arrays.toString(solution(arr)));
		
	}

}
