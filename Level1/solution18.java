package Level1;

public class solution18 {
	
	/*
	 * 문자열 내 p와 y의 개수
	 * 
	 * [문제설명]
	 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 p의 개수와 y의 개수를 비교해 같으면 True, 다르면 false를 return하는 함수, solution을 완성하시오.
	 * p, y모두 하나도 없는 경우는 항상 true를 return합니다.
	 * 단, 개수를 비교할 때 대문자와 서문자는 구별하지 않습니다.
	 * 
	 * [입출력 예]
	 * pPoooyY : true
	 * Pyy : false
	 */
	
	static boolean solution(String s) {
        boolean answer = true;

        // p의 cnt와 y의 cnt를 올려줄 int 타입의 변수를 선언.
        int pcnt = 0;
        int ycnt = 0;
        // char array인 arr선언해주며, 크기는 s의 길이만큼.
        char[] arr = new char[s.length()];
        // 대문자와 소문자가 상관없으니 받아온 s의 값을 str이라는 변수에 모두 소문자로 변경 후 담아준다.
        String str = s.toLowerCase();
        
        // str의 길이만큼 for문을 돌리며
        for(int i = 0; i < str.length(); i++) {
        	// char배열의 i번지에 str의 i번지에있는 값을 담아준다.
        	arr[i] = str.charAt(i);
        }
        // 그리고 arr의 크기만큼 for문을 돌리며
        for(int i = 0; i < arr.length; i++) {
        	// arr의 i번지가 p라면
        	if(arr[i] == 'p') {
        		// pcnt를 ++, 
        		pcnt++;
        	// arr의 i번지가 y라면
        	} else if(arr[i] == 'y') {
        		// ycnt를 ++해준다.
        		ycnt++;
        	}
        }
        // 만일 pcnt와 ycnt가 같다면, 
        if(pcnt == ycnt) {
        	// answer을 true로 , 
        	answer = true;
        // 그렇지 않다면
        } else {
        	// answer를 false로 바꾼 후,
        	answer = false;
        }
        // return해준다.
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}

}
