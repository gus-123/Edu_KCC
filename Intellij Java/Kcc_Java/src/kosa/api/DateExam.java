package kosa.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

    public static void main(String[] args) {
//        Date now = new Date();
//        String str = now.toString();
//        System.out.println(str);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        String str2 = sdf.format(now);
//        System.out.println(str2);

        // 키보드 => 날짜 입력 2024/06/04
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = df.parse("2024/06/04");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(date);


    }
}
