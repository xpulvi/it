package it.streams_02;

import java.time.ZonedDateTime;
import java.util.Optional;

public interface IWriterAndReeader {

    void write(String s, String filePath);
    void read(String filePath);
}
