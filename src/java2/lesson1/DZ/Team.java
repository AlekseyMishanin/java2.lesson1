package java2.lesson1.DZ;

import java.util.LinkedList;
import java.util.ListIterator;

public class Team {

    LinkedList<Competitor> competitors;
    String name;

    Team(String name, Competitor...team) {
        this.name = name;
        competitors = new LinkedList<>();
        for (Competitor t: team
             ) {
            competitors.add(t);
        }
    }

    public void ShowResult() {
        System.out.println("Результаты команды " + name + ":");
        ListIterator<Competitor> listIter = competitors.listIterator();
        while (listIter.hasNext()){
            listIter.next().info();
        }
    }
}
