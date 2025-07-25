package site.justproject.springreturn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import site.justproject.springreturn.model.Umbrella;

@Component
public class Worker {

    @Autowired
    private Umbrella umbrella2;


    public Worker(Umbrella umbrella2) {
        this.umbrella2 = umbrella2;
    }

    public void work(){
        System.out.println("Working with: " + umbrella2.getName());
    }


}
