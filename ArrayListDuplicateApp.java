// https://www.facebook.com/smkmallik/posts/3415890411793806
// Subscribed by Code House
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set

class ArrayListDuplicateApp {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<Integer>();

        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(7);
        primes.add(11);

        System.out.println("List of Prime Numbers: " + primes);

        Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);
        
        primes.clear();

        primes.addAll(primesWithoutDuplicates);

        System.out.println("List of primes without duplicates: " + primes);
    }
}
