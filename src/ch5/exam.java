package ch5;

import java.util.Arrays;

public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String �迭�� �ʱ�ȭ

		String[] directionArr = { "��", "��", "��", "��" }; // 0~3
		System.out.println(Arrays.toString(directionArr)); //�迭�� ���� ���

		// �����Լ� ����Ͽ� ��� (��,��,��,��) �� 1�� ���
		// �����Լ� Math.random()�� 0.0 �̻� 1.0 �̸��� double ���� ���� ����
		for (int i = 0; i < 5; i++) { //5�� ����
			int tmp = (int)(Math.random() * 4); //���� �ٲٴµ� ����� �ӽú���
//			System.out.println(tmp); //���ڷ� ��µ�
			System.out.println(directionArr[tmp]); //���� ��ſ� �迭�� �ִ� ���� ��µ�
		}
	}
}
