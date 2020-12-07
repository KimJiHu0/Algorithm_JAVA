package Level2;

import java.util.Arrays;

public class solution01 {

	// 최댓값과 최솟값

	/*
	 * [문제설명]
	 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 (최소값)
	 * (최대값)형태의 문자열을 반환하는 함수, solution을 완성하세요. 예를들어 s가 1 2 3 4라면 1 4를 리턴하고, -1 -2 -3
	 * -4라면 -4 -1을 리턴하면 됩니다.
	 * 
	 * [제한조건]
	 * s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
	 */
	
	public static String solution(String s) {
        String answer = "";
        
        // 공백을 기준으로 split
        String[] nArr = s.split(" ");
        
        // min과 max를 선언해준다.(아무값이나 넣어줘도 된다.)
        int min = Integer.parseInt(nArr[0]);
        int max = Integer.parseInt(nArr[0]);
        
        // nArr의 길이만큰 반복문을 돌아주는데,
        for(int i = 0; i < nArr.length; i++) {
        	// min을 구하기 위해 Math.min 메소드를 사용했다. nArr의 i번지와 min을 비교하여 더 작은수를 min에 담고,
        	min = Math.min(Integer.parseInt(nArr[i]), min);
        	// nArr의 i번지와 max의 값을 비교하여 더 큰 값을 max에 담는다.
        	max = Math.max(Integer.parseInt(nArr[i]), max);
        }
        // answer이라는 String변수에 min을 String으로 변환하여 더하고 공백을 더하고 max를 String으로 변환하여 더하여 리턴한다.
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-4 -3 -2 -1"));
		System.out.println(solution("-1 -1"));
	}

}
