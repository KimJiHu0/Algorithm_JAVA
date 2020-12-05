package Level1;

import java.util.Arrays;

public class solution38 {

	// 예산

	/*
	 * [문제설명]
	 * S사에서는 각 부서에 필요한 물품을 지원해 주기 위해 부서별로 물품을 구매하는데 필요한 금액을 조사했습니다. 그러나, 전체 예산이 정해져
	 * 있기 때문에 모든 부서의 물품을 구매해 줄 수는 없습니다. 그래서 최대한 많은 부서의 물품을 구매해 줄 수 있도록 하려고 합니다.
	 * 
	 * 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다. 예를 들어 1,000원을 신청한 부서에는 정확히
	 * 1,000원을 지원해야 하며, 1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
	 * 
	 * 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 최대 몇 개의 부서에 물품을 지원할 수 있는지
	 * return 하도록 solution 함수를 완성해주세요.
	 * 
	 * [제한조건]
	 * d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다. d의 각 원소는 부서별로 신청한
	 * 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다. budget은 예산을 나타내며, 1 이상
	 * 10,000,000 이하의 자연수입니다.
	 */
	
	public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        // 부서들이 신청한 금액을 정렬해준다.(오름차순)
        // 가장 많이 지원할 수 있도록 하기 위해서는 작은 금액을 신청한 부서들 먼저 지원을 해주는 것이 가장 최선의 방법이기 떄문이다.
        Arrays.sort(d);
        
        // d의 길이만큼 반복문을 돌아준다.
        for(int i = 0; i < d.length; i++) {
        	// sum이라는 변수에 d의 i번지의 값을 더해준다.
        	sum += d[i];
        	// d의 i번지를 넣줬기 떄문에 answer를 ++해줄 수 있도록 한다.
        	answer++;
        	// 만약에 d의 i번지를 더한 sum이라는 변수가 지원 가능한 금액 변수인 budget보다 크다면.(지원가능한 금액을 넘어간다면)
        	if(sum > budget) {
        		// answer에서 --를 해준다.
        		answer--;
        		// sum에 마지막으로 더한 d의 i번지를 뺴준다.
        		sum = sum - d[i];
        		// 그리고 for문을 끝낸다.
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,2,5,4}, 9));
		System.out.println(solution(new int[] {2,2,3,3}, 10));
	}

}
