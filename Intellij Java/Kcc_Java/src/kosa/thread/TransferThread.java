package kosa.thread;

public class TransferThread extends Thread {
    SharedArea sharedArea;
    TransferThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }
    public void run() {
        for (int cnt = 0; cnt < 12; cnt++) {
            // ����ȭ ����
            synchronized (sharedArea) {
                sharedArea.account1.withdraw(1000000);
                System.out.print("�̸��� ���� : 100���� ����, ");
                sharedArea.account2.deposit(1000000);
                System.out.println("������ ���� : 100���� �Ա�");
            }
        }
    }
}
