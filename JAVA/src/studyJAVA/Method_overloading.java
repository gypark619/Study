package studyJAVA;

public class Method_overloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.cal('+', 10, 20); // 정수 2개를 받아 덧셈
		c.cal('-', 100, 10, 20); // 정수 3개를 받아 뺄셈
		c.cal('+', 10, 20, 30, 40); // 정수 4개를 받아 덧셈
	}

}
/*
 * 계산기(Caclulator) 클래스 정의
 * - 정수를 전달받아 덧셈만 수행하는 add() 메서드 정의
 * 1. 정수 2개를 전달받아 덧셈 결과 출력
 * 2. 정수 3개를 전달받아 덧셈 결과 출력
 * 3. 정수 4개를 전달받아 덧셈 결과 출력
 */

/*
 * 연산자에 해당하는 연산 수행하는 cal() 메서드 정의
 * c.cal('+', 10, 20); // 10 + 20 = 30 출력
 * c.cal('+', 10, 20, 30); // 10 + 20 + 30 = 60 출력
 * c.cal('+', 10, 20, 30, 40); // 10 + 20 + 30 + 40 = 100 출력
 * 
 * c.cal('-', 100, 10); // 100 - 10 = 90 출력
 * c.cal('-', 100, 10, 20); // 100 - 10 - 20 = 70 출력
 * c.cal('-', 100, 10, 20, 30); // 100 - 10 - 20 -30 = 40 출력
 */

class Calculator {
	// 숫자 2개를 받아 연산하는 메서드 정의
	public void cal(char opr, int num1, int num2) {
		if(opr == '+') { // 덧셈일 경우
			System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
		} else if(opr == '-') {
			System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);			
		}
	}
	
	// 숫자 3개를 받아 연산하는 메서드 정의
	public void cal(char opr, int num1, int num2, int num3) {
		if(opr == '+') { // 덧셈일 경우
			System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, num1+num2+num3);
		} else if(opr == '-') {
			System.out.printf("%d - %d - %d = %d\n", num1, num2, num3, num1-num2-num3);			
		}
	}
	
	// 숫자 4개를 받아 연산하는 메서드 정의
	public void cal(char opr, int num1, int num2, int num3, int num4) {
		if(opr == '+') { // 덧셈일 경우
			System.out.printf("%d + %d + %d + %d = %d\n", num1, num2, num3, num4, num1+num2+num3+num4);
		} else if(opr == '-') {
			System.out.printf("%d - %d - %d - %d = %d\n", num1, num2, num3, num4, num1-num2-num3-num4);			
		}
	}
	
}