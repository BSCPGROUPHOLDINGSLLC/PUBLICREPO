// @bd2561
import java.util.*;

public class HomeworkWritten1_1 {
    private static ArrayList<Integer> L = new ArrayList<Integer>();
    private static ArrayList<Integer> P = new ArrayList<Integer>();

    private static void printLots(List L, List P) {

        // + prints the elements in L using P values as Index.
        System.out.println("Size of ListP \t=" + P.size());
        System.out.println("Items from ListL using conditional IF and FOR...");
        if (P.size() > 0) {
            for (int i = 0; i < P.size(); i++) {
                int _idx = (int) P.get(i);
                System.out.println(L.get(_idx));
            }
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        // Both L and P can be empty... _n will be in range(0,9)
        int _n = rand.nextInt(9);

        // + You may assume that the any integer in P is greater than or equal to 0
        // + Any integer in P is greater than or equal to 0 and less than L.size().
        for (int i = 1; i < (_n - 1); i++) {
            P.add(i);
        }
        for (int i = 1; i < _n; i++) {
            L.add(rand.nextInt((19 - 2) + 1) + 5);
        }
        L.sort(Comparator.comparing(Integer::valueOf));
        printLots(L, P);
    }
}



