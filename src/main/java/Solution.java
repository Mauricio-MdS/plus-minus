import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double total = 0;
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;

        for (int number : arr) {
            total++;
            if (number == 0) zeroes++;
            else if(number > 0) positives++;
            else negatives++;
        }
        System.out.printf("%.6f%n",positives/total);
        System.out.printf("%.6f%n",negatives/total);
        System.out.printf("%.6f%n",zeroes/total);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
