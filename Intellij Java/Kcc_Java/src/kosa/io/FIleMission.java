package kosa.io;

import java.io.File;

public class FIleMission {
    public static void main(String[] args) {
        //1.����Ʈ��Ʈ���� �̿��Ͽ� �̹��� ������ ����
//        String source = "C:\\server_program\\workspace\\Intellij Java\\images.jpg";
//        String dest = "C:\\Users\\KOSA\\Desktop\\test\\images.jpg";
//
//        CopyUtil copyUtil = new CopyUtil();
//
//        copyUtil.copyFile(new File(source), new File(dest));

        //2. ���丮 ���縦 ��������.
        String source = "C:\\server_program\\workspace\\Intellij Java";
        String dest = "C:\\Users\\KOSA\\Desktop\\test\\kosta";

        CopyUtil.copyDirectory(new File(source), new File(dest));
    }
}
