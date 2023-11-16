package StudyJAVA;

public class method {

	public static void main(String[] args) {
		/*
		 * 1. 파라미터도 없고, 리턴값도 없는 메서드 호출 연습
		 * "Hello, World!" 문자열을 10번 반복 출력하는 printHello() 메서드 호출
		 */
		
		printHello();
		
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 2. 파라미터는 없고, 리턴값만 있는 메서드 호출 연습
		 * 1 ~ 10까지 정수의 합(55)을 계산하여 리턴하는 sum() 메서드 호출
		 */
		
		// 리턴되는 정수의 합(55)을 변수 total 에 저장 후 출력
		int total = sum();
		System.out.println("1 ~ 10까지 정수의 합 = " + total);
		
		
		System.out.println("-----------------------------------------");

		/*
		 * 3. 파라미터만 있고, 리턴값은 없는 메서드 호출 연습
		 * 정수 1개 전달받아 정수에 대해 "홀수", "짝수" 판별하는 checkNumber() 메서드 호출
		 */
		
		checkNumber(2);
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 4. 파라미터도 있고, 리턴값도 있는 메서드 호출 연습 연습
		 * 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수"를 판별하고
		 * 판별 결과 문자열을 리턴하는 checkNumber2() 메서드 호출 
		 */		
		
		String result = checkNumber2(2); // 리턴값을 변수에 저장
		System.out.println("판별 결과 : " + result);
		
		
		
		
		
	} // main() 메서드 끝
	
	/*
	 * 1. 파라미터도 없고, 리턴값도 없는 메서드 정의 연습
	 * "Hello, World!" 문자열을 10번 반복 출력하는 printHello() 메서드 정의
	 */
	
	public static void printHello() { // 리턴값이 없으므로 void
		// printHello() 메서드가 호출되면 "Hello, World!" 문자열 10번 출력
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello, World!");
		}
	}
	
	// -----------------------------------------------------------------------------
	
	/*
	 * 2. 파라미터는 없고, 리턴값만 있는 메서드 정의 연습
	 * 1 ~ 10까지 정수의 합(55)을 계산하여 리턴하는 sum() 메서드 정의
	 */
	
	public static int sum() {
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		return total; // 결과를 리턴
	}
	
	// ------------------------------------------------------------------------------
	
	/*
	 * 3. 파라미터만 있고, 리턴값은 없는 메서드 정의 연습
	 * 정수 1개 전달받아 정수에 대해 "홀수", "짝수" 판별하는 checkNumber() 메서드 정의
	 */
	
	public static void checkNumber(int num) { // int num을 파라미터로 받음
		if(num % 2 == 1) { // 홀수일 때
			System.out.println(num + " : 홀수!");
		} else { // 짝수일 때
			System.out.println(num + " : 짝수!");
		}
	}
	
	// ------------------------------------------------------------------------------
	
	/*
	 * 4. 파라미터도 있고, 리턴값도 있는 메서드 정의 연습
	 * 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수"를 판별하고
	 * 판별 결과 문자열을 리턴하는 checkNumber2() 메서드 정의
	 */
	
	public static String checkNumber2(int num) {
		String result = ""; // 결과를 저장할 변수 선언
		
		if(num % 2 == 1) { // 홀수일 때
			result = "홀수";
		} else if(num % 2 == 0) { // 짝수일 때
			result = "짝수";
		}
		
		return result; // 결과를 리턴
		
	}
	
	
} // 클래스 끝
