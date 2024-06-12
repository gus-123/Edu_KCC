package kosa.io;

import java.io.*;
import java.util.Scanner;

public class Dos {

    //private static String source = "C:\\Users\\KOSA\\Downloads\\Default";

    //�𷺸� ���� (�ش� ���� �����ؼ�
    public static void copyDirectory(File source, File dest) {
        if (source.isDirectory()) {  // ���丮���� Ȯ��
            dest.mkdir();  // ���͸� ����

            File[] fileList = source.listFiles();  // ������ �������� ���ϵ��� ����Ʈ�� �߰�
            for (int i = 0; i < fileList.length; i++) {
                File sourceFile = fileList[i];
                if (sourceFile.isDirectory()) {
                    //new file(���丮 ���, �����̸�);
                    File s_destFile = new File(dest, sourceFile.getName());
                    copyDirectory(sourceFile, s_destFile);
                }else {
                    File destFile = new File(dest, sourceFile.getName());
                    copyFile(sourceFile, destFile);  // ���� ����
                }
            }
        }
    }

    //����Ʈ ���� ���� ���� 1���� �����ϴ� �޼���
    public static void copyFile(File source, File dest) {


        FileInputStream fis = null;
        FileOutputStream fos = null;
        int data = 0;

        byte[] arr = new byte[1024];

        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(dest);

            while ((data = fis.read(arr)) != -1) {
                fos.write(arr, 0, data);
            }

            System.out.println("����Ϸ�");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    public static void mkdirDirectory(File source, File dest, String name) {
        File dir = new File(source.getAbsolutePath(), name);
        if (source.isDirectory()) {
            if (!dir.exists()) {  // ������ ���� ���� ���� ���
                if (dir.mkdir()) {  // ���� ����
                    System.out.println(name + " ������ ��������ϴ�.");
                } else {
                    System.out.println(name + " ������ ���� �� �����ϴ�.");
                }
            }else {  // ������ ���� �� ���
                System.out.println(name + " ������ �̹� �����մϴ�.");
            }
        }
    }

    public static void saveFile(File source, File dest, String fileName) {

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new FileWriter(fileName + ".txt"));

            System.out.println("�Է� :");
            String str= "";

            while ((str = br.readLine()) != null) {
                str += "\n";
                bw.write(str);
            }

            System.out.println("���� �Ϸ�");
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

//    public String getSource() {
//        return source;
//    }
//    public void setSource(String source) {
//        this.source = source;
//    }
}
