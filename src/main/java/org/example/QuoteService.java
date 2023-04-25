package org.example;

import org.example.model.Quote;

import java.util.ArrayList;
import java.util.List;

public class QuoteService {
    private List<Quote> quotes;

    public QuoteService(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<String> getAllQuotes() {
        List<String> result = new ArrayList<>();
        for (Quote quote : quotes) {
            result.add(quote.getQuote());
        }
        return result;
    }
}
