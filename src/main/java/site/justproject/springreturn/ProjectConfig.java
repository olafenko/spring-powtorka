package site.justproject.springreturn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import site.justproject.springreturn.model.Book;
import site.justproject.springreturn.model.Umbrella;

@Configuration
public class ProjectConfig {

    @Bean
    Book book(){
        return new Book();
    }

    @Bean
    Umbrella umbrella(){
        return new Umbrella();
    }




}
