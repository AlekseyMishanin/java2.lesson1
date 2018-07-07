package java2.DZ;

public class Human implements Competitor{

    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean activ;

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 90;
        this.maxSwimDistance = 10;
        this.maxJumpHeight = 2;
        this.activ = true;
    }

    @Override
    public void run(int dist) {
        if (dist<maxRunDistance){
            System.out.println(name + " " + " успех");
        } else {
            System.out.println(name + " " + " провал");
            activ=false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist<maxSwimDistance){
            System.out.println(name + " " + " успех");
        } else {
            System.out.println(name + " " + " провал");
            activ=false;
        }
    }

    @Override
    public void jump(int height) {
        if (height<maxJumpHeight){
            System.out.println(name + " " + " успех");
        } else {
            System.out.println(name + " " + " провал");
            activ=false;
        }
    }

    @Override
    public boolean inOnDistance() {
        return activ;
    }

    @Override
    public void info() {
        System.out.println(name + " " + activ);
    }

}
