package kosa.oop4;

public class Main {

    public static void main(String[] args) {
        Object obj[] = {new Reader("�Ѹ�"), new Work("�浿"),
                new Student("������")};

        for (int i = 0; i < obj.length; i++) {
            if (!(obj[i] instanceof Student)) {
                ((Speakable)obj[i]).speak();
            }
//            if (obj[i] instanceof Speakable) {
//                Speakable speakable = (Speakable)obj[i];   //Speakable implement�� �����ϱ� ������ Speakable�� ����ȯ ���� (interface �̸����� ������ Ÿ��)
//                System.out.println(speakable.speak());
//            }
        }


    }
}
