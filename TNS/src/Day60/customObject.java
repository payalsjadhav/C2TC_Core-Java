package Day60;

import java.util.Collections;
import java.util.List;

class customObject implements Comparable<customObject> {
    String name;

    customObject(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(customObject simpson) {
        return this.name.compareTo(simpson.name);
    }
}

public class customObjectSorting {

     public static void main(String... sortingWithList) {
        List<customObjectCharacter> simpsons = new ArrayList<>();
        simpsons.add(new customObjectCharacter("Homer "));
        simpsons.add(new customObjectCharacter("Marge "));
        simpsons.add(new customObjectCharacter("Bart "));
        simpsons.add(new customObjectCharacter("Lisa "));
        
        List<>
		Collections.sort(customObject);
        customObject.stream().map(s -> s.name).forEach(System.out::print);

        Collections.reverse(simpsons);
        simpsons.stream().forEach(System.out::print);
    }
}
