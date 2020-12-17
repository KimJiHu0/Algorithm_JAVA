package Level2;

import java.util.Stack;

public class solution07 {
	
	public static boolean solution(String s) {
		// stack을 선언
		Stack<Character> st = new Stack<Character>();
		
		// s의 길이만큼 반복문을 돌아준다.
		for(int i = 0; i < s.length(); i++) {
			// st에 String타입의 값 중 0번쨰에 있는 문자를 push한다.
			st.push(s.charAt(i));
			// 만약에 st의 0번지가 )로 시작한다면
			if(st.get(0) == ')') {
				// 그냥 false를 return.
				return false;
			}
			
			// 위의 조건이 아니면 계속 push하게 되는데, st의 길이가 2가 넘어가게 되면 if문으로 들어온다.
			if(st.size() > 1) {
				// st가 비어있을 때까지 반복문을 돌아준다.
				while(!st.isEmpty()) {
					// word1이라는 변수에 st에서 가장 마지막에 뺀 값을 담아주고, 
					char word1 = st.pop();
					// word2라는 변수에 st에서 다음으로 뺸 값을 담아준다.
					char word2 = st.pop();
					// word1이 가장 처음으로 뺀 값이므로 ) 이고, 그 다음에 word2가 (라면
					if(word1 == ')' && word2 == '(') {
						// while문을 벗어난다.
						// 따로 pop을 안하는 이유는 위에서 word1와 word2에 담을 때 pop을 해줬기 떄문이다.
						break;
					// 그렇지 않다면
					} else {
						// 빼줬던 값들을 다시 넣어주는데, 나중에 뺸 것이 먼저 들어가야해서 word2를 먼저 push
						st.push(word2);
						st.push(word1);
						// 그 후 while문을 빠져나간다.
						break;
					}
				}
			}
		}
		// 만일 st가 비어있다면,
		if(st.isEmpty()) {
			// true를 return
			return true;
		}
		// 아니면 false를 return한다
		return false;
	}

	public static void main(String[] args) {
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
	}
}
