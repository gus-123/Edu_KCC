package kosa.oop4;

public class Reader extends Man implements Speakable {

    public Reader() {

    }

    public Reader(String name) {
        super(name);
    }

    public String speak() {
        System.out.println(getName() + " �ڹ�ȭ����");

        return getName();
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public void setName(String name) {
        super.setName(name);
    }
}
