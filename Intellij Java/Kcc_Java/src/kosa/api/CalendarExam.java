package kosa.api;

import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExam {

    public static void main(String[] args) {
        //GregorianCalendar gc = new GregorianCalendar();
        Calendar gc = Calendar.getInstance();  // Ķ���� ��ü

        //System.out.println(gc);

        String now = gc.get(Calendar.YEAR) + "��" + (gc.get(Calendar.MONTH) + 1) + "��"
                + gc.get(Calendar.DATE) + "��" + gc.get(Calendar.HOUR) + "��"
                + gc.get(Calendar.MINUTE) + "��";

        System.out.println(now);

        gc.add(Calendar.DATE, 100);

        String future = gc.get(Calendar.YEAR) + "��" + (gc.get(Calendar.MONTH) + 1) + "��"
                + gc.get(Calendar.DATE) + "��" + gc.get(Calendar.HOUR) + "��"
                + gc.get(Calendar.MINUTE) + "��";

        System.out.println("100�� �� : " + future);

        gc.set(2022,5, 4);
        gc.add(Calendar.DATE, 1000);

        // ���� ������ �������� ��������
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String str = sdf.format(gc.getTime());

        System.out.println(str);

        //���� : 2024 ~ 2030����� �ڽ��� ������ ���� ����?
        //Calendar.DAY_OF_WEEK => ���� <��(1) ��(2) ȭ(3) ��(4) ��(5) ��(6) ��(7)>
        /* ���� �Ѱ�
        gc.set(2024,1,23);
        while (true) {
            do {
                int a = gc.get(Calendar.DAY_OF_WEEK);

                if (a == 1) {
                    System.out.println("������");
                } else if (a == 2) {
                    System.out.println("ȭ����");
                } else if (a == 3) {
                    System.out.println("������");
                } else if (a == 4) {
                    System.out.println("�����");
                } else if (a == 5) {
                    System.out.println("�ݿ���");
                } else if (a == 6) {
                    System.out.println("�����");
                } else {
                    System.out.println("�Ͽ���");
                }

                // ���� ���� Ȯ�� �� �����̸� 1�� �߰�
                if ((gc.get(Calendar.YEAR) % 4 == 0  && (gc.get(Calendar.YEAR) % 100 == 0))) {
                    gc.add(Calendar.DATE, 1);
                }

                gc.add(Calendar.DATE, 365);
            } while (gc.get(Calendar.YEAR) == 2030);
        }*/

        char week[] = {'��', '��', 'ȭ', '��', '��','��'};

        for (int i = 2024; i < 2030; i++) {
            gc.set(i,5,4); // 6�� 4��
            char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
            System.out.println(i + "���� ������ " + c + "���� �Դϴ�.");
        }

    }
}
