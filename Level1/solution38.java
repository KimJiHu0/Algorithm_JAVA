package Level1;

import java.util.ArrayList;

public class solution39 {

	// 다트게임
	
	// 테스트케이스 4,5,6,7,15,16,20,21,22 실패

	/*
	 * 카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을
	 * 겨루는 게임으로, 모두가 간단히 즐길 수 있다. 갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다.
	 * 다트 게임의 점수 계산 로직은 아래와 같다.
	 * 
	 * 다트 게임은 총 3번의 기회로 구성된다. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다. 점수와 함께 Single(S),
	 * Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3
	 * )으로 계산된다. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로
	 * 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의
	 * 점수만 2배가 된다. (예제 4번 참고) 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*)
	 * 점수는 4배가 된다. (예제 4번 참고) 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는
	 * -2배가 된다. (예제 5번 참고) Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다. 스타상(*),
	 * 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다. 0~10의 정수와 문자 S, D, T, *, #로
	 * 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.
	 * 
	 * 점수|보너스|[옵션]으로 이루어진 문자열 3세트. 예) 1S2D*3T
	 * 
	 * 점수는 0에서 10 사이의 정수이다. 보너스는 S, D, T 중 하나이다. 옵선은 *이나 # 중 하나이며, 없을 수도 있다.
	 * 
	 * 예제		dartResult		answer	                	설명
     * 1		1S2D*3T	    	 37	 				 1의1승 * 2 + 2의2승 * 2 + 3의3승
	 * 2		1D2S#10S		  9					 1의2승 + 2의1승 * (-1) + 10의1승
	 * 3	    1D2S0T			  3					 1의2승 + 2의1승 + 0의3승
	 * 4		1S*2T*3S		 23					 1의1승 * 2 * 2 + 2의3승 * 2 + 3의1승
	 * 5		1D#2S*3S		 5					 1의2승 * (-1) * 2 + 2의1승 * 2 + 3의1승
	 * 6		1T2D3D#			-4					 1의3승 + 2의2승 + 3의2승 * (-1)
	 * 7		1D2S3T*			59					 1의2승 + 2의1승 * 2 + 3의3승 * 2
	 */
	
	public static int solution(String dartResult) {
		int answer = 0;
		
		ArrayList<String> list = new ArrayList<String>();
		
		String nStr = "";
		int cnt = 0;
		
		for(int i = 0; i < dartResult.length(); i++) {
			// dartResult에서 한글자씩 가져와서 조건문에 들어가는데 아스키코드 참조하여 48~57 이면 (0~9) count를 ++해주면서, nStr이라는 String변수에 해당 값을 더해준다.
			if(dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
				cnt++;
				nStr += dartResult.charAt(i);
			// 그게아니라 S,D,T가 들어오면
			} else {
				if(cnt > 0) {
					list.add(nStr);
					nStr = "";
					cnt = 0;
				}
				list.add(dartResult.charAt(i)+"");
			}
		}
		
		System.out.println(list);
		
		
		int count = 0;
		
		// 이제 for문 돌려서 점수 계산해보자!
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("S")) {
				answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 1);
				count++;
			} else if(list.get(i).equals("D")) {
				answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 2);
				count++;
			} else if(list.get(i).equals("T")) {
				answer += (int)Math.pow(Integer.parseInt(list.get(i-1)), 3);
				count++;
			} else if(list.get(i).equals("#")) {
				if(count == 1) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * -1;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
					}
				} else if(count == 2) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * -1;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
					}
				} else {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * -1;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 2) * -1;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += Math.pow(Integer.parseInt(list.get(i-2)), 3) * -1;
					}
				}
			} else if(list.get(i).equals("*")) {
				if(count == 1) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += (Integer.parseInt(list.get(i-2))) * 2;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
					}
				} else if(count == 2) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += Integer.parseInt(list.get(i-2)) * 2;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
					} 
					
					if(list.get(i-3).equals("S")) {
						answer -= Integer.parseInt(list.get(i-4));
						answer += (Integer.parseInt(list.get(i-4))) * 2;
					} else if(list.get(i-3).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 2)) * 2;
					} else if(list.get(i-3).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 3)) * 2;
					}
					
					if(list.get(i-4).equals("S")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Integer.parseInt(list.get(i-5))*-1);
							answer += (Integer.parseInt(list.get(i-5))*-1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Integer.parseInt(list.get(i-5)) * 2;
							answer += Integer.parseInt(list.get(i-5)) * 4;
						}
					} else if(list.get(i-4).equals("D")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 2) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 2) * 4;
						}
					} else if(list.get(i-4).equals("T")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 3) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 3) * 4;
						}
					}
					
				} else if(count == 3) {
					if(list.get(i-1).equals("S")) {
						answer -= Integer.parseInt(list.get(i-2));
						answer += (Integer.parseInt(list.get(i-2))) * 2;
					} else if(list.get(i-1).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 2)) * 2;
					} else if(list.get(i-1).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-2)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-2)), 3)) * 2;
					} 
					
					if(list.get(i-3).equals("S")) {
						answer -= Integer.parseInt(list.get(i-4));
						answer += (Integer.parseInt(list.get(i-4))) * 2;
					} else if(list.get(i-3).equals("D")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 2);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 2)) * 2;
					} else if(list.get(i-3).equals("T")) {
						answer -= Math.pow(Integer.parseInt(list.get(i-4)), 3);
						answer += (Math.pow(Integer.parseInt(list.get(i-4)), 3)) * 2;
					}
					
					if(list.get(i-4).equals("S")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Integer.parseInt(list.get(i-5))*-1);
							answer += (Integer.parseInt(list.get(i-5))*-1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Integer.parseInt(list.get(i-5)) * 2;
							answer += Integer.parseInt(list.get(i-5)) * 4;
						}
					} else if(list.get(i-4).equals("D")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 2) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 2) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 2) * 4;
						}
					} else if(list.get(i-4).equals("T")) {
						if(list.get(i-3).equals("#")) {
							answer -= (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1);
							answer += (Math.pow(Integer.parseInt(list.get(i-5)), 3) * -1) * 2;
						} else if(list.get(i-3).equals("*")) {
							answer -= Math.pow(Integer.parseInt(list.get(i-5)), 3) * 2;
							answer += Math.pow(Integer.parseInt(list.get(i-5)), 3) * 4;
						}
					}
				}
			}
		}
		return answer;
	}
			
	
	public static void main(String[] args) {
		//System.out.println(solution("1S2D*3T")); // =>37
		//System.out.println(solution("1D2S#10S")); // => 9
		//System.out.println(solution("1D2S0T")); // => 3
		//System.out.println(solution("1S*2T*3S")); // => 23
		//System.out.println(solution("1D#2S*3S")); // => 5
		//System.out.println(solution("1T2D3D#")); // => -4
		//System.out.println(solution("1D2S3T*")); // => 59
		//System.out.println(solution("10D10T*10S"));
		//System.out.println(solution("10T#10T*10S"));
		//System.out.println(solution("10T#10T#10S#"));
		//System.out.println(solution("9D10T*10S"));
		//System.out.println(solution("10T#10T#10S#"));
		//System.out.println(solution("1T#1T#1S#"));
		//System.out.println(solution("1T#1T#10S#"));
		//System.out.println(solution("1T1T1S*"));
		//System.out.println(solution("1T1T1S"));
		//System.out.println(solution("0T1T1S"));
		//System.out.println(solution("0T#9T0S*"));
		System.out.println(solution("10T#10S*10D"));
	}

}
