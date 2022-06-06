package ch5;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 클래스는 char[]와 메서드(기능)을 결합
		// -> 내용 변경 불가(읽기만 가능)

		String str1 = "abcde";
		// charAt는 문자열에서 해당위치에 있는 문자 반환
		char ch = str1.charAt(1); // b를 ch에 저장
		System.out.println(ch); // b
		
		// 문자열 길이 반환
		System.out.println(str1.length());// 5
		
		// String substring(int from, int to) 문자열에서 해당 범위의 문자열 반환
		String tmp = str1.substring(0, 2); // 인덱스 범위 0부터 2 사이의 문자들 반환
		System.out.println(tmp); // ab (to는 포함 안함)
		
		// equals는 문자열의 내용이 같은지 확인(대소문자 구분함)
		if (str1.equals("abcdef")) {
			System.out.println("Okay");
		} else {
			System.out.println("Nope!");
		}
		
		// 문자열 내용확인 시 대소문자 구분하지 않으려면 equalsIgnoreCase() 사용
		if (str1.equalsIgnoreCase("Abcde")) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		
		// tocharArray() 은 문자열을 한 글자씩 쪼개 문자배열(char[])로 반환
		char[] charArr = str1.toCharArray();
		System.out.println(charArr); // "abcde" -> abcde
		System.out.println(charArr[0]); // a
		System.out.println(charArr[1]); // b
		System.out.println(charArr[2]); // c
		System.out.println(charArr[3]); // d
		System.out.println(charArr[4]); // e
	}
}

