package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


    
    /*Create a class called `FileExtension` with the following methods:

        - `boolean check(String filename)`
        - `Map<String, int> map(List<String> filenames)` */


    public class FileExtension {

        public boolean check(String filename) throws FilenameException {
            
            //return `false` when the file extension is not `.java`
            if (filename == null || filename.isEmpty()) {

                /* throw a custom checked exception called `FilenameException`
                when the file name is `null` or an empty string.*/
                throw new FilenameException("Filename cannot be null or an empty string");
            }
                
                //return `true` when the file extension is `.java`
                 return filename.endsWith(".java");
    }




    public Map<String, Integer> map(List<String> filenames) {

        Map<String, Integer> resultMap = new HashMap<>();

        //check each provided file's extension
        for (String filename : filenames) {

            //map the returned value as 1 if true or 0 if false
            try {
                boolean isValid = check(filename);
                resultMap.put(filename, isValid ? 1 : 0);
            } 
             //map `-1` when an exception occurs
            catch (FilenameException e)
                {
                    resultMap.put(filename, -1);
            }
        }

        return resultMap;
    }
    
}
