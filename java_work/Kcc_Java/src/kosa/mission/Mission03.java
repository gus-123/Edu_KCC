package kosa.mission;

import java.util.Scanner;

public class Mission03 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//������ �������� ���ؼ� ��ü �ڸ��� �� ¦��, Ȧ���� ������ ������.
//		// 5�ڸ� ex) 12345
//		// ¦���� ���� : 2��
//		// Ȧ���� ���� : 3��
//		// ���� ������ , / , %
//		int counta = 0, countb = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i =1; i <6 ; i++) {
//			System.out.print("���ڸ� �Է��Ͻÿ� : ");
//			int num = sc.nextInt();
//			
//			if (num %2 == 0) {
//				System.out.println("¦��");
//				counta ++;
//			}else {
//				System.out.println("Ȧ��");
//				countb ++;
//			}
//			System.out.printf("������ ���� %d �̰�, �������� %d �Դϴ�.\n", num/2, num%2);
//		}
//		
//		System.out.println("¦���� ������ " + counta + "�� �̰�, " + "Ȧ���� ������ " + countb + "�� �Դϴ�.");
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �������� ���ؼ� ��ü �ڸ��� �� ¦��, Ȧ���� ������ ������.
		// 5�ڸ� ex) 12345
		// ¦���� ���� : 2��
		// Ȧ���� ���� : 3��
		// ���� ������ , / , %
		Scanner sc = new Scanner(System.in);
        System.out.println("5�ڸ� ���� �Է�:");
		
        int num =sc.nextInt();//12345
        int even = 0;
        int odd = 0;
        
        even += (num/10000%2 == 0)? 1:0;
        even += (num/1000%10%2 == 0)? 1:0;
        even += (num/100%10%2 == 0)? 1:0;
        even += (num/10%10%2 == 0)? 1:0;
        even += (num%2 == 0)? 1:0;
        
        odd = 5-even;
        
        System.out.println("¦���� ����: " + even);
        System.out.println("Ȧ���� ����: " + odd);
        
	}

}
