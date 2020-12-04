package Level1;

import java.util.HashMap;
import java.util.Map;

public class solution36 {

	// 체육복

	/*
	 * [문제설명]
	 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
	 * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 예를 들어, 4번
	 * 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려
	 * 최대한 많은 학생이 체육수업을 들어야 합니다.
	 * 
	 * 전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
	 * reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
	 * 
	 * [제한조건]
	 * 전체 학생의 수는 2명 이상 30명 이하입니다. 체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다. 여벌의
	 * 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다. 여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄
	 * 수 있습니다. 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은
	 * 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
	 * 
	 * [입출력 예]
	 * 전체학생 수 n : 5 / 도난당한 학생 : [2,4] / 여벌을 챙겨온 학생 : [1,3,5] / 수업들을 수 있는 학생 : 5
	 * 전체학생 수 n : 5 / 도난당한 학생 : [2,4] / 여벌을 챙겨온 학생 : [3] / 수업들을 수 있는 학생 : 4
	 * 전체학생 수 n : 3 / 도난당한삭생 : [3] / 여벌가져온학생 [1] / 수업들을 수 있는 학생 : 2
	 */
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		// 학생들 모두를 key에 담아주고, 일단은 체육복을 다 가져왔다는 전제 하에 1을 넣어준다.
		// {1=1, 2=1, 3=1 ....}
		for(int i = 1; i <= n; i++) {
			map.put(i, 1);
		}
		
		// reserve의 i번지의 애는 map에 key값으로 value는 2로 넣어준다 (체육복을 2벌 가져왔기 때문에)
		// {1=1, 2=1, 3=2, 4=1 ... }
		for(int i = 0; i < reserve.length; i++) {
			if(reserve[i] <= n) {
				map.put(reserve[i], 2);
			}
		}
		
		// 체육복을 잃어버린 애를 구하기 위해 map의 lost의 i번지를 key값으로 가지고 있는 애의 value를 -1해준다.
		// {1=1, 2=1, 3=2, 4=0 ... }
		for(int i = 0; i < lost.length; i++) {
			if(lost[i] <= n) {
				map.put(lost[i], map.get(lost[i])-1);
			}
		}
		
		// map에서 key값을 int i 에 대입해주면서 반복문을 돌게 되는데
		for(int i : map.keySet()) {
			// 가장 좋은 방법으로 하기 위해서는 {1=0, 2=2, 3=0, 4=2, 5=1} 이라면 2번학생이 1번학생에게, 4번학생이 3번학생에게 빌려주게 하기 위해서
			// i번지가 2(2벌을 가져왔고) i-1이 0보다 커야하며 / map의 i-1의 value가 0이라면
			if((map.get(i) == 2 && i-1 > 0) && (map.get(i-1) == 0)) {
				// i번지의 value를 -1해주고, 
				map.put(i, map.get(i)-1);
				// i-1번지의 value를 +1해줘야한다.
				map.put(i-1, map.get(i-1)+1);
			}
			// 그 후 뒤에 있는 학생을 검색해주는데, i번지가 2이고 i+1이 n보다 작거나 같아야하며 / i+1번지가 0이라면
			else if((map.get(i) == 2 && i+1 <= n) && (map.get(i+1) == 0)) {
				// map에 더해준다 / i번지를, i번지의 value에서 -1한 값을
				map.put(i, map.get(i)-1);
				// 그리고 i+1번지의 value에 i+1의 value에서 +1를 해준다.
				map.put(i+1, map.get(i+1)+1);
			}
		}
		System.out.println(map);
		
		// count에 map의 value를 담아주며 반복문을 돌면서
		for(int count : map.values() ) {
			// 만일 count가 0이 아니라면
			if(count != 0) {
				// answer를 ++해준다.
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {2,4}, new int[] {1,3,5}));
		System.out.println(solution(5, new int[] {2,4}, new int[] {3}));
		System.out.println(solution(3, new int[] {3}, new int[] {1}));
		System.out.println(solution(5, new int[] {1, 5}, new int[] {2}));
		System.out.println(solution(27, new int[] {10,16,19,20,24,26,27}, new int[] {4,7,8,10,13,14,16,17,18,19,21,22,23,24,25,26,27}));
		System.out.println(solution(5, new int[] {1,2,3,4,5,6}, new int[] {1,2,3,4,5}));
		System.out.println(solution(5, new int[] {1,2}, new int[] {2,3}));
		System.out.println(solution(5, new int[] {3,5}, new int[] {2,4}));
		System.out.println(solution(5, new int[] {1,3}, new int[] {2,4}));
	}

}
