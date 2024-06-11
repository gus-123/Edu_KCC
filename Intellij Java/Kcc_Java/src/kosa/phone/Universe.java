package kosa.phone;

public class Universe extends PhoneInfo {
    private String major;  // ����
    private String year;  // �й�
    private Universe arr[];
    private int count;

    public Universe() {
        arr = new Universe[10];
    }

    public Universe(String name, String phonNo, String birth, String major, String year) {
        super(name, phonNo, birth);
        this.major = major;
        this.year = year;
    }

    /* ����� �Ѱ��� �ִ� �� ���� */
    public void addUniverse() {
        System.out.print("�̸�: ");
        String name = DataInput.sc.nextLine();
        System.out.print("��ȭ��ȣ: ");
        String phoneNo = DataInput.sc.nextLine();
        System.out.print("�������: ");
        String birth = DataInput.sc.nextLine();
        System.out.print("�μ�: ");
        String major = DataInput.sc.nextLine();
        System.out.print("��ġ: ");
        String year = DataInput.sc.nextLine();

        arr[count++] = new Universe(name, phoneNo, birth, major, year);
    }

    public void listPhoneInfo() {
        for (int i = 0; i < count; i++) {
            arr[i].show();
        }
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
}
