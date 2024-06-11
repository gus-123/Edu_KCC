package kosa.io;

import java.io.*;

public class Main {

    Member m;

    //��ü ����ȭ
    public void insert() {
        m = new Member("ȫ�浿", 20, new Video("1", "������ ��", "���켺"));  // ��ü ����
        ObjectOutputStream oos = null; // ��Ʈ�� �ʱ�ȭ
        try {
            oos = new ObjectOutputStream(new FileOutputStream("object.ser"));  // ���� ����
            oos.writeObject(m);  // ���� �Է�

        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                oos.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //��ü ������ȭ
    public void show() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.ser"));  // ���� �ȿ� ��ü�� �о�帲
            m = (Member) ois.readObject();  // readObject�� ĳ���� �Ѵ�.
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                ois.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Main main = new Main();  // ��ü ����

        main.insert();
        main.m = null;  // ��� ��ü�� ���Ͽ� �ۿ� ����
        main.show();

        System.out.println(main.m);
    }
}
