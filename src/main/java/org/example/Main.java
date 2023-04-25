package org.example;

import org.example.model.Quote;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Quote> quotes = readFile("src/main/java/org/example/quotes.txt");
        QuoteService service = new QuoteService(quotes);
        System.out.println(service.getAllQuotes());
    }

    private static List<Quote> readFile(String filePath) throws FileNotFoundException {
        List<Quote> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<String> lines = reader.lines().toList();
        int id = 0;
        for(String line: lines) {
            String[] lineElements = line.split("~");
            String author = lineElements[0];
            String quote = lineElements[1];
            Quote element = new Quote(id, author, quote, false);
            id = id + 1;
            result.add(element);
        }
        return result;
    }
}