package edu.bsu.cs.model;


import com.google.inject.Provides;

import javax.inject.Qualifier;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.time.Instant;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

public interface QueryEngine{
      QueryResponse queryRevisions(String articleTitle) throws IOException;


}
