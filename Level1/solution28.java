package Level1;

import java.util.ArrayList;
import java.util.List;

public class solution29 {

	// 소수찾기

	// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
	//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.(1은 소수가 아닙니다.)

	public static int solution(int n) {
		int answer = 0;

		List<Boolean> list = new ArrayList<Boolean>();
		// 0과 1은 소수가 아니므로 false
		list.add(false);
		list.add(false);

		// 2부터 입력받은 숫자까지 반복문을 돌리며
		for (int i = 2; i <= n; i++) {
			// 2번지부터 마지막번지까지 true를 넣는다.
			list.add(i, true);
		}

		// 2부터 i*i가 n보다 작거나 클때까지 i++해주며 반복문을 도는데
		for (int i = 2; (i * i) <= n; i++) {
			// 만약 list의 i번지가 있다면
			if (list.get(i)) {
				// 다시 for문을 돌아주는데, j가 i*i부터 j가 n보다 작거나 같을때까지 j = j + i 만큼 증가.
				for (int j = i * i; j <= n; j += i) {
					// j번지를 false로 변경
					list.set(j, false);
				}
			}
		}
		// 0부터 list의 사이즈만큼 for문 돌리며
		for (int i = 0; i < list.size(); i++) {
			// i번지가 true리면
			if (list.get(i) == true) {
				// answer에 숫자를 더해준다.
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(5));
	}

}
