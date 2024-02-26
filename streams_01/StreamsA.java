package it.streams_01;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsA {
    public static void main(String[] args) {

       String fileName = "C:\\develop\\java\\bekend\\it\\streams_01\\src\\file.txt";

       if(System.getProperty("os.name") == "Windows 11"){

       }else {

       }
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


        System.out.println( System.getProperty("os.name")); //segnia winzoz
        System.out.println( System.getProperty("os.version")); //non capisco perche mi segni win 10
/*
        System.out.println("------------");
        System.out.println( System.getProperty("os.name")); //segnia winzoz
        System.out.println( System.getProperty("os.version")); //non capisco perche mi segni win 10
        System.out.println(System.getProperty("os.arch"));
        System.out.println();
        System.out.println( System.getProperty("path.separator"));
        System.out.println( System.getProperty("user.dir"));
        System.out.println( System.getProperty("user.home"));
        System.out.println( System.getProperty("user.name"));
        System.out.println( System.getProperty("java.home"));
        System.out.println( System.getProperty("java.class.path"));
        System.out.println();
        System.out.println( System.getProperty("file.separator"));
        System.out.println( System.getProperty("java.vendor"));
        System.out.println( System.getProperty("java.vendor.url"));
        System.out.println( System.getProperty("java.version"));
      */

    }
}
