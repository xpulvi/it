package it.streams_01;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsA {
    public static void main(String[] args) {

       String fileName = "C:\\develop\\java\\bekend\\it\\streams_01\\src\\file.txt";

       File textFile = new File(fileName);

       try (
               BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile));
               ){
                    StringBuilder fileContents = new StringBuilder();
           Stream<String> fileContentsStream = bufferedReader.lines();
           fileContentsStream.forEach(l -> fileContents.append(l).append(System.lineSeparator()));
           System.out.println(fileContents.toString());

       }catch (Exception e){
           e.printStackTrace();
       }

    }
}
