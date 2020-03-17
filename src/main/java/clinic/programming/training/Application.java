package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Hi there");

		for(String greeting : greetings) {
			System.out.println("Greeting: " + greeting);
		}
	}

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }

    // inside target folder 
    // you can run with this `java -cp maven-quick-start-1.0.jar clinic.programming.training.Application`
}