package StudyJAVA;

public class switch_ {

	public static void main(String[] args) {
		/*
		 * 입력받은 월(month) 이 다음과 같을 때 월의 일수 출력
		 * - 1, 3, 5, 7, 8, 10, 12월일 경우 : "한 달은 31일" 출력
		 * - 4, 6, 9, 11월일 경우 : "한달은 30일" 출력
		 * - 2월일 경우 : "한 달 28일" 출력
		 */
		
		int month = 1; // 1월일 경우
		switch(month) {
			// 1, 3, 5, 7, 8, 10, 12월의 경우 한 달은 31일
			case 1  : case 3  : case 5  : case 7  : case 8  : case 10 : 
			case 12 : System.out.println(month + "월 한달은 31일"); break;
			// 4, 6, 9, 11 월의 경우 한 달은 30일
			case 4  : case 6  : case 9  : 
			case 11 : System.out.println(month + "월 한달은 30일"); break;
			// 2월의 경우 한 달은 28일
			case 2  : System.out.println(month + "월 한달은 28일"); break;
		}
		
		System.out.println("=================================");

		
		/*
		 * 점수(score)에 따른 학점 계산을 switch 문으로 수행하기
		 * A 학점 : 90점대와 100점(= 10의 자리 숫자가 9 또는 10)
		 * B 학점 : 80점대
		 * C 학점 : 70점대
		 * D 학점 : 60점대
		 * F 학점 : 나머지 점수
		 */

		int score = 95; // 점수가 95점일 때
		if(score >= 0 && score <= 100) { // 점수는 0 ~ 100점 사이로 제한한다
			switch(score / 10) {
				// A 학점 : 90점대와 100점(= 10의 자리 숫자가 9 또는 10)
				case 10: 
				case 9 : System.out.println(score + " : A 학점!"); break;
				// B 학점 : 80점대 (= 10의 자리 숫자가 8)
				case 8 : System.out.println(score + " : B 학점!"); break;	
				// C 학점 : 70점대 (= 10의 자리 숫자가 7)
				case 7 : System.out.println(score + " : C 학점!"); break;	
				// D 학점 : 60점대 (= 10의 자리 숫자가 6)
				case 6 : System.out.println(score + " : D 학점!"); break;
				// F 학점 : 나머지 점수
				default : System.out.println(score + " : F 학점!");		
			}
		} else {
			// 0 ~ 100점 사이의 올바른 점수를 입력하지 않은 경우
			System.out.println(score + " : 점수 입력 오류!");
		}
		
		
		
	}

}
