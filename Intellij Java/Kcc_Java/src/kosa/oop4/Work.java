package kosa.oop4;

public class Work extends Man implements Speakable{

    public Work() {

    }

    public Work(String name) {
        super(name);
    }

    public String speak() {
        System.out.println(getName() + " 열심히 일해야 한다.");

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
