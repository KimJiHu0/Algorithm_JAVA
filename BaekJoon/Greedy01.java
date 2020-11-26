package BaekJoon;

public class Greedy01 {

	/*
	 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는
	 * 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
	 * 
	 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를
	 * 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
	 * 
	 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
	 */
	
	public static int Greedy(int sugar) {
		
		int threekgcount = 0;
		int threekgna = 0;
		int fivekgcount = 0;
		int fivekgna = 0;
		
		// 3kg 봉지로 배달했을 때 나오는 봉지 갯수 구하기
		
		// 설탕의무게 / 3한 몫을 threekgcount에 담아준다.
		threekgcount += sugar / 3;
		// 설탕의무게 / 3 한 나머지값을 threekgna에 담아준다.
		threekgna = sugar % 3;
		// 만일 나머지 / 3이 0일경우에 (나뉘어 떨어진다면)
		if(threekgna % 3 == 0) {
			// threekgcount에 threekgna / 3한 값을 더해준다.
			threekgcount += threekgna / 3;
		} else {
			// 그렇지 않으면 (나뉘어 떨어지지 않는다면) -1로 초기화해준다.
			threekgcount = -1;
		}
		
		// 5kg 봉지와 3kg봉지로 배달했을 떄 나오는 봉지 갯수 구하기
		
		// fivekgcount에 설탕의 무게 / 5의 몫을 담아준다.
		fivekgcount += sugar / 5;
		// fivekgna에 설탕의무게 / 5한 값의 나머지를 담아주고
		fivekgna = sugar % 5;
		// 만일 그 나머지 / 3 이 0이라면 (나누어 떨어진다면)
		if(fivekgna % 3 == 0) {
			// fivekgcount에 fivekgna / 3 몫을 더해준다.
			fivekgcount += fivekgna / 3;
		} else {
			// 그렇지 않으면 (나누어 떨어지지 않는다면) fivekgcount를 -1로 초기화해준다.
			fivekgcount = -1;
		}
		
		// 두 count중에 하나라도 -1이 되어있다면 다른 수를 return하기 위한 if문
		
		// 만일 fivekgcount가 -1이라면
		if(fivekgcount == -1) {
			// threekgcount를 return하고, 
			return threekgcount;
		// threekgcount가 -1이라면
		} else if(threekgcount == -1) {
			// fivekgcount를 return한다.
			return fivekgcount;
		}
		
		// -1이 없는 경우 숫자가 더 작은 count를 return하기 위한 if문
		
		// 만약에 fivekgcount가 threekgcount보다 작다면
		if(fivekgcount < threekgcount) {
			// ficekgcount를 return하고
			return fivekgcount;
		// 그렇지 않다면
		} else {
			// threekgcount를 return한다.
			return threekgcount;
		}
		
		// 위의 코드는 본인이 구상하며 직접 푼 코드이며, 비요율적인 코드입니다.
		// 정상작동 하지만 다른 방법으로 풀어봐야할 것 같습니다.
	}
	
	public static void main(String[] args) {
		System.out.println("배달할 봉지의 갯수 : " + Greedy(6));
	}

}
