package ollections;

import java.util.ArrayList;
import java.util.Scanner;

import objects.Human;
import objects.Mp3;

public class TestCollections {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        list1.add("test");
        list1.add(1);
        list1.add(new Object());
        list1.add(22222.2222);
        System.out.println("Печать списка обьектов");
        printMethod(list1);


        ArrayList<Human> list2 = new ArrayList<Human>();
        list2.add(new Human("Sniff", 32));
        list2.add(new Human("Egro", 34));
        System.out.println("Печать значений нейм объектов хьюман");
        printMethod(list2);

        ArrayList<Mp3> list = new ArrayList<>();
        list.add(new Mp3("name1", "erere"));
        list.add(new Mp3("name2", "erere"));
        list.add(new Mp3("name3", "erere"));
        list.add(new Mp3("name4", "erere"));
        list.add(new Mp3("name5", "erere"));
        System.out.println("Выберите песню");
        print(list);


    }

    private static void print(ArrayList list) {
        Scanner scan = new Scanner(System.in);
        String nameSearh = scan.nextLine();
        for (Object nameSong : list) {
            {
                Mp3 h = (Mp3) nameSong;
                if (h.getName().contains(nameSearh)) {
                    System.out.println(h.getName());
                }
            }
        }

    }

    private static void printMethod(ArrayList list) {
        for (Object obj : list) {
            if (obj instanceof Human) {
                Human h = (Human) obj;
                System.out.println(h.getName() + " " + h.getAge() );
            } else {
                System.out.println(obj);
            }
        }
    }
}
