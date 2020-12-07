package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution02 {

	/*
	 * 제일 작은 수 제거하기
	 * 
	 * [문제설명]
	 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단,
	 * 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴
	 * 하고, [10]면 [-1]을 리턴 합니다.
	 * 
	 * [제한조건]
	 * arr은 길이 1 이상인 배열입니다. 인덱스 i,j에 대해 i != j이면 arr[i] != arr[j]입니다.
	 * 
	 * [입출력 예]
	 * arr : [4,3,2,1] return [4,3,2] arr : [10] return : [-1]
	 */

	public static int[] solution(int[] arr) {
		int[] answer = {};

		// list를 선언.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// arr의 length만큼 반복문 돌면서, 
		for(int i = 0; i < arr.length; i++) {
			// list에 arr의 i번지의 값을 add해준다.
			list.add(arr[i]);
		}
		
		// 일단 min이라는 변수에 arr의 0번지의 값을 대입한다.
		int min = arr[0];
		
		// list의 size가 1이라면
		if(list.size() == 1) {
			// answer에 -1을 넣은 채로 return
			return answer = new int[] {-1};
		// 그렇지 않다면
		} else {
			// list의 size만큼 반복문을 돌아주면서
			for(int i = 0; i < list.size(); i++) {
				// Math함수로서, 전자의 수와, 후자의 수를 비교해주는 것이고, 비교하여 작은 수를 min이라는 변수에 다시 담는다.
				min = Math.min(list.get(i), min);
			}
			
			// list의 size만큼 반복문을 돌아주면서
			for(int i = 0; i < list.size(); i++) {
				// list의 i번지가 min(최소값)과 같다면
				if(list.get(i) == min) {
					// list의 i번지를 remove한다.
					list.remove(i);
				}
			}
			// answer의 크기를 지정한다. (list의 size만큼)
			answer = new int[list.size()];
			// list의 size만큼 반복문을 돌리며
			for(int i = 0; i < list.size(); i++) {
				// answer의 i번지에 list의 i번지를 대입한다.
				answer[i] = list.get(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(new int[] { 4, 3, 2, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 3, 4, 1, 2 })));
		System.out.println(Arrays.toString(solution(new int[] { 4, 3, 2, 1, 1 })));
		System.out.println(Arrays.toString(solution(new int[] { 9, 8, 7, 6, 5 })));
		System.out.println(Arrays.toString(solution(new int[] { 10 })));

	}

}
