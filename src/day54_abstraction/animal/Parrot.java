package day54_abstraction.animal;

import day54_abstraction.language.Language;

// This is a concrete class
public final class Parrot extends Bird implements Flyable, Playable, Language {
    @Override
    public void eat() {
        System.out.println("Parrot wobble over to the seeds");
    }

    @Override
    public void fly(){
        System.out.println("Parrot is flying");
    }

    @Override
    public void play(){
        System.out.println("Parrot is playing");
    }

    @Override
    public void hi(){
        System.out.println("Merhaba");
    }

    @Override
    public void bye(){
        System.out.println("Gule gule");
    }
}
