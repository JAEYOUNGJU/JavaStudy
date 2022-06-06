package ch5;

import java.util.Arrays;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 배열의 초기화

		String[] directionArr = { "동", "서", "남", "북" }; // 0~3
		System.out.println(Arrays.toString(directionArr)); //배열의 내용 출력

		// 랜덤함수 사용하여 요소 (동,서,남,북) 중 1개 출력
		// 랜덤함수 Math.random()은 0.0 이상 1.0 미만의 double 형의 난수 생성
		for (int i = 0; i < 5; i++) { //5번 실행
			int tmp = (int)(Math.random() * 4); //값을 바꾸는데 사용할 임시변수
//			System.out.println(tmp); //숫자로 출력됨
			System.out.println(directionArr[tmp]); //숫자 대신에 배열에 있는 문자 출력됨
		}
	}
}
