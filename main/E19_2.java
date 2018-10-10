package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.io.File;

public class E19_2{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("data.txt"));
        List<String> words = new ArrayList<>();
        while(in.hasNext()){
            words.add(in.next());
        }
        Stream<String> stream = words.stream();
        long count = stream
            .filter(w -> w.contains("the"))
            .count();
        System.out.println(count);
    }
}
