package kosa.net1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

    public static void main(String[] args) {
        // 1. Ŭ���̾�Ʈ Socket ����
        Socket socket = null;

        try {
            //2. Ŭ���̾�Ʈ Socket ����
            socket = new Socket("127.0.0.1", 9000);

            //3. Ŭ���̾�Ʈ �޽��� ����
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();

            String message = "Hi Server!!!!";
            out.write(message.getBytes());

            byte[] arr = new byte[1024];
            in.read(arr);

            System.out.println("������ ���� �޽��� : " + new String(arr));
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
