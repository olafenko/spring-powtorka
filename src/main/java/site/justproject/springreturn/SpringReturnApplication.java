package site.justproject.springreturn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringReturnApplication {

    @Autowired
    private Worker worker;

    public static void main(String[] args) {
        SpringApplication.run(SpringReturnApplication.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void start(){

            worker.work();
    }

}
