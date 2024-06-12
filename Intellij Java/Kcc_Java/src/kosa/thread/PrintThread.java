package kosa.thread;

public class PrintThread extends Thread {
    SharedArea sharedArea;

    public PrintThread() {}

    public PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for (int cnt = 0; cnt < 3; cnt++) {
            // ����ȭ ���
            synchronized (sharedArea) {
                int sum = sharedArea.account1.balance +
                        sharedArea.account2.balance;
                System.out.println("���� �ܾ� �հ� :" + sum);
            }
            try {
                Thread.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
