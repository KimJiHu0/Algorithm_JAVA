package Level1;

public class solution07 {
	/*
	 * [문제설명]
	 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후,
	 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
	 * 
	 * [제한조건]
	 * n은 1 이상 100,000,000 이하인 자연수입니다.
	 * 
	 * [입출력 예]
	 * n : 45 / result : 7
	 * n : 125 / result : 229
	 * 
	 * [설명]
	 * 10진법 : 45 / 3진법 : 1200 / 반전3진법 : 0021 / 10진법 : 7
	 */
	
	public static int solution(int n) {
        int answer = 0;
        String str = "";
        
        // 45 / 3 = 15 ... 0
        // 15 / 3 = 5 ... 0
        // 5 / 3 = 1 ... 2
        // => 1200인데
        
        // 이를 뒤집어서 0021
        // 이를 10진법으로 바꿔서 표현한다.
        
        // 입력한 값 이 0보다 클떄 whlie문을 돌려준다.
        while(n > 0) {
        	// str이라는 String값에  n/3의 나머지를 더해준다.
        	str += n%3;
        	// n에 n/3한 값을 대입.이를 반복.
        	n /= 3;
        }
        
        
        int j = 0;
        // 1200을 거꾸로 출력하기 위해
        // => 0021에서
        // 1은 3^0 => 1
        // 2는 3^1 => 3*2해서 6.
        // => 6 + 1 => 7
        for(int i = str.length()-1; i >= 0; i--) {
        	answer += (str.charAt(i) - '0') * Math.pow(3, j);
        	j++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(45));
	}

}
