package main;

import java.io.IOException;
import java.nio.file.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
import java.util.stream.Stream;
//import java.io.File;

public class E19_1{
    public static void main(String[] args) throws IOException{
        Stream<String> stream = Files.lines(Paths.get("D:\\java programming\\javaLab/data.txt"));
        long count = stream
            .filter(w -> w.contains("the"))
            .count();
        System.out.println(count);
    }
}
