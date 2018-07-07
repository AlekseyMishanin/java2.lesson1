package java2.DZ;

abstract public class Obstacle {
    abstract public void doIt(Competitor competitor);
}

class Well extends Obstacle{

    int height;

    Well(int height){
        this.height=height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}

class Water extends Obstacle{

    int length;

    Water(int length){
        this.length=length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}

class Cross extends Obstacle{

    int length;

    Cross(int length){
        this.length=length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}