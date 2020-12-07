package Level1;

import java.util.Arrays;

public class solution40 {

	// 비밀지도

	/*
	 * 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기
	 * 위해서는 암호를 해독해야 한다. 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
	 * 
	 * 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 공백(" ) 또는벽(#") 두 종류로 이루어져 있다.
	 * 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 지도 1과 지도 2라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
	 * 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
	 * 지도 1과 지도 2는 각각 정수 배열로 암호화되어 있다.
	 * 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
	 */
	
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		
		// arr1과 arr2를 2진법으로 변경하기 위해서 변수들을 선언.
		int map1na = 0;
		int map2na = 0;
		int map1moc = 0;
		int map2moc = 0;
		// map1tmp와 map2tmp라는 변수를 선언해주는데 나머지들을 담아줄 변수.
		String map1tmp = "";
		String map2tmp = "";
		
		// 0부터 n만큼 반복문을 돌아주는데
		for(int i = 0; i < n; i++) {
			// map1moc arr1의 i번지를 담고, 
			// map2moc arr2의 i번지를 담아준다.
			// 나눠줄 값들을 담아준다 (arr1과 arr2를 한번에 하기 위해 동시에 선언)
			map1moc = arr1[i];
			map2moc = arr2[i];
			// 이중반복문을 돌아주는데,
			for(int j = 0; j < n; j++) {
				// map1na라는 변수에 map1moc의 나머지를 담아주고, 
				map1na = map1moc % 2;
				// map1moc에 map1moc / 2 한 값을 담아준다.
				map1moc = map1moc / 2;
				// map1tmp에 map1na를 계속에서 +해준다.
				map1tmp += map1na;
				
				// map2에도 위와같이 반복해준다.
				map2na = map2moc % 2;
				map2moc = map2moc / 2;
				map2tmp += map2na;
			}
		}
		
		// map1tmp와 map2tmp에 2진법으로 바뀐 것이 담겨있는데 이를 reverseString이라는 메소드를 선언하여 뒤집어준다.
		// 뒤집게 되면 가장 처음에 있는 n만큼의 길이 tmp가 가장 마지막에 담겨야하기 때문에 유의해야한다.
		map1tmp = reverseString(map1tmp);
		map2tmp = reverseString(map2tmp);
		
		// map1와 map2를 선언해준다.
		String[] map1 = new String[n];
		String[] map2 = new String[n];
		
		// cnt는 0,
		int cnt = 0;
		// idx는 n-1만큼 => 이는 map1 혹은 map2의 index의 값을 의미하기 때문에 -1를 해준다.
		int idx = n-1;
		// map1str과 map2str을 선언한다.
		String map1str = "";
		String map2str = "";
		// map1tmp의 길이만큼 반복문을 돌아주는데, (map2tmp와 길이가 동일하다.)
		for(int i = 0; i < map1tmp.length(); i++) {
			// map1str과 map2str에 각각 map1tmp, map2tmp의 한글자씩 더해주는데,  
			map1str += map1tmp.charAt(i);
			map2str += map2tmp.charAt(i);
			// cnt도 ++해준다.
			cnt++;
			// 만일 cnt가 n과 같아진다면,
			if(cnt == n) {
				// map1의 idx번지에 map1str을 담아주고, 
				map1[idx] = map1str;
				// map2의 idx번지에 map2str을 담아준다.
				map2[idx] = map2str;
				// 그리고 idx는 뒤에서부터 앞으로가야하기 때문에 --를 해주고, 
				idx--;
				// cnt를 0으로 초기화한다.
				cnt = 0;
				// map1str과 map2str을 초기화 해준다.
				map1str = "";
				map2str = "";
			}
		}
		
		// 또다시 map1의 길이만큼 (map2도 길이는 동일할 것이다.)
		for(int i = 0; i < map1.length; i++) {
			// map1의 i번지중에 1이면 #, 0이면 ' '(공백) , map2의 i번지 중 1이면 #, 0이면 ' '(공백)으로 바꿔준다.
			map1[i] = map1[i].replace('1', '#');
			map1[i] = map1[i].replace('0', ' ');
			map2[i] = map2[i].replace('1', '#');
			map2[i] = map2[i].replace('0', ' ');
		}
		
		//======================================================
		
		// nStr이라는 변수를 선언하고,
		String nStr = "";
		// map1의 길이만큼 반복문을 돌아주는데
		for(int i = 0; i < map1.length; i++) {
			// 그 안에 2중 반복문을 돌아준다.
			for(int j = 0; j < map1[i].length(); j++) {
				// 만일 map1의 i번지에 charAt(j)[map2도 동일] 둘 중 하나가 #이라면 => map1의 i번지가 String인데 아 값 안에 한글자 한글자를 검사한다.
				if(map1[i].charAt(j) == '#' || map2[i].charAt(j) == '#') {
					// nStr에 #을 넣어주고. 
					nStr += '#';
				// 그게 아니라 공백이라면
				} else if(map1[i].charAt(j) == ' ' || map2[i].charAt(j) == ' ') {
					// nSrtr에 공백을 넣어주고,
					nStr += ' ';
				}
			}
			// answer의 i번지에 nStr을 넣어준 후,
			answer[i] = nStr;
			// nStr을 빈칸으로 초기화시켜주는 것을 반복한다.
			nStr = "";
		}
		
		return answer;
	}
	
	public static String reverseString(String s) {
	    return ( new StringBuffer(s) ).reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(5, new int[] {9,20,28,18,11}, new int[] {30,1,21,17,28})));
		System.out.println(Arrays.toString(solution(6, new int[] {46, 33, 33 ,22, 31, 50}, new int[] {27 ,56, 19, 14, 14, 10})));
	}

}
