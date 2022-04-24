package com.core.json.http;

import com.core.json.model.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * @author ManhKM on 4/23/2022
 * @project convert-json-to-object
 */
public class HttpEndPoint {
    private static HttpURLConnection connection;

    public static void main(String[] args) {
        BufferedReader reader;
        String line;
        StringBuffer responseContent = new StringBuffer();

        try {
            URL url = new URL("http://localhost:8080/api/person");
            connection = (HttpURLConnection) url.openConnection();

            // Request setup:
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if(status > 299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while((line = reader.readLine()) != null){
                    responseContent.append(line);
                }
                reader.close();
            }
            System.out.println(responseContent.toString());

            parseJsonToObject(responseContent.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }

    private static void parseJsonToObject(String dataJson) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Person> personList = Arrays.asList(mapper.readValue(dataJson, Person[].class));
            for (Person person : personList){
                System.out.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseJsonObject2(String dataJson){

    }
}
