package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {
	
	public static void main(String[] args) {
		//Ű����� ������ �Է� (api => scanner)
		/* �ܺ� ��Ű���� ����ϱ� ���ؼ��� import�� ���־���Ѵ�. */
		Scanner sc = new Scanner(System.in); 
		
		/*System.out.print("���� �Է� : ");
		
		int num = Integer.parseInt(sc.nextLine()); // 2�� ���
		
		//int num = sc.nextInt();  // 10 + enter
		
		//sc.nextLine(); // 1�� ���
		
		System.out.println("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);*/
		
		// int <==> char
		char ch = 'A';
		
		System.out.println((int)ch);  // => int�� ������ �ƽ�Ű�ڵ�� ����
		
		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		String num2 = "100";
		int num3 = Integer.parseInt(num2);
		int result = num3 + 100;
		
		System.out.println(result);
		
		int num4 = 10;
		String num5  = String.valueOf(num4);
		String num6 = num4 + "";
		
		String str = 7 + "7" + 7;
		System.out.println(str);
	}

}
