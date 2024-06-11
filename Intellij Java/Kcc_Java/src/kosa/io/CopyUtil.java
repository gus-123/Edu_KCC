package kosa.io;

import java.io.*;
import java.util.Arrays;

public class CopyUtil {

    //�𷺸� ���� (�ش� ���� �����ؼ�
    public static void copyDirectory(File source, File dest) {
        if (source.isDirectory()) {  // ���丮���� Ȯ��
            dest.mkdir();  // ���͸� ����

            File[] fileList = source.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                File sourceFile = fileList[i];
                if (sourceFile.isDirectory()) {
                    //new file(���丮 ���, �����̸�);
                    copyDirectory(sourceFile, new File(dest, sourceFile.getName()));
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
}
