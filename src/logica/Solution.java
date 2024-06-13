import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'commonSubstring' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */


    public static void commonSubstring(final List<String> a, final List<String> b) {

        for (int i = 0; i < a.size(); i++) {
            String a1 = a.get(i);
            String b1 = b.get(i);

            if (hasCommonSubstring(a1, b1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    private static boolean hasCommonSubstring(String a, String b) {
        Set<Character> setA = a.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        for (char c : b.toCharArray()) {
            if (setA.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("hello");
        a.add("hi");

        List<String> b = new ArrayList<>();
        b.add("world");
        b.add("bye");

        commonSubstring(a, b);
    }

}

public class Solution {
    public static void main(final String[] args) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        final List<String> a = IntStream.range(0, aCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (final IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        final int bCount = Integer.parseInt(bufferedReader.readLine().trim());

        final List<String> b = IntStream.range(0, bCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (final IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        Result.commonSubstring(a, b);

        bufferedReader.close();
    }
}
