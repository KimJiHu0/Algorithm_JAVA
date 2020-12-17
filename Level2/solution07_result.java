package Level2;

import java.util.Stack;

public class solution07_result {
	
	public static boolean solution(String s) {
		// Stack 선언
		Stack<Character> st = new Stack<Character>();
		
		// s의 길이만큼 반복문을 돌아준다.
		for(int i = 0; i < s.length(); i++) {
			// char타입 변수 c에 s의 i번째 문잘르 담아준다.
			char c = s.charAt(i);
			// 만약에 c가 ')'라면, 
			if(c == ')') {
				// 그 안에서 st가 현재 비어있다면
				if(st.isEmpty()) {
					// 어차피 )로 시작하면 올바른 괄호의 조건에 만족하지 못하여, false를 return한다.
					return false;
				}
				// 그렇지 않다면 st에서 pop을 해준다.
				// st에서 그냥 pop만 해주는 이유는 char c에 담겨있는 값이 ')'라 하면
				// st에 담겨있는 값은 ( 로만 고정이 되있을것이다.
				// 그럼 c가 ) 라면 그냥 st에서 (를 하나 빼줘도 상관이 없기 떄문에, pop만 해준다.
				st.pop();
			// 만약에 '('라면
			} else {
				// st에 '('를 push한다.
				st.push('(');
			}
		}
		// st가 비어있다면
		if(st.isEmpty()) {
			// true를 return
			return true;
		}
		// 그렇지 않다면 false를 return
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}

}
