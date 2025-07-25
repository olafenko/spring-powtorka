package site.justproject.springreturn;

import site.justproject.springreturn.model.Umbrella;

public class Worker {


    private Umbrella umbrella;


    public Worker(Umbrella umbrella) {
        this.umbrella = umbrella;
    }

    public void work(){
        System.out.println("Working with: " + umbrella.getName());
    }
}
