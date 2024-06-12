package kosa.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
    public static void main(String[] args) {
        // 1. ���� ������ ����
        ServerSocket serverSocket = null;
        Socket socket = null;  // Ŭ���̾�Ʈ ����

        try {
            //2. ���� ������ ����
            serverSocket = new ServerSocket(9000);
            System.out.println("���� ���� ��........");

            //3. Ŭ���̾�Ʈ ������ �޾ƿ�
            socket = serverSocket.accept();

            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            //4. �迭�� �����͸� ����
            byte[] arr = new byte[1024];
            in.read(arr);

            System.out.println("Ŭ���̾�Ʈ���� ���� �޽��� : " + new String(arr));  // ���ڿ��� ���

            String message = "Hello Client!!!";
            out.write(message.getBytes());  // string�� ����Ʈ��

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
                serverSocket.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
