package kosa.mission;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ����
		// ����, ����, ���� ������ Ű����� ���� �Է� �ް�
		// ������ ����� ����ϼ���. (�� ����� �Ǽ���)
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("���� ������ �Է��Ͻÿ� : ");
//		double kor = sc.nextDouble();
//		
//		System.out.print("���� ������ �Է��Ͻÿ� : ");
//		double eng = sc.nextDouble();
//		
//		System.out.print("���� ������ �Է��Ͻÿ� : ");
//		double math = sc.nextDouble();
//		
//		System.out.println();
//		
//		double hap = kor + eng + math;
//		double avg = hap / 3;
//		
//		System.out.println("���� : " + kor);
//		System.out.println("���� : " + eng);
//		System.out.println("���� : " + math);
//		
//		System.out.printf("���� : %.1f \n", hap);
//		System.out.printf("��� : %.1f", avg);
		
		int kor, eng, math;
		int total , avg;
		
		
		System.out.print("���� : ");
		kor = sc.nextInt();
		
		System.out.print("����: ");
		eng = sc.nextInt();
		
		System.out.print("���� : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / (int)3.0;
		
		System.out.println();
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		
		// ���� 90 �̻� => A����
		// ���� 80 �̻� => B����
		// ���� 70 �̻� => C����
		// ���� 60 �̻� => D����
		// ���� 60 ���� => F����
		

//		if (avg >= 90) {
//			System.out.println("�� �л��� A���� �Դϴ�.");
//		}
//		else if(avg >= 80) {
//			System.out.println("�� �л��� B���� �Դϴ�.");
//		}
//		else if(avg >= 70){
//			System.out.println("�� �л��� C���� �Դϴ�.");
//		}
//		else if(avg >= 60) {
//			System.out.println("�� �л��� D���� �Դϴ�.");
//		}
//		else {
//			System.out.println("�� �л��� F���� �Դϴ�.");
//		}
		
		switch (avg%10) {
		case 90 :
			System.out.println("�� �л��� A���� �Դϴ�.");
			break;
		case 80 :
			System.out.println("�� �л��� B���� �Դϴ�.");
			break;
		case 70 :
			System.out.println("�� �л��� C���� �Դϴ�.");
			break;
		case 60 :
			System.out.println("�� �л��� D���� �Դϴ�.");
			break;
		default : 
			System.out.println("�� �л��� F���� �Դϴ�..");
			break;
			
		}
		
		
		
		
		
	}

}
