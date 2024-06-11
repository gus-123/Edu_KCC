package kosa.io;

import java.io.*;

public class BufferExam {
    public static void main(String[] args) {
        //Scanner => Ű����� ������ �Է�
        //System.in => InputStream(byte) => InputStreamReader(byte -> ���� ����) => BufferedReader(Ű���� ���� �о�帲)

//        InputStream in = System.in;
//        InputStreamReader isr = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(isr);
        
        
        // ���� Buffer -> ���� ���(�б�, ����) -> System.in
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            bw = new BufferedWriter(new FileWriter("output.txt"));
            
            System.out.println("�Է� :");
            String str= "";
            
            while ((str = br.readLine()) != null) {
                str += "\n";
                bw.write(str);
            }
            
            System.out.println("���� �Ϸ�");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.close();
                br.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
