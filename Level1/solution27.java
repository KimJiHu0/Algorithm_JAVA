package Level1;

public class solution28 {

	/*
	 * 콜라츠 추측
	 * 
	 * 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수
	 * 있다는 추측입니다. 작업은 다음과 같습니다.
	 * 
	 * 1-1. 입력된 수가 짝수라면 2로 나눕니다. 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 2. 결과로 나온 수에 같은
	 * 작업을 1이 될 때까지 반복합니다.
	 * 
	 * 예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나
	 * 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
	 * 
	 */

	public static int solution(int num) {
		
		// 마지막 626331의 값을 계산할 때 int형의 범위를 초과하여 중간에 계산이 꼬이게 되어서 long타입으로 변환 후 진행해줬다.
		int answer = 0;
		
		// num1이라는 long타입 변수에 num을 대입.
		long num1 = num;
		// 나눈 갯수를 판별하기 위한 count 변수
		int count = 0;
		
		boolean check = true;
		
		while(check) {
			// num1이 1일 때
			if(num1 == 1) {
				// answer에 count를 담아주고, 
				answer = count;
				// check를 false로 바꿔주어 while문을 끝내준다.
				check = false;
				// break를 걸어주지 않아도 1은 홀수로 판단되어 계산이 진행되기 때문에 걸어주었다.
				break;
			}
			
			// 만일 count가 500과 같거나 크다면
			if(count >= 500) {
				// 계산을 못하기 때문에 answer에 -1를 대입한 후,
				answer = -1;
				// while문을 종료시키기 위해 false로 변환해주고,
				check = false;
				// break를 걸어준다.
				break;
			}
			
			// num1이 짝수일 경우
			if(num1 % 2 == 0) {
				// num1에 num1 / 2의 값을 대입한다,
				num1 = num1 / 2;
				// 그리고 나눈 count를 계산하기 위해 ++를 해준다.
				count++;
			// num1이 홀수일 경우
			} else {
				// num1에 num1 x 3 + 1한 값을 대입하고,
				num1 = num1*3+1;
				// count를 ++해준다.
				count++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println("return값 : "+solution(6)); // => 8
		System.out.println("return값 : "+solution(16)); // => 4
		System.out.println("return값 : "+solution(626331)); // => -1
	}

}
