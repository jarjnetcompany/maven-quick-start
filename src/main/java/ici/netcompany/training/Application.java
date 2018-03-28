package ici.netcompany.training;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public Application() {
        System.out.println ("Inside Application...");
    }

    public static void main (String[] args) {
    	System.out.println ("Starting Application...");
		Application app = new Application();
		app.greet();
    }

    public void greet(){
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");
        greetings.add("Hola");
        greetings.add("Alo");

        for (String greeting: greetings){
            System.out.println(greeting);
        }
    }
}