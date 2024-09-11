import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import java.math.BigInteger;

public class Descend {

    public static void main(String [] args) {
        System.out.printf("Hello Descend Solution%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java Descend%n");
            return;
        }

        Descend reverse = new Descend();

        reverse.solution();

    }

    public void solution() {
        int [] samplearray = new int [] {10,15,22,9,2,100,4};
        for (int i = samplearray.length - 1; i >= 0; i--) {
            System.out.printf("%d%n", samplearray[i]);
        }
    }

}
