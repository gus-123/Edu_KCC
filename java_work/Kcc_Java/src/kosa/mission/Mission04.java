package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// ���ڿ� ��
		String a= "abc";  //  String�� �����Ͱ� �ƴ϶� ������ �������̱� ������ �ּҰ��� �� �ִµ� �� �� ���� �����Ǹ� ������ �����Ƿ� �ּҰ� ����. 
		String b = "abc";
		
//		if(a==b) {  /*�̰� �ּ� �� �� */
//			System.out.println("����");
//		}
//		else {
//			System.out.println("Ʋ����");
//		}
		
//		if (a.equals(b)) {  /* �̰� ���ڿ� ���� �� */
//			System.out.println("����.");
//		}else {
//			System.out.println("Ʋ����.");
//		}
		
		
		// �� ������ ������ ���ڿ��� �Է� �޾�
		// ��Ģ���� ����� ����Ͻÿ�.
		// ex> ���� 1 : 10
		//        ���� 2 : 20
		//        ������ : +
		//��� > 30
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0, num2 = 0;
		String key = "";
		
		System.out.print("����1 : ");
		num1 = sc.nextInt();
		System.out.print("����2 : ");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("������ : ");
		key = sc.nextLine();
		
		
		if (key.equals("+")) {  
			System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		}
		else if (key.equals("-")) {
			System.out.printf("%d - %d = %d", num1, num2, num1-num2);
		}
		else if (key.equals("*")) {
			System.out.printf("%d * %d = %d", num1, num2, num1*num2);
		}
		else if (key.equals("/")) {
			System.out.printf("%d / %d = %d", num1, num2, num1/num2);
		}
		else if (key.equals("%")) {
			System.out.printf("%d % %d = %d", num1, num2, num1%num2);
		}
		else {
			System.out.println("�����ڰ� �ƴմϴ�.");
		}
	}

}
