package StudyJAVA;

public class while_ {

	public static void main(String[] args) {
		/*
		 * 중첩 while문 활용하여 타이머 출력하기
		 * - 분(min) : 0 ~ 59분
		 * - 초(sec) : 0 ~ 59초
		 * 
		 * < 출력 예시 >
		 * 0분 0초
		 * 0분 1초
		 * 0분 2초
		 * ... 생략 ...
		 * 0분 59초
		 * 1분 0초
		 * 1분 1초
		 * ... 생략 ...
		 * 59분 58초
		 * 59분 59초
		 * 
		 */
		
		int min = 0;
		
		while(min <= 59) {
			int sec = 0;
			while(sec <= 59) {
				System.out.println(min + "분" + sec + "초");
				sec++;
			}
			min++;
		}
		
		System.out.println("============================================");
		
		/*
		 * 중첩 while문 활용한 구구단 전체 출력(2단 ~ 9단)
		 * 
		 *  < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * ... 생략 ...
		 * 
		 *  < 3단 >
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * ... 생략 ...
		 * 
		 *  < 9단 >
		 *  9 * 1 = 9
		 *  9 * 2 = 18
		 *  .. 생략 ...
		 *  9 * 9 = 81
		 * 
		 *  => 단(dan) 이 2 ~ 9 까지 1씩 증가(바깥쪽 for문)
		 *     이 때, 각 단마다 i값이 1 ~ 9까지 1씩 증가(안쪽 for문)
		 */
		
		int dan = 2; // 초기식1;
		
		// 바깥쪽 while문으로 단을 표현
		while(dan <= 9) {
			System.out.println("< " + dan + "단 >");
			
			int i = 1; // 초기식2
			
			// 안쪽 while문으로 곱하는 값을 증가시키기
			while(i <= 9) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				i++; // 증감식2
			}
			
			System.out.println();
			dan++; // 증감식1
		}
				
	}

}
