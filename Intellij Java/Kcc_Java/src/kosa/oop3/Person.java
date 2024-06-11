package kosa.oop3;

public class Person {
    // �ʵ�
    private String name;
    private Role role;

    // ������
    public Person() {}

    public Person(String name,Role role) {
        this.name = name;
        this.role = role;
    }

//    public Person(Role role) {
//        this.role = role;
//    }

    // �޼���
    public void doIt () {
        System.out.println("�̸� : " + name);
        role.doing();
    }

    // getter / setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}