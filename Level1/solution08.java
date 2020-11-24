package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution08 {
	
	/*
	 * [문제설명]
	 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을
	 * 반환하는 함수, solution을 작성하시오
	 * divisor로 나누어 떨어지는 element가 하나도 없다면 -1를 담아 반환하세요.
	 * 
	 * [제한조건]
	 * arr은 자얀수를 담은 배열입니다.
	 * 정수 i, j에 대해 i != j면 arr[i]입니다.
	 * divisor는 자연수입니다.
	 * array는 길이 1이상인 배열입니다.
	 * 
	 * [입출력 예]
	 * arr : [5,9,7,10]
	 * divisor : 5
	 * return : [5, 10]
	 * 
	 * [3,2,6] / 10 / [-1]
	 */
	
	public static int[] solution(int[] arr, int divsior) {
		int[] answer = {};
		
		// list를 하나 선언해준다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// int배열 arr의 길이만큼 for문을 돌려준다.
		for(int i = 0; i < arr.length; i++) {
			// 만약에 arr의 i번지에 있는게 divsior의 값이랑 나눠서 나머지가 0이라면
			if(arr[i] % divsior == 0) {
				// list에 arr의 i번지를 add해준다.
				list.add(arr[i]);
			}
		}
		
		// 그렇게 다 돌고난 후에 list가 비어있다면
		if(list.isEmpty()) {
			// list에 -1를 넣어준다.
			list.add(-1);
		}
		
		// int배열인 answer의 크기를 정의해준다.
		answer = new int[list.size()];
		
		// list의 크기만큼 for문을 돌려주며
		for(int i = 0; i < list.size(); i++) {
			// answer의 i번지에 list의 i번지의 값을 넣어준다.
			answer[i] = list.get(i);
		}
		// answer를 정렬한다.
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {5,9,7,10}, 5)));
		System.out.println(Arrays.toString(solution(new int[] {2,36,1,3}, 1)));
		System.out.println(Arrays.toString(solution(new int[] {3,2,6}, 10)));
	}

}
