package Algorithm003;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
	
	// 가장 많이 출현한 수를 출력하시오
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int []num = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));

		// index => 출현한 수
		// index의 값 => 출현한 수가 몇번 나왔는지 저장하는 용도
		// mode[3] = 5라는 뜻은 3번이숫자가 5번 출현했다라는 의미.
		int[] mode = new int[10];
		
		// num에는 1,2,2,3,1,4,2,2,4,3 들어있다.
		for(int i = 0; i < 10; i++) {
			mode[num[i]]++;
			// mode의 num[i]번지는 => 0부터 시작했을 때
			// mode[1]++ 이다.
			// 그럼 mode의 1번지가 ++가 된다.
			
			// i가 ++된 후
			// mode[num[i]] => mode[num[1]] => mode[2]++;
			// mode[num[i]] => mode[num[2]] => mode[2]++;
			// mode[num[i]] => mode[num[3]] => mode[3]++;
			// mode[num[i]] => mode[num[4]] => mode[1]++;
			// ....반복
			// -------------------------------------------
			// mode[1] = 2
			// mode[2] = 4
			// mode[3] = 2
			// mode[4] = 2
		} 
		System.out.println("mode의 값 : " + Arrays.toString(mode));
		
		int modeNum = 0; // 최빈수를 의미
		int modeCnt = 0; // 최빈수가 나온 횟수를 의미
		// 10번 반복문 돌리며
		for(int i = 0; i < 10; i++) {
			// 만일 modeCnt가 mode[i]번지보다 작다면
			// 가장 처음에는 최빈수 나오는 횟수를 의미하는 modeCnt가 0 이고, mode의 0번지에는 0이다.
			// 그럼 if문을 들어가지 않고 for문이 한번 더 돈다.
			// modeCnt = 0 / mode[1] = 2
			//  modeCnt가 mode[1]보다 작기 때문에
			// cnt에 mode[i]번지를 담아주고,
			// modeNum은 1.
			// mode의 i번의 값은 나오는 값의 횟수를 의미 / mode의 index인 i는 숫자가 어떤건지 의미.
			// 1이라는 숫자가 2번 나왔다.
			// modeNum = 1 / modeCnt = 2
			
			// 0번지 제끼고, 1번지 2 , i가 2일때. 즉, mode[2]번지가 2라는 값 , 2가 5번 나왔는데 modeCnt가 더 작기 떄문에
			// modeCnt에는 mode의 i번지 값인 5를 넣고 => 나온 횟수
			// modeNum은 i가 된다. => 어떤 숫자?
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("최빈수 : " + modeNum + ", 나온 횟수 : " + modeCnt);
	}

}
