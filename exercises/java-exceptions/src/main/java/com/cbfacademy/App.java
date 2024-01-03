package com.cbfacademy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        FileExtension fileExtension = new FileExtension();

        List<String> filenames = Arrays.asList("App.java", "App.txt", null, "App.md");

        try {
            Map<String, Integer> result = fileExtension.map(filenames);

        

        for (Map.Entry<String, Integer> entry : result.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        } catch (NullPointerException e) {

            e.printStackTrace();
        }
    }
}

