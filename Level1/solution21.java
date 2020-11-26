package Level1;

public class solution21 {
	
	// Â¦¼ö¿Í È¦¼ö
	
	// Â¦¼ö´Â Even return
	// È¦¼ö´Â Odd return
	
	public static String solution(int num) {
        String answer = "";
        
        if(num % 2 == 0){
            answer = "Even";
        } else {
            answer = "Odd";
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}

}
