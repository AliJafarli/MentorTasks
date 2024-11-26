import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>(List.of(
                new Human("Jdjkcn", 34),
                new Human("Jdjkcn", 32),
                new Human("Uncwnjec", 86))
        );
//        Collections.sort(list);
        list.sort(Comparator.comparing((Human h) -> h.name).thenComparing((Human h) -> h.age));
        Iterator<Human> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}