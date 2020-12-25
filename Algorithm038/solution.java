package Algorithm038;

public class solution {
	
	// 치킨쿠폰 재귀ver
	
	// 강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 N장 가지고 있다. 이 치킨집에서는 치킨을 한 마리 주물할 때마다 도장을 하나씩 찍어준다.
	// 도장을 K개 모으면 치킨 쿠폰 한 장으로 교환할 수 있다.
	// 강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇마리나 먹을 수 있는지 구하여라.
	// 단, 치킨을 주문하기 위해서는 반드시 치킨 쿠폰을 가지고 있어야한다.
	
	// 예제입력
	// N : 4 K : 3 => 5마리
	// N : 10, K : 3 => 14마리
	// N : 100, K : 5 => 124마리
	
	public static void main(String[] args) {
		
		// 내가 시켜먹을 수 있는 치킨수 마리 수(쿠폰으로)
		int coupon = 4;
		// stamp가 몇개 있어야 치킨한마리를 받을 수 있는지. 3개당 1마리
		int couponDiv = 3;
		
		// 처음에 시켜먹을 수 있는 마리수, stamp는 쿠폰이 존재하지 않아서 0, 몇개로 나눠야할지 지정하기 위해 couponDiv, answer는 모르기떄문에 0
		doFunc(coupon, 0, couponDiv, 0);
		
	}
	
	public static void doFunc(int coupon, int stamp, int couponDiv, int ans) {
		
		// coupon이 0이상이면
		// coupon이 4라서
		// coupon이 3이라서
		// coupon이 2라서
		
		// 1,1,3,4가 대입되고,
		// coupon이 0보다 크기 때문에.
		if(coupon > 0) {
			// 쿠폰 하나 까고,
			// 3이 되고,
			// 2가되고,
			// 1이되고,
			// 0이되고,
			// 0이되고,
			coupon--;
			// 내가 사켜먹을 수 있는 마리수를 ++
			// stamp를 1개 된다.
			// stamp를 2개 된다.
			// stamp를 3개 된다.
			// stamp를 4개 된다.
			// stamp는 2가 된다.
			stamp++;
			// 시켜먹을 수 있는 치킨 마리 수 : 1
			// 시켜먹을 수 있는 치킨 마리 수 : 2
			// 시켜먹을 수 있는 치킨 마리 수 : 3
			// 시켜먹을 수 있는 치킨 마리 수 : 4
			// 시켜먹을 수 있는 치킨 마리 수 : 5
			ans++;
			// 다시 함수 호출
			// 3, 1 ,3, 1을 대입
			// 2, 2, 3, 2를 대입
			// 1, 3, 3, 3을 대입
			// 0, 4, 3, 4를 대입
			// 0, 2, 3, 5를 대입
			doFunc(coupon, stamp, couponDiv, ans);
			return ;
		// 만약에 stamp가 0 이상이면
		// 0, 4, 3, 4가 대입 되고, 위의 조건문을 탈 수 없어서 아래의 조건문을 타게 된다.
		} else if(stamp > 0) {
			// 그리고 stamp / coupon이 0 이상이면
			// 0,4,3,4 => stamp : 4, couponDiv : 3
			// 4 / 3 이 0 이상이기 때문에
			if(stamp/couponDiv > 0) {
				// stamp에서 couponDiv만큼 빼주고,
				// 4였던 stamp에서 couponDiv만큼 빼준 후 1이 된다.
				stamp -= couponDiv;
				// coupon을 ++
				// 한마리를 시켜먹을 수 있으니 coupon은 1이 된다,
				coupon++;
				// 다시 함수 호출
				// 1, 1, 3, 4
				doFunc(coupon, stamp, couponDiv, ans);
			}
		}
		// 위의 행위를 반복
		
		// 대입 된 0, 2, 3, 5가 위의 조건문을 타지 못하고
		// coupon의 수가 0이고, stamp(2) / couponDiv(3) 의 몫이 0이기 떄문에
		
		// 쿠폰의 수가 0이거나 , stamp / couponDiv가 0이라면
		if(coupon == 0 && stamp/couponDiv == 0) {
			// ans를 출력
			// ans인 5를 출력한다.
			System.out.println(ans);
		}
	}

}
