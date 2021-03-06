package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    public final Logger log = LoggerFactory.getLogger(AppRunner.class);
    public final BookRepository bookRepository;

    public AppRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("... Fetching books");
        log.info("isbn-1234 --> {}", bookRepository.getByIsbn("isbn-1234"));
        log.info("isbn-4567 --> {}", bookRepository.getByIsbn("isbn-4567"));
        log.info("isbn-1234 --> {}", bookRepository.getByIsbn("isbn-1234"));
        log.info("isbn-4567 --> {}", bookRepository.getByIsbn("isbn-4567"));
        log.info("isbn-1234 --> {}", bookRepository.getByIsbn("isbn-1234"));
        log.info("isbn-1234 --> {}", bookRepository.getByIsbn("isbn-1234"));
    }
}
