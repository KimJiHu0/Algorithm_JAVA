package Level1;

public class solution12 {
	/*
	 * [수박수박수박수박?]
	 * 
	 * [문제설명]
	 * 길이가 n이고 "수박수박수박수박.."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 ㄹ환성하세요.
	 * 예를 들어 n이 4면 "수박수박", n이 3이면 "수박수"를 리턴하면 됩니다.
	 * 
	 */
	
	public static String solution(int n) {
        String answer = "";
        
        int end = n;
        
        // 들어온 값이 짝수일 때
        if(n % 2 == 0) {
        	for(int i = 0; i < end; i++) {
        		if(n % 2 == 0) {
        			answer += "수";
        		} else {
        			answer += "박";
        		}
        		--n;
        	}
        }
        
        // 들어온 값이 홀수일 때
        if(n % 2 != 0) {
        	for(int i = 0; i < end; i++) {
        		if(n % 2 == 1) {
        			answer += "수";
        		} else {
        			answer += "박";
        		}
        		--n;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
		System.out.println(solution(6));
	}

}
