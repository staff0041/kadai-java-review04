package animal;

public class Human extends Animal implements Thinkable {
    private String hobby;

    public Human() {}

    public Human(String name, int age) {
        super(name, age);
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
