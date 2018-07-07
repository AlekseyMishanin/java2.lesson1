package java2.lesson1.DZ;

public class Main {

    public static void main(String[] args) {

        Course course = new Course(new Well(1), new Water(10), new Cross(99));
        Team team = new Team("Зоопарк", new Human("Володя"), new Cat("Пухлый"), new Dog("Черныйш"), new Dog("Мопс"));
        course.doIt(team);
        team.ShowResult();
    }
}
