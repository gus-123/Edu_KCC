package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		// ������ �����͸� ��� �׸� ex) ����, ����, �Ǽ�, �� �� 
		// byte, short, int, long, float, double, char, boolean => �⺻�� ������ Ÿ��  : ���� �����͸� �ٷ�� �� (primitive type) 
		int num;  // ������ ���� => �޸� �Ҵ� ��.
		int arr[]; // �迭�� ���� : Object Type => ���� �����͸� �ٷ�� ��(������ ������ Ÿ��)
		// ���������� �ݵ�� �ʱ�ȭ�� ���־�� �ϴ�.
		
		num = 10;
		
		//���� ����, �ʱ�ȭ
		int num2 = 100;
		
		//���ڿ� : String(������Ʈ Ÿ��)
		String name = "ȫ�浿";
		
		System.out.println(name + "��");	
		
		// ���� ���� ���� ���� 
		//������ : Ư������x, ���ڷ� ����x, �ҹ��� ����, _
		
		// �⺻ ���ͳ� : 100 => int, "" => Strting, 'A' => char, true => boolean, 31.4 => double
		float a = 3.14f;
		
		//casting (�� ��ȯ)
		//���� : byte < short < int(21�� �ڸ�) < long < flaot < double, int <=> char (�̰� �ƽ�Ű �ڵ�� ����)
		double b = 100; //�⺻���ͳ��� int�ε� double�� �� Ŀ�� �ڵ����� ĳ���� �Ǵ°��� ������ ����ȯ �̶�� ��.
		int c = (int)3.14; // ������ ��ȯ( �������� �ս� �߻�)
		System.out.println(c);
		
		float num3 = 3.14f;
		long num4 = 100L;		
		
		int num5 = 010; // 8����
		System.out.println(num5);
		
	}

}
