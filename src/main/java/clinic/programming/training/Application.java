package clinic.programming.training;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
    }

    // inside target folder 
    // you can run with this `java -cp maven-quick-start-1.0.jar clinic.programming.training.Application`
}