package kosa.api;

import java.util.Arrays;
import java.util.Scanner;

public class StringExam {
	public static void main(String args[]) {
		String str0 = "ABC";
		String str2 = "ABC";
		String str3 = new String("ABC");
		
		if (str0 == str2) {
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���");
		}
		
		//str0�� str2�� ����
		
		if (str2 == str3) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		// str3�� new�� ��������⶧���� ������ �޸� �Ҵ��� ���� ���־ �ٸ���
		
		str0.concat("DEF");
		System.out.println(str0);
		
		// ��ü�� �Һ��� ������ �ٲ��� ����
		// �㳪 String�� ���� ���� �����ϸ� �����.
		// 1�� ���� �� ����
		String str4 = str0.concat("DEF");
		
		System.out.println(str4);
		
		//2. buffer�� �����Ͽ� append�� �߰�
		StringBuffer sb = new StringBuffer("abc");
		
		sb.append("def");
		
		System.out.println(sb);
		
		//3.  (+)�����ڸ� �̿��Ͽ� String �߰�
		String sql = "select * from board";
		
		sql += "where a= 1";
		
		System.out.println(sql);
		
		//���ڿ��� ��ġ�� �ľ��ϱ�
		System.out.println(sql.indexOf("select"));
		
		// ���ڿ��� ����
		System.out.println(sql.length());
		
		// �ϳ��� ���ڸ� �̴� ���
		for (int i = 0; i < sql.length(); i++) {
			System.out.println(sql.charAt(i));
		}
		
		// ���ڿ� �κ� ����
		// ���� : sql ���� : board ���ڿ��� ���
		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board")+5));
		
		String fileName = "kosa.jpg";
        String head = "";
        String pattern = "";
        
        head = fileName.substring(0, fileName.lastIndexOf("."));
        pattern = fileName.substring(fileName.lastIndexOf(".") + 1);
        
        System.out.println(head + ":" + pattern);
		
        
        // ��, �ҹ��� ����
        String id = "kosa";
        String m_id = "Kosa ";
        
        if(id.equalsIgnoreCase(m_id.trim())) {
        	System.out.println("����.");
        }
        else {
        	System.out.println("�ٸ���");
        }
		
		// ���ڿ� ==> Strin[] ��ȯ
        String fruits = "���,����,����,��";
        String arr[] = fruits.split(",");
        
        System.out.println(Arrays.toString(arr));
		
        // ���ڿ� =>char[]��ȯ
        String str6 = "abcdef";
        byte[] arr3 = str6.getBytes();
        System.out.println(Arrays.toString(arr3));
        
        //���ڿ� => ������
        String str7 ="100";
        int num1 = Integer.parseInt(str7);
        System.out.println(num1);
        
        
        // ������ => ���ڿ�
        int num3 = 200;
        String str8 = num3 + "";
        System.out.println(str8);
		
		// �ܾ� ó��
        Scanner sc = new Scanner(System.in);
        int count = 0;
        
        String str = sc.nextLine();
        
        char ch = sc.nextLine().charAt(0);
        
        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        
        for (int i =0; i< str.length(); i ++ ) {
        	if (str.charAt(i)  == ch) {
        		count++;
        	}
        }
        
        System.out.println(count);
		
        
        // ���ڿ� �� ���� �� ���̸� ����
        String num12 = sc.nextLine();
        
        int answer = 0;
        
        int len = 0;
        
        
		
        
        
	}
}
