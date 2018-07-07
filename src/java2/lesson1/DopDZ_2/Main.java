package java2.lesson1.DopDZ_2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main (String[] args){
        Cat[] cat = {new Cat("Cat #1"),new Cat("Cat #2"),new Cat("Cat #3"),new Cat("Cat #4"),new Cat("Cat #5") };
        Master master = new Master();
        for (Cat ct: cat) {
            master.sayName(ct);
        }
        master.display();
    }


}

 class Cat{
    private String name;

    Cat(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
}

 class Master{
    private LinkedList<String> nameList;

    Master(){
        nameList = new LinkedList<>();
    }
    public void sayName(Cat cat){
        nameList.addLast(cat.getName());
    }


    public void display(){
        if (nameList.isEmpty()) {
            System.out.println("Список имен пуст.");
        } else {
            ListIterator<String> listIter = nameList.listIterator();
            while (listIter.hasNext()){
                System.out.println(listIter.next());
            }
        }
    }
}
