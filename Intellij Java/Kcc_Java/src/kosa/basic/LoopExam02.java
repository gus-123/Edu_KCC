package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// ��ø for��
		//��ü ������ ���
//		for(int i = 1; i <=9 ; i++) {
//			for(int j = 1; j <=9 ; j++) {
//				System.out.printf("%d * %d = %d ", i, j, i*j);
//			}
//			System.out.println();
//		}
		
//		//��ø for���� �̿��ؼ� ������ ���
//		for(int i = 2; i <=9 ; i++) {
//			for(int j = 1; j <=9 ; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//		}
//	}
		
//		//����4> 4x+5y = 60 => x,y�� ������(��� ����� ��)
//		outerLabel:
//		for(int i = 0; i <=15 ; i++) {
//			for(int j = 0; j <=12 ; j++) {
//				if (4 * i + 5 * j == 60) {
//					System.out.println(i + " " + j);
//					break outerLabel;
//				}
//				
//			}
//		}
//			
//		}
		
		//����> 
		//*
		//**
		//***
		//****
		//*****
		
		for(int i = 0; i < 6 ; i++) {
			for (int j =0; j < i; j++) {
				System.out.print("*");
		}
		System.out.println();
		}
		System.out.println();
		//����>
		//*****
		//****
		//***
		//**
		//*
		
		for(int i = 5; i > 0 ; i--) {
			for (int j =0; j < i; j++) {
				System.out.print("*");
		}
		System.out.println();
		}
}
}
