package kosa.net3;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;//접속한 클라이언트 소켓
		
		try {
			serverSocket = new ServerSocket(9000);
			System.out.println("서버 실행 중......");
			
			while(true) {  // 여러 명 접속을 위해
				socket = serverSocket.accept();//요청 대기 중
				Thread thread = new PerClientThread(socket);
				thread.start();
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//socket.close();
				//serverSocket.close();
			} catch (Exception e2) {}
		}
	}
}











