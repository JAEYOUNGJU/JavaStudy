package ch5;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Ŭ������ char[]�� �޼���(���)�� ����
		// -> ���� ���� �Ұ�(�б⸸ ����)

		String str1 = "abcde";
		// charAt�� ���ڿ����� �ش���ġ�� �ִ� ���� ��ȯ
		char ch = str1.charAt(1); // b�� ch�� ����
		System.out.println(ch); // b
		
		// ���ڿ� ���� ��ȯ
		System.out.println(str1.length());// 5
		
		// String substring(int from, int to) ���ڿ����� �ش� ������ ���ڿ� ��ȯ
		String tmp = str1.substring(0, 2); // �ε��� ���� 0���� 2 ������ ���ڵ� ��ȯ
		System.out.println(tmp); // ab (to�� ���� ����)
		
		// equals�� ���ڿ��� ������ ������ Ȯ��(��ҹ��� ������)
		if (str1.equals("abcdef")) {
			System.out.println("Okay");
		} else {
			System.out.println("Nope!");
		}
		
		// ���ڿ� ����Ȯ�� �� ��ҹ��� �������� �������� equalsIgnoreCase() ���
		if (str1.equalsIgnoreCase("Abcde")) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
		
		// tocharArray() �� ���ڿ��� �� ���ھ� �ɰ� ���ڹ迭(char[])�� ��ȯ
		char[] charArr = str1.toCharArray();
		System.out.println(charArr); // "abcde" -> abcde
		System.out.println(charArr[0]); // a
		System.out.println(charArr[1]); // b
		System.out.println(charArr[2]); // c
		System.out.println(charArr[3]); // d
		System.out.println(charArr[4]); // e
	}
}

