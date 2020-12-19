package Algorithm021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution {

	// 중복된 수 제거하기

	public static void solution01(int[] inputArr) {
		// 1. Set은 중복이 없기 때문에 Set을 활용한다.
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < inputArr.length; i++) {
			set.add(inputArr[i]);
		}
		System.out.println(set);
	}

	public static void solution02(int[] inputArr) {
		
		// boolean타입의 check 배열을 선업합니다.
		boolean[] check = new boolean[101];
		
		// inputArr의 길이만큼 반복문을 돌리면서
		for(int i = 0; i < inputArr.length; i++) {
			// check의 inputArr[i]번지의 값에 해당하는 index에 true라는 값을 넣습니다.
			// 배열을 처음 선언할 때 false로 들어오기 떄문에 true로 바꿔주기만하면 됩니다.
			// 그렇게 될 경우에는 
			// inputArr[0] = 1
			// inputArr[1] = 2
			// inputArr[2] = 3
			// inputArr[3] = 1
			// inputArr[4] = 2
			// inputArr[5] = 2
			// inputArr[6] = 3
			// inputArr[7] = 4
			// inputArr[8] = 5
			// inputArr[9] = 5
			// inputArr[10] = 6
			// inputArr[11] = 6
			// 중에서 inputArr[0]번지의 해당하는 값 1이 check[1] 번지가 true가 됩니다.
			// inputArr[1] = 2이고, check[2] = true,
			// inputArr[2] = 3이고, check[3] = true, ... 식으로 넘어가게되면
			// check = [false, true, true, true, true, true, true, false ....] 식으로 101까지 나오게 됩니다.
			check[inputArr[i]] = true;
		}
		
		//check의 길이만큼 반복문들 돌면서
		for(int i = 0; i < check.length; i++) {
			// check[i]번지가 true라면 i를 출력해주면 됩니다.
			if(check[i] == true) {
				System.out.print(i+ " ");
			}
		}
		
	}

	public static void main(String[] args) {

		//solution01(new int[] {1,2,3,1,2,2,3,4,5,5});
		solution02(new int[] {1,2,3,1,2,2,3,4,5,5,6,6,15});

	}

}
