package kosa.stram;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import static java.nio.file.Files.write;

public class KosaWriter {

    public static void main(String[] args) {
        //Ű����κ��� ���ڿ��� �Է� �޾� ���Ͽ� ���� ������ ��������.
        //"q"�� �Է��ϱ� ������ ���ڿ��� ���Ͽ� ������ ����.
        //FileWriter : write(���ڿ�)
        //���ϸ� : poem2.txt : �̸� ���� x
        // �ڵ� ���� �� ���÷��� => ���� ���� Ȯ�� o
        //close() ����


        Scanner sc = new Scanner(System.in);
        FileWriter writer = null;
        String str = "";
        String poem = "";

        System.out.println("�Է� :");
        while(!(str = sc.nextLine()).equals("q")) {
            poem += str;
            poem += "\n";
        }

        try {
            writer = new FileWriter("poem2.txt");
            writer.write(poem);
        }catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


        /* ����*/
        /*FileReader reader = null;
        FileWriter writer = null;
        Scanner sc = new Scanner(System.in);
        String fin = "q";

        try {
            while (true) {
                if (fin.equals(sc.nextLine())) {
                    System.out.println("����");
                }
                else {
                    writer = new FileWriter("poem2.txt");
                    char input = sc.nextLine().charAt(0);
                    writer.write(input);
                }

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
}
