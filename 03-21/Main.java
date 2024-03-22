import java.util.Iterator;

import tads.list.LinkedList;
import tads.list.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Con for each");
        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("\n\nCon while");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
    }
}
