package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateMission {
    public static void main(String[] args) throws ParseException {
        // Ű���� => ��¥ �Է� 2014/06/05
        //�Ի����� �Է� �޾� => ��� ��� ���� ��
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date: ");
        Date inDate = null;

        while (sc.hasNextLine()) {
            try {
                inDate = df.parse(sc.nextLine());  //parse�� ���ܸ� �߻� ��Ŵ
                break;
            }catch (Exception e) {
                System.out.println("�ٽ� �Է� �ϼ���.");
            }
        }

        Calendar cal = Calendar.getInstance();  // �Ի���
        cal.setTime(inDate); // 2014
        Calendar today = Calendar.getInstance();  // ���� ��¥ 2024
        
        // ���ϼ�
        // getTimeInMillis() - �ð��� �ʷ� ����
        long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (24 * 60 * 60 * 1000);
        System.out.println(day);

        int year = (int)(day / 365);
        long month = (day % (365 * year)) / 30;
        System.out.println("���� �Ⱓ: " + year + "��" + month + "���� �ټ�");


    }
}
