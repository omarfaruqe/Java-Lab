package main;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E19_3{
    public static void main(String[] args) throws IOException{
        Stream<String> stream = Files.lines(Paths.get("data.txt"));
        List<String> lineContainThe = stream
            .filter(w -> w.contains("the"))
            .collect(Collectors.toList());
        
        for(String w: lineContainThe){
            System.out.println(w);
        }
    }
}
