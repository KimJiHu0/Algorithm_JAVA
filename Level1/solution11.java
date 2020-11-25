package Level1;

public class solution11 {
	/*
	 * 서울에서 김서방 찾기
	 * [문제설명]
	 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는
	 * String을 반환하는 함수, solution을 완성하세요.
	 * seoul에 "Kim"은 오직 한번만 나타나며 잘못된 값이 입력되는 경우는 없습니다. 
	 * 
	 * [제한사항]
	 * seoul은 길이 1이상, 1000이하인 배열입니다.
	 * seoul의 원소는 길이 1이상, 20이하인 문자열입니다.
	 * "Kim"은 반드시 seoul안에 포함되어 있습니다.
	 * 
	 * [입출력 예]
	 *  seoul : ["Jane", "Kim"] / return "김서방은 1에 있다."
	 */
	
	public static String solution(String[] seoul) {
        String answer = "";
        
        // 받아온 seoul배열만큼 for문 돌아주는데
        for(int i = 0; i < seoul.length; i++) {
        	// 만일 i번지에 있는애가 Kim이라면
        	if(seoul[i].equals("Kim")) {
        		// answer에 아래의 String값을 입력하고 return
        		answer = "김서방은 " + i + "에 있다.";
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"Jane", "Kim"}));
	}

}
