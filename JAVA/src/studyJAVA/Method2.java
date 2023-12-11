package studyJAVA;

public class Method2 {
	public static void main(String[] args) {
		
		/*
		 * 5. 파라미터가 2개 이상인 메서드 호출 연습
		 * 연산자 문자 1개와 정수 2개를 전달받아
		 * 두 정수에 대한 어떤 연산을 수행한 후 결과값을 리턴하는 메서드 호출
		 */
		
		int result = operation('+', 10, 20); // 덧셈의 경우
		System.out.println("연산 결과 = " + result);
		
		result = operation('-', 10, 20); // 뺄셈의 경우
		System.out.println("연산 결과 = " + result);
		
		result = operation('*', 10, 20); // 정의하지 않은 곱셈의 경우
		System.out.println("연산 결과 = " + result);
		
		
		System.out.println("------------------------------------------------");
		
		/*
		 * 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드를 호출하고
		 * 리턴값을 출력(ex. 10, 20 전달 시 10 + 20 결과인 30 리턴)
		 */
		
		int result2 = sum(10, 20);
		System.out.println("계산 결과 = " + result2);
		
		
		
		
	} // main() 메서드 끝
	
	/*
	 * 5. 파라미터가 2개 이상인 메서드 정의 연습
	 * 연산자 문자 1개와 정수 2개를 전달받아
	 * 두 정수에 대한 어떤 연산을 수행한 후 결과값을 리턴하는 메서드 정의
	 */
	
	// 파라미터 3개를 갖는 메서드 정의
	public static int operation(char opr, int num1, int num2) { 
		int result = 0; // 연산 결과를 저장할 변수 선언
		
		if(opr == '+') { // 덧셈일 경우
			result = num1 + num2;
		} else if(opr == '-') { // 뺄셈일 경우
			result = num1 - num2;
		} else {
			// 잘못된 연산자가 입력되었을 경우
			// 오류 메시지 출력 후 0 리턴
			System.out.println("연산자가 올바르지 않습니다!");
		}
		
		return result; // 결과를 리턴
	}
	
	
	// -----------------------------------------------------------------------
	
	/*
	 * 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드를 정의하고
	 * 리턴값을 출력(ex. 10, 20 전달 시 10 + 20 결과인 30 리턴)
	 */
	
	// 파라미터 2개를 갖는 메서드 정의
	public static int sum(int num1, int num2) {
		System.out.println("숫자1 = " + num1);
		System.out.println("숫자2 = " + num2);
		return num1 + num2; // 결과를 리턴
	}
	
} // 클래스 끝
