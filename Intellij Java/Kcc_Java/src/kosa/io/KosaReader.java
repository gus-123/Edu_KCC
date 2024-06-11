package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {
    public static void main(String[] args) {
        //����(poem.txt)�� �ִ� ���ڿ� �����͸� �о����

        FileReader reader = null;
        char[] arr = new char[100];


        try {
            // FileReader ����
            reader = new FileReader("poem.txt");  // ���� ����

            // 2�� ���
            while (true) {
                Arrays.fill(arr, ' ');
                int data = reader.read(arr);
                if(data == -1) break;
                System.out.println(arr);

            }
            // 1�� ���
//            while (true) {
//                int data = reader.read();  // �����͸� ���� - �ƽ�Ű ���� ���� ��.
//                if (data == -1) {
//                    break;
//                }
//                else {
//                    System.out.print((char) data);
//                }
//            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
