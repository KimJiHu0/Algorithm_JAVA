package Level1;

import java.util.Arrays;

public class solution34 {

	// 시저암호

	/*
	 * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
	 * 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다.
	 * z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
	 * 
	 * 공백은 아무리 밀어도 공백입니다.
	 * s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
	 * s의 길이는 8000이하입니다. n은 1 이상, 25이하인 자연수입니다.
	 * 
	 * s : "AB" / n : 1 / result : "BC"
	 * s : "z" / n : 1 / result : "a"
	 * s : "a B z" / n : 4 / result : "e F d"
	 */
	
	public static String solution(String s, int n) {
        String answer = "";
        // 받아온 String을 공백까지 포함해서 char배열로 바꿔준다.
        char[] nArr = s.toCharArray();
        
        // nArr의 크기만큼 반복문을 돌아주는데, 
        for(int i = 0; i < nArr.length; i++) {
        	// 만일 nArr의 i번지가 공백이 아니라면
        	if(!String.valueOf(nArr[i]).equals(" ")) {
        		// 그 안에서 nArr의 i번지의 크기가 65이상 90이하 사이이고, nArr의 i번지 + n의 크기가 90보다 크다면. 즉, 대문자라면
        		if((nArr[i] >= 65 && nArr[i] <= 90) && (nArr[i] + n) > 90) {
        			// tmp변수에 nArr의 i번지에서 Z의 아스키코드인 90보다 1큰 수를 뺴준 후
        			int tmp = (nArr[i]+n) - 91;
        			// answer에 65 + tmp를 한 값을 char형태로 변형 후 더해준다.
        			answer += (char)(65+tmp);
        		// 만일 nArr의 i번지가 97이상 122이하이고, nArr의 i번지 + n이 122보다 크다면. 즉, 소문자라면
        		} else if((nArr[i] >= 97 && nArr[i] <= 122) && (nArr[i] + n) > 122) {
        			// tmp에 nArr의 i번지 + n - z의 아스키코드인 122에서 1큰 수를 빼준 후
        			int tmp = (nArr[i]+n) - 123;
        			// answer에 char형태로 변형한 97+tmp를 더해준다.
        			answer += (char)(97+tmp);
        		// 위의 조건들에 일치하지 않는다면
        		} else {
        			// answer에 nArr의 i번지에서 n만큼 더한 값을 char형태로 변형 후 더해준다.
        			answer += (char)(nArr[i]+n);
        		}
        	// 공백이라면 공백자체로 더해준다.
        	} else {
        		answer += " ";
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
		
	}

}
