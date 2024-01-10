package it.streams_02;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.Scanner;

public class StreamsB {

   static ZonedDateTime writTime = ZonedDateTime.now();

    public static void main(String[] args) {

        String fileName = "C:\\develop\\java\\bekend\\it\\streams_02\\src\\file.txt";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        writTime.format(formatter);

        Path filePath = Paths.get(fileName);

        if (!Files.exists(filePath)){
            IWriterAndReeader wr = new Write();
            wr.write(writTime.format(formatter),fileName);
            System.out.println("nuovo file creato " + filePath);
        }

        if (Files.exists(filePath)){
            System.out.println("Il file esiste già. Vuoi sovrascriverlo? (S/N)");
            Scanner scanner = new Scanner(System.in);
            String risposta = scanner.nextLine().toUpperCase(); // .toUpperCase();
            scanner.close();
            if(risposta.equals("S")){
                IWriterAndReeader wr = new Write();
                wr.write(writTime.format(formatter),fileName);
                System.out.println("file sovrascrito");
            }else if(risposta.equals("N")){
                System.out.println("Operazione annullata. Il file non è stato sovrascritto.");
            }
        }

    }

}

