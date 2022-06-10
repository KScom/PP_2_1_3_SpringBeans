package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private Animal animal;
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    @Autowired
    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    @Autowired
    public AnimalsCage(Animal animal) {
        this.animal = animal;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
