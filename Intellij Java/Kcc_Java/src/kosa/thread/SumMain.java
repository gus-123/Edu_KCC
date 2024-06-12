package kosa.thread;

public class SumMain {
    public static void main(String[] args) {
        //t1 : 1 ~ 50 ���� ���ϴ� ������
        //t2 : 51 ~ 100 ���� ���ϴ� ������
        //main : t1�� + t2�� => �� : 5050  => ���� : join()
        SumThread thread1 = new SumThread(1, 50);
        SumThread thread2 = new SumThread(51, 100);

        thread1.start();
        thread2.start();

        try {
            // ���
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("�հ� :" + (thread1.getTotal() + thread2.getTotal()));

    }
}
