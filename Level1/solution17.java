package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution17 {
	
	/*
	 * 같은 숫자는 싫어
	 * 
	 * [문제설명]
	 * 배멸 arr이 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
	 * 이떄, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
	 * 단, 제거된 후 남은 수들을 반환할 때에는 배열 arr의 원소들의 순서를 유지해야 합니다.
	 * 예를들면 arr [1,1,3,3,0,1,1] 이면 [1,3,0,1]을 return해야합니다,
	 * arr이 [4,4,4,3,3] 이면 [4,3]을 return해야합니다.
	 */
	
	public static ArrayList<Integer> solution(int[] arr) {
		
		// 가변 배열 선언
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		// arr의 길이만큼 for문 돌려주며,
		for(int i = 0; i < arr.length-1; i++) {
			// 만일 arr의 i번지와 arr의 i+1번지가 같다면
			if(arr[i] == arr[i+1]) {
				// arr의 i번지를 -1로 바꿔준다.
				arr[i] = -1;
			}
		}
		// 결과값
		// [-1,1,-3,3,0,-1,1] / [-4, -4, 4, -3, 3]
		
		// 다시 arr의 길이만큼 for문을 돌려주면서, 
		for(int i = 0; i < arr.length; i++) {
			// 만일 arr의 i번지가 -1이 아니라면
			if(arr[i] != -1) {
				// array에 arr의 i번지를 add해준다.
				array.add(arr[i]);
			}
		}
		// 결과값
		// [1,3,0,1] / [4,3]
		
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,1,3,3,0,1,1}));
		System.out.println(solution(new int[] {4,4,4,3,3}));
	}

}
