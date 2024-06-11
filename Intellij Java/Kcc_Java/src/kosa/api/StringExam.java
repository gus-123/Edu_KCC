package kosa.api;

import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.Scanner;

public class StringExam {

    public static void main(String[] args) {
        //1. String ��ü ���� ����� ������
        String str0 = "ABC";
        String str2 = "ABC";
        String str3 = new String("ABC");

        if (str0 == str2) {  // ó������ ����� �Ȱ��� �� ������ �ּҰ��� ������.
            System.out.println("����.");
        } else {
            System.out.println("�ٸ���");
        }

        if (str0 == str3) {  // new�� �ϰ� �Ǹ� ������ ���� ����.
            System.out.println("����.");
        } else {
            System.out.println("�ٸ���");
        }

        //2. String Ŭ���� �Һ��� Ư¡ => StringBuffer, StringBuilder (������)
        str0.concat("DEF");
        System.out.println(str0);  // �� � �޼ҵ�� �ڱ� �ڽ��� ������ �� ����. return�ؼ� ���

        String str4 = str0.concat("DEF");
        System.out.println(str4);

        StringBuffer sb = new StringBuffer("ABC");
        sb.append("DEF");
        System.out.println(sb);

        // ������(+) ���� ����
        String sql = "select * from board";
        int num = 10;


        if (num == 10) {
            sql += "where num = 10";
        }

        System.out.println(sql);

        // �ش� ���ڿ��� ��ġ�� �ľ� => indexOf("���ڿ�") => �ش� ���ڿ��� �ε���, ������ -1
        System.out.println(sql.indexOf("board"));
        System.out.println(sql.indexOf("$"));

        // ���ڿ� ����
        System.out.println(sql.length());

        for (int i = 0; i < sql.length(); i++) {
            System.out.print(sql.charAt(i));
        }

        System.out.println();
        // ���ڿ� �κ� ���� : subString(5) - �ε����� 6����, subString(5, 10) - �ε����� 6���� 9����
        // ���� : sql ���� :board"���ڿ��� ���
        System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + 5));

        // ���� >
        String fileName = "kosa.jpg";
        String head = "";
        String pattern = "";

        head = fileName.substring(0, fileName.lastIndexOf("."));
        pattern = fileName.substring(fileName.lastIndexOf(".") + 1);

        System.out.println(head + ":" + pattern);


        // qualsIgnoreCase ��,�ҹ��� ����
        String id = "kosa";
        String m_id = "Kosa ";

        if(id.equalsIgnoreCase(m_id.trim())) {
            System.out.println("����.");
        }
        else {
            System.out.println("�ٸ���");
        }

        // ���ڿ� ==> String[] ��ȯ
        String fruits = "���,����,����,��";
        String arr[] = fruits.split(",");
        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }

        // ���ڿ� ==> char[] ��ȯ
        String str5 = "abcdef";
        char arr2[] = str5.toCharArray();
        System.out.println(Arrays.toString(arr2));

        //���ڿ� ==> byte[] ��ȯ
        String str6 = "abcdef";
        byte arr3[] = str6.getBytes();
        System.out.println(Arrays.toString(arr3));

        //���ڿ� <==> ������
        String str7 = "100";
        int num1 = Integer.parseInt(str7);
        System.out.println(num1);

        int num3 = 10;
        //String str8 = String.valueOf(num3);
        String str8 = 10 + "";
        System.out.println(str8);

        // ���� ã��
        // ���� �ذ�
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("�Ѱ��� ���ڿ��� �Է� : ");
//        String first = sc.nextLine();
//        System.out.print("Ư�� ���ڸ� �Է� : ");
//        String second = sc.nextLine();
//
//        int count = 0;
//
//        if(first.length() == 100) {
//            System.out.println("���ڿ��� ���̰� 100�� �ѽ��ϴ�.");
//        }
//        else if(first.equalsIgnoreCase(second.trim())) {
//            for (int i = 0; i < first.length(); i++) {
//                char c = first.charAt(i);
//                if (Character.toLowerCase(c) == second.toLowerCase().charAt(0)) {
//                    count ++;
//                }
//            }
//            System.out.println(count);
//        }

        // �ܾ�ó��
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("�Ѱ��� ���ڿ��� �Է� : ");
//        String str = sc.nextLine();
//        System.out.print("Ư�� ���ڸ� �Է� : ");
//        char c = sc.nextLine().charAt(0);  // char �޴� ����
//
//        System.out.println(solution(str, c));
        /*end */

        // ���� �� �ܾ�
        Scanner sc = new Scanner(System.in);

        System.out.print("�Ѱ��� ���ڿ��� �Է� : ");
        String str1 = sc.nextLine();

        String ans = "";
        int maxLen = 0; // ���ڿ� �� ���� �� ���̸� ������ ����

        String[] arr1 = str1.split(" ");

        for (int i = 0; i < arr1.length; i++) {
            int len = arr1[i].length(); // ���� ���ڿ� ����
            if (len > maxLen) { // ���� ���ڿ� ���̰� �ִ� ���̺��� ũ�� ����
                maxLen = len;
            }
        }

        System.out.println("���� �� ���ڿ��� ���̴� " + maxLen + "�Դϴ�.");


    }

    public static int solution(String str, char c) {
        int ans = 0;

        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // 1�� ���
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                ans++;
            }
        }

        //2�� ���
        for (char x : str.toCharArray()) {
            if (x == c) {
                ans++;
            }
        }

        return ans;

        //���� �� �ܾ�
//        String answer = "";
//        String arr[] = str.split(" ");
//        int m = 0;
//
//        for (String x : arr) {
//
//        }
    }
}
