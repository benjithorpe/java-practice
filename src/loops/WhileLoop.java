package loops;

public class WhileLoop {

    public static void main(String[] args) {
        // while loop template and structure
        // 
        // while(condition){
        //      block of code
        // }
        //
        // becareful when using the while loop to avoid infinite looping
        // use while loop if you don't know how many times the loop will run

        // counting from 0 to 4
        int i = 0;  // the initialization
        while(i < 5){
            System.out.println("I is now " + i);
            i++;  // the increment
        }
    }

}
