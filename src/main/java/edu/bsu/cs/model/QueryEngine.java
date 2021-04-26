package edu.bsu.cs.model;


import com.google.inject.Provides;

import javax.inject.Qualifier;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.time.Instant;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public interface QueryEngine{
    @Qualifier
    @Retention(RUNTIME)
    @interface Message {}

    /*@Qualifier
    @interface Count {}
*/

    QueryResponse queryRevisions(String articleTitle) throws IOException;

    @Provides
    @Message
    static WikipediaQueryEngine wikipediaEngine() {
        WikipediaQueryEngine wikipediaQueryEngine = new WikipediaQueryEngine();
        return wikipediaQueryEngine;
    }

}
