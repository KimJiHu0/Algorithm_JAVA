package Algorithm025;

public class solution {
	
	// 더하기 사이클
	
	public static void main(String[] args) {
		
		
		// 처음으로 받아온 숫자
		int num = 26;
		// 몇번 돌았는지 알려주기 위한 변수
		int cnt = 0;
		
		// 26 => 68 => 84 => 42 => 26
		// 2+6 = 8 ---> 26의 뒷자리 6, 합계 8 ------> 68
		// 6+8 => 14 ---> 68의 뒷자리 8, 합계 14 중 뒷자리 4 --------> 84
		// 8+4 => 12 ---> 84의 뒷자리 4, 합계 12중 뒷자리 2 ---------> 42
		// 4+2 => 6 ---> 42의 뒷자리 2, 합계 6 --------> 26 (끝)
		
		// 무한 반복을 돌립니다.
		while(true) {
			
			// num을 String으로 변환 후 nStr이라는 변수에 담습니다.
			// String nStr = "26";
			String nStr = String.valueOf(num);
			
			// nStr이라는 변수로 nArr이라는 Character배열을 만들어줍니다.
			char[]nArr = nStr.toCharArray();
			// 두 자리 수의 합을 더해주기 위한 변수
			int sum = 0;
			
			// nArr에 들어있는 값들을 sum에 담아줍니다.
			for(int i = 0; i < nArr.length; i++) {
				sum += Integer.parseInt(nArr[i]+"");
			}
			
			// 어차피 최대 숫자 9+9는 18. 즉, 두자리 수라 String배열을 크기 2로 지정해놓고 선언합니다.
			String[]nArr1 = new String[2];
			
			// 만일 sum이 10이상이라면
			if(sum > 9) {
				// nArr1의 0번지에 nArr의1번지의 값을 대입하고, 
				nArr1[0] = nArr[1]+"";
				
				// String타입의 str변수를 선언하여 sum을 형변환 후,
				String str = String.valueOf(sum);
				// nArr1[1]번지에 str의 1번지의 값을 넣어줍니다.
				// 14리면 => 4를 대입.
				nArr1[1] = str.charAt(1)+"";
				
				// 그 후 cnt를++해줍니다.
				cnt++;
				// 그리고 sum을 0으로 초기화해줍니다.
				sum = 0;
				
				// 이렇게 되면  68에서 결과를 쳐리해준 후 nArr1에 담긴 값은
				// 6+8 sum=14 , 68에서 1번지인 값을 nArr1[0]에 담아서 [8, ?] 이 되고,
				// sum에서 1번지 값을 nArr1[1]에 담아주어 [8, 4]이 됩니다.
				
			// sum이 9이하라면
			} else {
				// nArr1[0]에 nArr[1]의 값을 넣고,
				nArr1[0] = nArr[1]+"";
				// => [6, ?]
				// nArr의1번지에 sum을 대입해줍니다.
				nArr1[1] = String.valueOf(sum);
				// => [6, 8]
				
				
				// 그 후 cnt를++해주고,
				cnt++;
				// sum을 초기화해줍니다.
				sum = 0;
				
				
				// 이렇게 되면  26에서 결과를 쳐리해준 후 nArr1에 담긴 값은
				// 2+6 sum=8 , 26에서 1번지인 값을 nArr1[0]에 담아서 [6, ?] 이 되고,
				// sum을 nArr1[1]에 담아주어 [6, 8]이 됩니다.
			}
			
			// 그 다음에 num을 초기화 해준 후,
			num = 0;
			
			// String타입의 tmp를 선언해주고
			String tmp = "";
			// nArr1의 길이만큰 반복문을 돌면서
			for(int i = 0; i < nArr1.length; i++) {
				// tmp에 담아줍니다.
				tmp += nArr1[i];
				// => 68
			}
			
			// num에 tmp를 Integer.parseInt를 통해 int형으로 변환 해줍니다.
			num = Integer.parseInt(tmp);
			
			// 만일 처음으로 받아온 값이 다시 된다면
			if(num == 26) {
				// 반복문을 종료합니다.
				break;
			}
		}
		// 그리고 cnt를 출력합니다.
		System.out.println(cnt);
		
	}

}
