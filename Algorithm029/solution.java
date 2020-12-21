package Algorithm029;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	// 음계
	
	// 1~8까지 차례대로 입력되면 ascending
	// 8~1까지 차례대로 입력되면 descending
	// 둘 다 아니면 mixed 출력
	
	public static void main(String[] args) {

		// 숫자를 입력하는 부분 [배열로 담아주었다.]
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		// 8개를 받아와야해서 int배열 8size를 만들어준다.
		int[] arr = new int[8];
		// 입력한 값 모두 여기에.
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// ascending인지를 판별하기 위한 변수들
		int ascCheck = 1;
		int ascCnt = 0;
		
		
		// descending인지를 판별하기 위한 변수들
		int descCheck = 8;
		int descCnt = 0;
		
		// 만일 1부터 시작하면
		if(arr[0] == 1) {
			for(int i = 0; i < arr.length; i++) {
				// arr[i]번지와 ascCheck와 비교해주는데 같다면
				if(arr[i] == ascCheck) {
					// ascCheck와 ascCnt를 ++해준다.
					ascCheck++;
					ascCnt++;
				}
			}
			// 만약에 ascCnt가 8이라면
			if(ascCnt == 8) {
				System.out.println("ascending");
			}
			
		// 8부터 시작하면
		} else if(arr[0] == 8) {
			for(int i = 0; i < arr.length; i++) {
				// arr[i]가 descCheck와 같다면
				if(arr[i] == descCheck) {
					// descCheck와 descCnt를 ++해준다.
					descCheck--;
					descCnt++;
				}
			}
			// descCnt가 8이라면
			if(descCnt == 8) {
				System.out.println("descending");
			}
		// 둘 다 아니면
		} else {
			System.out.println("mixed");
		}
		
		
	}

}
