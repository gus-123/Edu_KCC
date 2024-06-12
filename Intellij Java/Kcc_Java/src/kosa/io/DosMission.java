package kosa.io;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DosMission {
    static String source = "C:\\Users\\KOSA\\Downloads\\Default";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            //source = "C:\\Users\\KOSA\\Downloads\\Default";
            String dest = "C:\\Users\\KOSA\\Desktop\\test\\kosta";

            File currentFile = new File(source);
            System.out.print("> ");
            String str = sc.nextLine();
            switch (str) {
                case "ls":  // clear
//                    System.out.println("���� ��� : " + currentFile);
//                    Dos.copyDirectory(new File(source), new File(dest));
                    System.out.println("���� ���: " + currentFile);
                    for (File file : currentFile.listFiles()) {
                        System.out.println(file.isDirectory() ? file.getName() + "/" : file.getName());
                    }
                    //Dos.copyDirectory(new File(source), new File(dest));
                    break;
                case "cd" :
                    System.out.println("1. �ڽ� ���丮 �̵� 2. �θ� ���丮 �̵�");
                    String num = sc.nextLine();
                    if (num.equals("1")) {
                        System.out.println("�Է� :");
                        String mon = sc.nextLine();
                        String source1 = source + "\\" + mon;
                        //System.out.println(source1);
//                        File f = new File(source);
//                        String[] arr = source.split("\\");
//                        for (int i = 0; i < arr.length; i++) {
//                            arr[i] += mon;
//                        }
                        DosMission.source = source1;
                        System.out.println(source);
                        System.out.print("���� ��� : " + source1);
                        break;
                    }
                    else if (num.equals("2")) {
                        String source1 = currentFile.getParent();

                        source = source1;
                        System.out.println("���� ��� : " + source);
                    }
                    break;

                case "mkdir" :
                    System.out.print("����� ���� ���丮 �̸� : ");
                    String name = sc.nextLine();
                    Dos.mkdirDirectory(new File(source), new File(dest), name);
                    break;
                case "vi" :
                    System.out.println("���� �̸� : ");
                    String fileName = sc.nextLine();
                    Dos.saveFile(new File(source), new File(dest), fileName);
                case "q":
                    return;
                default:
                    break;
            }
        }
    }
}
