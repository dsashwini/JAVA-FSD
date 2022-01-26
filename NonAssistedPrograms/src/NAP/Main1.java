package NAP;

public class Main1 {
	


		  String language;

		  // constructor with no parameter
		  Main1() {
		    this.language = "Java";
		  }

		  // constructor with a single parameter
		  Main1(String language) {
		    this.language = language;
		  }

		  public void getName() {
		    System.out.println("Programming Langauage: " + this.language);
		  }

		  public static void main(String[] args) {

		    // call constructor with no parameter
		    Main1 obj1 = new Main1();

		    // call constructor with a single parameter
		    Main1 obj2 = new Main1("Python");

		    obj1.getName();
		    obj2.getName();
		  }
		}


