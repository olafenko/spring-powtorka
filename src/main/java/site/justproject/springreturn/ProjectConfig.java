package site.justproject.springreturn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.justproject.springreturn.model.Book;
import site.justproject.springreturn.model.Umbrella;

@Configuration
public class ProjectConfig {

    @Bean
    Book book(){
        Book book = new Book();
        System.out.println("Created bean book : " + book);
        return book;
    }

    @Bean
    Umbrella umbrella(){
        return new Umbrella("Spoko parasolka");
    }

    @Bean
    Umbrella umbrella2(){
        return new Umbrella("Niezła parasolka");
    }

    @Bean
    Worker worker(){
        return new Worker(umbrella());
    }

}
