package StudyJAVA;

public class if_ {

	public static void main(String[] args) {
		// 문자 ch 에 대해 대문자, 소문자, 숫자 판별
		// => 위의 모든 조건이 false 일 때 "기타 문자" 출력
		char ch = '가';
		
		if(ch >= 'A' && ch <= 'Z') { // 대문자 ch >= 65 && ch <= 90
			System.out.println(ch + " : 대문자!");
		} else if(ch >= 'a' && ch <= 'z') { // 소문자 ch >= 97 && ch <= 122
			System.out.println(ch + " : 소문자!");
		} else if(ch >= '0' && ch <= '9') { // 숫자 ch >= 48 && ch <= 57
			System.out.println(ch + " : 숫자!");
		} else {
			System.out.println(ch + " : 기타문자!");
		}
		
		System.out.println("--------------------------------------");
		
		// 문자 ch 가 대문자일 때 소문자로 변환하고, 소문자일 때 대문자로 변환
		// => 대문자, 소문자가 아닌 경우 "변환 불가!" 출력
		ch = 'A';
		
		if(ch >= 'A' && ch <= 'Z') { // 대문자
			System.out.println(ch + " : 대문자!");
			// 대문자 -> 소문자 변환 시 32만큼 더 하면
			ch += 32;
			System.out.println("소문자 변환 후 : " + ch);
		} else if(ch >= 'a' && ch <= 'z') { // 소문자
			System.out.println(ch + " : 소문자!");
			// 소문자 -> 대문자 변환 시 32만큼 빼면
			ch -= 32;
			System.out.println("대문자 변환 후 : " + ch);
		} else {
			System.out.println(ch + " : 변환 불가!");
		}
		
	}

}
