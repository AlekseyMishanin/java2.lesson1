package java2.lesson1.DZ;

public class Course {

    Obstacle[] course;

    Course(Well well, Water water, Cross cross){
        course = new Obstacle[3];
        course[0] = well;
        course[1] = water;
        course[2] = cross;
    }

    public void doIt(Team team) {
        for (Competitor c:team.competitors
             ) {
            for (Obstacle o: course
                 ) {
                o.doIt(c);
                if (!c.inOnDistance()){
                    break;
                }
            }
        }
    }
}
