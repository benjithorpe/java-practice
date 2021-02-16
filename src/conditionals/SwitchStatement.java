package conditionals;

public class SwitchStatement {

    public static void main(String[] args) {

        // switch works like if statement
        // it uses case instead of if and else if
        // the default is like an else 
        // dont forget to break after each case or
        // it will print out everything
        String name = "john";
        switch (name) {
            case "jane":
                System.out.println("Welcome, Jane");
                break;
            case "john":
                System.out.println("Welcome, John");
                break;
            default:
                System.out.println("No name available");
        }
    }

}
