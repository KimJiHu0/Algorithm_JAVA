package Algorithm001;

import java.util.ArrayList;
import java.util.Scanner;

public class MTest {
	
	public static void main(String[] args) {
		
		// 4명의 학생 저장
		// Student class를 생성해서 저장
		Student st1 = new Student("김지후", "20200000");
		Student st2 = new Student("강여림", "20201111");
		Student st3 = new Student("위영석", "20202222");
		Student st4 = new Student("박진우", "20203333");
		
		// 학생들을 ArrayList에 저장
		
		// 학생들을 넣어줄거라 제네릭은 Student
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		
		// 사용자로부터 키 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 무한루프돌리면서
		while(true) {
			System.out.println("계속 검색하시려면 y / 종료하고싶으시면 n");
			// 사용자가 입력받을 값을 key라는 변수에 담아주고, 
			String key = sc.next();
			
			// key가 y라면
			if(key.equals("y")) {
				System.out.println("검색할 학생의 이름을 적어주세요.");
				String name = sc.next();
				
				boolean flag = false;
				
				// Student타입의 변수 st에 list의 하나하나를 담아주며 반복문,
				for(Student st : list) {
					// st의 Name이 사용자가 입력받은 학생의 이름이랑 동일하다면
					if(st.getName().equals(name)) {
						// 학생 이름과 학번 출력
						System.out.println("해당하는 학생 이름은 : " + st.getName());
						System.out.println("해당하는 학생 학번은 : " + st.getNo());
						// flag를 true로 변경해준다.
						// 만일 찾는게 없다면 flag는 그대로 false
						flag = true;
					}
				}
				
				// flag가 true 가 아니라면 [학생이 없다면]
				if (!flag){
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
			// 사용자가 n을 입력하면
			} else if(key.equals("n")) {
				// 종료문구 띄우고 break;
				System.out.println("종료되었습니다.");
				break;
			} else {
				// 아예 다른 키를 눌렀을 때
				System.out.println("키를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
		
		
	}

}
