package site.justproject.springreturn;

import org.springframework.stereotype.Component;
import site.justproject.springreturn.model.Umbrella;

import java.util.List;

@Component
public class Worker {


    List<Umbrella> umbrellas;


//    public Worker(Umbrella umbrella2) {
//        this.parasol = umbrella2;
//    }


    public Worker(List<Umbrella> umbrellas) {
        this.umbrellas = umbrellas;
    }

    public void work(){

        umbrellas.forEach(
                umbrella -> System.out.println(umbrella.getName())
        );
    }


}
