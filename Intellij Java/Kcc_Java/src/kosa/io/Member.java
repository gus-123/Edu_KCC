package kosa.io;

import java.io.Serializable;

public class Member implements Serializable  {  // 직렬화 하는 객체를 판단
    private String name;
    private int age;
    private Video video;

    public Member() {}

    public Member(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Member(String name, int age, Video video) {
        super();
        this.name = name;
        this.age = age;
        this.video = video;
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

    public Video getVideo() {
        return video;
    }
    public void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
    }
}
