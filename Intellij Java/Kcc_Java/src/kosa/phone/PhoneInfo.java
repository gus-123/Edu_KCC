package kosa.phone;
//5.29
public class PhoneInfo implements Comparable{ // implements Comparable<PhoneInfo>
	// Ŭ���� ����� (��ȭ��ȣ �ϳ��� ���� ������)
	// (name, phoneNo, birth) : �ʵ�
	// 1. �ʵ� ���� / 2. �ʱ�ȭ �ؾ��� �ʵ带 ����
	private String name;
	private String phonNo;
	private String birth;

	// 3. ������ ����
	public PhoneInfo() {

	}
	
	public PhoneInfo(String name, String phonNo, String birth) {
		super();
		this.name = name;
		this.phonNo = phonNo;
		this.birth = birth;
	}
	
	// 4. �޼��� ����
	public void show() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phonNo);
		System.out.println("�������: " + birth);
	}

//	@Override
//	public int compareTo(Manager o) {
//		if ((int)birth.compareTo(o.birth) < 0  ) {
//			return -1;
//		} else if (birth.compareTo(o.birth) > 0) {
//			return 1;
//		}
//		return 0;
//	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		PhoneInfo p = (PhoneInfo) o;
		return this.name.compareTo(p.getName());
	}

	// get / set ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonNo() {
		return phonNo;
	}

	public void setPhonNo(String phonNo) {
		this.phonNo = phonNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}	

}
