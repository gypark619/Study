package studyJAVA;

public class for_ {

	public static void main(String[] args) {
		/*
		 * for문을 사용하여 특정 단에 해당하는 구구단 출력
		 *  < 2단 >
		 * 2 * 1 = 2 
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 */
		
		// 단(dan)과 곱해지는 수(i) 를 저장할 변수를 선언하고 값을 저장하면
		// 단이 바뀌더라도 대응이 가능!
		int dan = 2;
		int i = 1;
		
		System.out.println(" < " + dan + "단 >");
		
		for(i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}

		System.out.println("=================================");
		
		/*
		 * 중첩 for 문을 사용하여 타이머 출력하기
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
		
		// 바깥쪽 for문으로 분(min, 0 ~ 59 반복)
		for(int min = 0; min <= 59; min++) {
//			System.out.println(min + "분");
			
			// 안쪽 for문으로 초(sec, 0 ~ 59 반복)
			for(int sec = 0; sec <= 59; sec++) {
//				System.out.println(min + "분" + sec + "초");
				System.out.printf("%2d분%2d초\n", min, sec);
				// %2d를 사용하면 열의 모양이 흐트러지지 않고 깔끔하게 나옴
			}
			
		}
		
		System.out.println("=================================");
		
		/*
		 * 주사위 2개를 굴려서 주사위 눈의 합이 6 일 때 두 주사위 값을 출력
		 * ex) 주사위1		주사위2			합계
		 * 		1		+		5		=	 6
		 * 		2		+		4		=	 6
		 * 		3		+		3		=	 6
		 * 		4		+		2		=	 6
		 * 		5		+		1		=	 6
		 * 
		 * 주사위 눈 : 1 ~ 6
		 * 주사위(dice1, dice2) 변수 값을 1 ~ 6까지 1씩 증가하면서 반복하여
		 * 주사위 눈의 합계가 6인지 판별하여 6일 때 주사위 눈의 값 출력
		 * => 판별을 해야 하므로 if문이 같이 사용됨!
		 */
		
		// 주사위 1을 반복
		for(int dice1 = 1; dice1 <= 6; dice1++) {
			
			// 주사위2를 반복
			for(int dice2 = 1; dice2 <= 6; dice2++) {
				
				if(dice1 + dice2 == 6) { // 주사위 눈의 합이 6인지 판별
					// 두 주사위 눈의 합이 6일 때만 출력 실행
					System.out.println(dice1 + " + " + dice2 + " = " + (dice1 + dice2));					
				}
			}
		}
		
		
		
	}

}
