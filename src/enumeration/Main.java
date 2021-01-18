package enumeration;

public class Main {

    public static void main(String[] args) {

        // printing all enum values
        for (Games game : Games.values()) {
            System.out.println("-> " + game);
        }

        System.out.println("\n================\n");

        // print enum and their number(ordinal)
        for (Games game : Games.values()) {
            System.out.println(game.ordinal() + ". " + game);
        }

        System.out.println("\n================\n");

        // printing enum with constructors
        for(NameAndAge name : NameAndAge.values()){
            System.out.println("Name: " + name);
        }

        System.out.println("\n================\n");

        // printing name and age
        for(NameAndAge name : NameAndAge.values()){
            System.out.println("Number " + (name.ordinal() + 1));
            System.out.println("Name: " + name);
            System.out.println("Age: " + name.getAge());
            System.out.println();
        }

        System.out.println("\n================\n");

        // printing name and age
        for(NameAndAge name : NameAndAge.values()){
            if(name == NameAndAge.NATASHA){
                name.setAge(25);
            }
            System.out.println("Name: " + name);
            System.out.println("Age: " + name.getAge());
            System.out.println();
        }

    }
}
