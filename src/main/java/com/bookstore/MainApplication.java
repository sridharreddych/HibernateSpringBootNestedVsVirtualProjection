package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    @Autowired
    private BookstoreService bookstoreService;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
            System.out.println("\n\nFetch books with authors via query builder mechanism");
            System.out.println("-----------------------------------------------------------------");
            bookstoreService.fetchBooksWithAuthorsQueryBuilderMechanism();

            System.out.println("\n\nFetch books with authors via JPQL query");
            System.out.println("-----------------------------------------------------------------");
            bookstoreService.fetchBooksWithAuthorsViaQuery();

            System.out.println("\n\nFetch books with authors via query and simple DTO");
            System.out.println("-----------------------------------------------------------------");
            bookstoreService.fetchBooksWithAuthorsViaQuerySimpleDto();
            
            System.out.println("\n\nFetch books with authors via array of objects");
            System.out.println("-----------------------------------------------------------------");
            bookstoreService.fetchBooksWithAuthorsViaArrayOfObjects();

            System.out.println("\n\nFetch books with authors via query and virtual DTO");
            System.out.println("-----------------------------------------------------------------");
            bookstoreService.fetchBooksWithAuthorsViaQueryVirtualDto();                        
        };
    }
}
/*
 * 
 * How To Efficiently Fetch Spring Projection Including @ManyToOne Or @OneToOne Associations

Description: This application fetches a Spring projection including the @ManyToOne association via different approaches. It can be easily adapted for @OneToOne association as well.

Key points:

fetching raw data is the fastest approach

 * 
 */
