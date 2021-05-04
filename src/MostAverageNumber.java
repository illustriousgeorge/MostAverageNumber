import java.util.ArrayList;
import java.util.Scanner;

public class MostAverageNumber {
    static int findMostAverageNumber(Scanner sc) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int avg = 0;
        while (sc.hasNext()){
            int tempo = sc.nextInt();
            arrayList.add(tempo);
            avg += tempo;
        }
        avg /= arrayList.size();
        int close = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            if (Math.abs(arrayList.get(i)-avg) <= Math.abs(close - avg)){
                close = arrayList.get(i);
            }
        }
        return close;
    }
}