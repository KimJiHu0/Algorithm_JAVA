package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class solution09 {

	/*
	 * [문제설명]
	 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려
	 * 합니다. 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로
	 * strings를 정렬합니다.
	 * 
	 * [제한조건]
	 * strings는 길이 1 이상, 50이하인 배열입니다. strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
	 * strings의 원소는 길이 1 이상, 100이하인 문자열입니다. 모든 strings의 원소의 길이는 n보다 큽니다. 인덱스 1의 문자가
	 * 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
	 * 
	 * [입출력 예]
	 * strings : ["sun", "bed", "car"] / n : 1 / return : "car", "bed", "sun"
	 * strings : ["abce", "abcd", "cdx"] / n : 2 / return : "abcd", "abce", "cdx"
	 */

	public static String[] solution(String[] strings, int n) {
		String[] answer = {};
		
		String tmp = "";
		
		// strings의 크기만큼 for문 돌아준다.
		for(int i = 0; i < strings.length; i++) {
			// 이중for문 돌아준다.
			for(int j = i+1; j < strings.length; j++) {
				// 만일 i번지와 j번지에 있는 charAt 중에 i번지가 크다면
				if(strings[i].charAt(n) > strings[j].charAt(n)) {
					//tmp에 i를담고
					tmp = strings[i];
					// i를 j에 담고
					strings[i] = strings[j];
					// j에 tmp에 담아준다.
					strings[j] = tmp;
				}
			}
		}
		
		// 위와 같이 하면 정렬은 잘 되어있지만 사전순 정렬이 안되어있다.
		
		String tmp1 = "";
		
		// 다시 이중for문을 돌아주며
		for(int i = 0; i < strings.length; i++) {
			for(int j = i+1; j < strings.length; j++) {
				// i와 j가 같고, compareTo에서 j가 0보다 크다면 (양수리턴)
				if(strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) > 0) {
					// 아래처럼 돌아서 담아준다.
					tmp1 = strings[i];
					strings[i] = strings[j];
					strings[j] = tmp1;
				}
			}
		}
		answer = strings;
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new String[] { "sun", "bed", "car" }, 1)));
		System.out.println(Arrays.toString(solution(new String[] { "abce", "abcd", "cdx" }, 2)));
	}

}
