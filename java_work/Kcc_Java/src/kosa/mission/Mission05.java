package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// �޴��� �����ؼ� �ش� �޴��� ��ɹ��� ������ ����.
		// 1. �߰�, 2. ���, 3. �˻� 4. ����
		
		int num =0, bread = 0 ;
		
		while (true) {
			System.out.println("�޴��� �������ּ��� : 1. �߰�, 2. ���, 3. �˻�, 4. ����");
			
			Scanner sc =new Scanner(System.in);
			
			System.out.print("�޴� ��ȣ �Է� : ");
			num = sc.nextInt();
		
			switch (num) {
				case 1 :
					System.out.println("�� �߰�");
					bread++;
					break;
				case 2 :
					System.out.println("���� ���� : " + bread);
					break;
				case 3 :
					System.out.println("1. �ұݻ�, 2. ���̱�, 3. ������ġ");
					break;
				case 4 :
					System.out.println("�޴� ������ ���� �˴ϴ�.");
					return;
				default:
					break;
			}
		}
	}
	
}
