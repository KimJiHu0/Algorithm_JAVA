package Algorithm030;

import java.util.Scanner;

public class solution_result {
	
	public static void main(String[] args) {
		
		// 수 입력받기
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		sc.close();
		
		// 번갈아가면서 출력해주기 위해서 boolean선언
		boolean check = true;
		
		// 1~입력받은 수까지 반복문 돌아주는데
		for(int i = 1; i <= num; i++) {
			
			// i가 num과 같아지만 (마지막에 도달하면)
			if(i == num) {
				// i를 출력해주고
				System.out.print(i);
				// 반복분 종료
				break;
			}
			
			// check가 true라면
			if(check) {
				// i를 출력하고 +를 붙여준다.
				System.out.print(i+"+");
				// 그 후 check를 false로 변경
				check = !check;
			}
			// 그 다음은 여기로 들어오게 된다. check가 false이기 때문
			else {
				// i를 출력하고 -를 붙여준다.
				System.out.print(i+"-");
				// 그리고 check를 다시 true로 변경
				check = !check;
			}
		}
		
	}

}
