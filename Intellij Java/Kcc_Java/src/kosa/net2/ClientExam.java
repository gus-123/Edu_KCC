package kosa.net2;

import javax.sound.midi.Receiver;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientExam {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            socket = new Socket("127.0.0.1", 9000);

            Thread receive = new ClientReceive(socket);
            Thread sender = new ClientSender(socket);

            receive.start();
            sender.start();

        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
