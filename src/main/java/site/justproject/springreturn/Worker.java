package site.justproject.springreturn;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import site.justproject.springreturn.model.Umbrella;

@Component
public class Worker {


    private Umbrella parasol;


    public Worker(@Qualifier("umbrella") Umbrella parasol) {
        this.parasol = parasol;
    }

    public void work(){
        System.out.println("Working with: " + parasol.getName());
    }


}
