package Algorithm004;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10진수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		// 2진수 값 출력할 array
		int[] bin = new int[100];
		
		// bin array의 index를 카운팅 하기 위한 변수
		int i = 0;
		
		// 몫이 0보다 클때까지 while문
		while(num > 0) {
			bin[i] = num % 2;
			num = num / 2;
			i++;
		}
		i--;
		
		for(; i>=0; i--) {
			System.out.print(bin[i] + " ");
		}
		
	}

}
