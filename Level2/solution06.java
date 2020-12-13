package Level2;

import java.util.Arrays;

public class solution06 {
	
	// 짝지어 제거하기 => 처음 코드..
	
	public static int solution(String s) {
		int answer = 0;
		
		char[] arr = s.toCharArray();
		
		int cnt = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length-1) {
				if(arr[i] == arr[i+1]) {
					arr[i] = '0';
					arr[i+1] = '0';
					cnt++;
				}
			} else {
				break;
			}
		}
		
		
		if(cnt != 0) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != '0') {
					for(int j = i+1; j < arr.length; j++) {
						if(arr[j] != '0') {
							if(arr[i] == arr[j]) {
								arr[i] = '0';
								arr[j] = '0';
								cnt = 0;
								i = 0;
							} else {
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '0') {
				cnt++;
			}
		}
		if(cnt == arr.length) {
			answer = 1;
		} else {
			answer = 0;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("baabaa"));
		System.out.println(solution("cdcd"));
		System.out.println(solution("cdcddd"));
		System.out.println(solution("cabaabac"));
		System.out.println(solution("dcabaabacd"));
		System.out.println(solution("dcabaabacde"));
	}

}
