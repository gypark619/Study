package studyJAVA;

public class Array {

	public static void main(String[] args) {
		/*
		 * boolean 타입 배열 3개 생성하고
		 * 임의의 boolean 타입 데이터 초기화 후 출력
		 * 2번 인덱스만 true 값으로 초기화
		 */
		boolean[] arr2 = new boolean[3];
		arr2[2] = true;
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr2[i]);
		}
		
		System.out.println("============================================");
		/*
		 * String 타입 배열 3개를 생성하고
		 * 0번 "홍길동", 1번 "이순신" 문자열로 초기화한 후 출력
		 */
		String[] arr3 = new String[3];
		arr3[0] = "홍길동";
		arr3[1] = "이순신";
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr3[i]);
		}
		
		System.out.println("============================================");
		/*
		 * double 타입 데이터 5개를 저장하는 배열 arr4 생성 후
		 * 임의의 4개의 실수로 초기화 후 전체 데이터 차례대로 출력
		 * 단, 마지막 인덱스 번호는 값을 비워둔다.
		 */
		double[] arr4 = new double[5];
		
		arr4[0] = 1.1;
		arr4[1] = 2.2;
		arr4[2] = 3.3;
		arr4[3] = 4.4;
		
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : " + arr4[i]);
		}
		
		System.out.println("============================================");
		/*
		 * 배열의 최대값을 구하는 코드
		 * numbers = { 3, 2, 14, 21, 100, 4, 2, 1 }
		 * int max; int min; int sum; int avg;
		 * 
		 * 출력 결과
		 * 
		 * 최대값 : 100
		 * 최소값 : 1
		 * 합  계 :
		 * 평  균 :  
		 */
		
		// 배열 선언, 생성, 초기화
		int[] numbers = {3, 2, 14, 21, 100, 4, 2, 1};
		
		// 변수 선언 및 초기화
		// 비교 대상 값으로 배열 내의 데이터를 갖고 시작
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		double avg = 0.0;
		
		// 반복문(for)문을 통해 비교 및 대입
		for(int i = 0; i < numbers.length; i++) {
			
			// 최대값
			if(max < numbers[i]) {
				max = numbers[i];
			}
			
			// 최소값
			if(min > numbers[i]) {
				min = numbers[i];
			}
			
			// 합계
			sum += numbers[i];
			
		} // for 반복문 끝
				
		// 평균
		avg = (double)sum / numbers.length;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합  계 : " + sum);
		System.out.println("평  균 : " + avg);

	}

}
