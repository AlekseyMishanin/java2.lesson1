package java2.lesson1.DZ;

public class Animal implements Competitor {

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean isDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.isDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist<maxRunDistance){
            System.out.println(type + " " + name + " " + " успех");
        } else {
            System.out.println(type + " " + name + " " + " свалился от инфаркта");
            isDistance=false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist<maxSwimDistance){
            System.out.println(type + " " + name + " " + " успех");
        } else {
            System.out.println(type + " " + name + " " + " утонул");
            isDistance=false;
        }
    }

    @Override
    public void jump(int height) {
        if (height<maxJumpHeight){
            System.out.println(type + " " + name + " " + " успех");
        } else {
            System.out.println(type + " " + name + " " + " не смог перепрыгнуть");
            isDistance=false;
        }
    }

    @Override
    public boolean inOnDistance() {
        return isDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + isDistance);
    }
}

class Cat extends Animal{
    Cat(String name){
        super("Кот", name, 100, 0, 3);
    }
}

class Dog extends Animal{
    Dog(String name){
        super("Пес", name, 100, 15, 2);
    }
}