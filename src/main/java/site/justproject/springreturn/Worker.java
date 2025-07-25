package site.justproject.springreturn;

import org.springframework.stereotype.Component;
import site.justproject.springreturn.model.Umbrella;

@Component
public class Worker {


    private Umbrella parasol;


    public Worker(Umbrella umbrella2) {
        this.parasol = umbrella2;
    }

    public void work(){
        System.out.println("Working with: " + parasol.getName());
    }


}
