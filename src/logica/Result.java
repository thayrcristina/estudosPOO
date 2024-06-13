import java.io.*;
import java.net.*;
import java.util.*;
import static java.util.stream.Collectors.joining;
import org.json.simple.*;
import org.json.simple.parser.*;


class Result {

    /*
     * Complete the 'findCountry' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING region
     *  2. STRING keyword
     * API URL: https://jsonmock.hackerrank.com/api/countries/search?region={region}&name={keyword}&page={page_no}
     */

    public static List<String> findCountry(String region, String keyword) {

        List<String> countries = new ArrayList<>();
        int pageNo = 1;
        int totalPages = 1;

        try {
            while (pageNo <= totalPages) {
                // Construindo a URL
                String urlString = String.format("https://jsonmock.hackerrank.com/api/countries/search?region=%s&name=%s&page=%d",
                        region, keyword);
                URL url = new URL(urlString);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                // Lendo a resposta
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                // Fechando as streams
                in.close();
                conn.disconnect();

                // Parseando o JSON
                JSONParser parser = new JSONParser();
                JSONObject json = (JSONObject) parser.parse(content.toString());
                totalPages = Integer.parseInt(json.get("total_pages").toString());

                JSONArray data = (JSONArray) json.get("data");
                for (int i = 0; i < data.size(); i++) {
                    JSONObject country = (JSONObject) data.get(i);
                    String name = (String) country.get("name");
                    String regionName = (String) country.get("region");
                    long population = (Long) country.get("population");

                    if (regionName.equalsIgnoreCase(region)) {
                        countries.add(name + ", " + population);
                    }
                }

                pageNo++;
            }

            Collections.sort(countries, new Comparator<String>() {
                @Override
                public int compare(String c1, String c2) {
                    String[] split1 = c1.split(", ");
                    String[] split2 = c2.split(", ");
                    long population1 = Long.parseLong(split1[1]);
                    long population2 = Long.parseLong(split2[1]);
                    if (population1 == population2) {
                        return split1[0].compareTo(split2[0]);
                    } else {
                        return Long.compare(population1, population2);
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

        return countries;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String region = bufferedReader.readLine();

        String keyword = bufferedReader.readLine();

        List<String> result = Result.findCountry(region, keyword);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
