package org.example.model;

public class Quote {
    //accesor \
    private final int id;
    private final String author;
    private String quote;
    private boolean favourite;
    // contrusctor
    public Quote (int id, String author, String quote, boolean favourite){
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = favourite;
    }

    @Override
    public String toString() {
        return """
        Quote {
        id: %d
        author: %s
        quote: %s
        favourite: %s
        }
        """.formatted(id, author, quote, favourite);
    }

    public String getQuote(){
        return quote;
    }
}
