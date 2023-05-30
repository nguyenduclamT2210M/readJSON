package readJSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class JSONManagement {

    public JSONManagement() {

    }

//    public void readDemo() throws Exception {
//try{
//    String apiUrl = "https://jsonplaceholder.typicode.com/posts";
//    URL url = new URL(apiUrl);
//    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//    conn.setRequestMethod("GET");
//    BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//    StringBuilder response = new StringBuilder();
//
//    String line;
//    while((line = reader.readLine())!= null){
//        response.append(line);
//    }
//    reader.close();
//    System.out.println(response);
//    JSONArray jsonArray = new JSONArray(response.toString());
//
//    for (int i = 0; i < jsonArray.length(); ++ i) {
//
//
//        JSONObject product = (JSONObject).jsonArray.get(i);
//        int userId = Integer.parseInt(product.get("userId").toString());
//        int id = Integer.parseInt(product.get("id").toString());
//        String title = product.get("title").toString();
//        String body = product.get("body").toString();
//        System.out.println(userId+" "+id+" "+title+" "+body);
//
//    }
//    conn.disconnect();
//    }catch (Exception e){
//    e.printStackTrace();
//    System.out.println(e.getMessage());
//}
//    }
public void readDemo() throws Exception {
    try {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts";
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();

        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();
        System.out.println(response);
        // Use the JSONParser to parse the response string
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(response.toString());

        for (int i = 0; i < jsonArray.size(); ++i) {

            JSONObject product = (JSONObject) jsonArray.get(i);
            int userId = Integer.parseInt(product.get("userId").toString());
            int id = Integer.parseInt(product.get("id").toString());
            String title = product.get("title").toString();
            String body = product.get("body").toString();
            System.out.println(userId + " " + id + " " + title + " " + body);

        }
        conn.disconnect();
    } catch (Exception e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
    }
}
}
