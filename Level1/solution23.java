package Level1;

public class solution23 {
	
	public static String solution(String phone_number) {
        String answer = "";

        // phone_number의 문자열을 잘라서 String 배열에 하나하나 넣어준다.
        String[] nArr = phone_number.split("");
        
        // 0번지부터 마지막 숫자 4개 앞까지 for문을 돌아주며 answer에 *을 넣어준다.
        for(int i = 0; i < nArr.length-4; i++) {
        	answer += "*";
        }
        
        // 앞에 *을 넣을 부분을 제외한 나머지부분의 숫자를 answer에 넣어준다.!
        for(int i = nArr.length-4; i < nArr.length; i++) {
        	answer += nArr[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}

}
