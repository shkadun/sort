
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

        int[] time = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };


        TreeMap<Integer, String> hash= new TreeMap<Integer, String>();

        for(int i= 0; i < time.length; i++){
            hash.put(time[i], names[i]);
        }

        Set set = hash.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            HashMap.Entry mentry = (HashMap.Entry)iterator.next();
            System.out.print(mentry.getValue()  + " - time: ");
            System.out.println(mentry.getKey());
        }
    }
}
