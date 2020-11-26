package Level1;

public class solution25 {
	
	// 이상한 문자 만들기
	
	// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
	//각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	//각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	
	// "try hello world" => "TrY HeLlO WoRlD"
	
	public static String solution1(String s) {
		String answer = "";
        
		// 받아온 s의 값을 char배열로 변환한다.
        char[] nArr = s.toCharArray();
        
        // 그 길이만큼 for문을 돌면서
        for(int i = 0; i < nArr.length; i++) {
        	// 만일 i / 2의 나머지가 0이면 => 짝수이면
        	if(i % 2 == 0) {
        		// answer에 nArr의 i번지를 대문자로 바꿔서 더해준다.
        		answer += String.valueOf(nArr[i]).toUpperCase();
        	// 홀수이면
        	} else {
        		// answer에 소문자인 상태로 더해준다.
        		answer += String.valueOf(nArr[i]);
        	}
        }
		return answer;
		
		// 내 코드의 문제점
		// 중간에 띄어쓰기를 할 경우에 밀려서 대소문자가 바뀐다.
	}
	
	public static String solution(String s) {
        String answer = "";
        
        // str이라는 배열에 받아온 s를 한글자 한글자 잘라온 값을 담아준다.
        String str[] = s.split("");
        String space = " ";
        int cnt = 0;
        
        // str의 길이만큼 for문을 돌아주는데, 
        for(int i = 0; i < str.length; i++){
        	// 만일 str의 i번지가 공백이라면
            if(str[i].equals(space)){
            	// cnt는 0으로 초기화를 시켜준다.
               cnt = 0;
            // 공백이 포함되어있지 않다면 
            }else{
            	// cnt / 2의 나머지가 0이라면 => 짝수라면
               if(cnt % 2 == 0){
            	   // cnt를 ++해주고, 
                  cnt++;
                  // str의 i번지에 str의 i번지 애를 대문자로 바꿔서 담아준다.
                  str[i] = str[i].toUpperCase();
               // 홀수라면
               }else{
            	   // cnt를 ++해주고, 
                   cnt++;
                   // str의 i번지에 str의 i번지 애를 소문자로 바꿔서 담아준다.
                   str[i] = str[i].toLowerCase();
               }
            }
            // 그리고 answer이라는 변수에 str의 i번지의 값을 담아준다.
            answer += str[i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(" 내 코드 : " + solution1("try hello world"));
		System.out.println(" 정답자 코드 : " + solution("try hello world"));
	}

}
