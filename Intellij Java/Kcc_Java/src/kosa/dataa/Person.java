package kosa.dataa;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person () {}

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

//    @Override
//    public int compareTo(Object o) {
//        //���̸� �������� �������� ����
//        Person p = (Person)o;
//        if (this.age < p.age)
//            return -1;
//        else if (this.age > p.age) {
//            return 1;
//        }
//
//        return 0 ;
//    }

    @Override
    public int compareTo(Person o) {
        //���̸� �������� �������� ����
        //Person p = (Person)o;
        if (this.age < o.age)
            return -1;
        else if (this.age > o.age) {
            return 1;
        }

        return 0 ;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
