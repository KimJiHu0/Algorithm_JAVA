package Level2;

import java.util.Stack;

public class solution06_01 {
	
	// 짝지어 제거하기
	
	public static int solution(String s) {
		int answer = 0;
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i));
			if(st.size() > 1) {
				while(!st.isEmpty()) {
					char fc = st.pop();
					char sc = st.pop();
					if(fc != sc) {
						st.push(sc);
						st.push(fc);
						break;
					} else {
						break;
					}
				}
			}
		}
		
		if(st.size() == 0) {
			answer = 1;
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
		System.out.println(solution("dcabaabacdegasd"));
		System.out.println(solution("dcabaabacdegasdsaoidhasodi"));
		System.out.println(solution("zsaddaszz"));
	}
}
