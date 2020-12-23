package loops;

public class DoWhileLoop {

    public static void main(String[] args) {
        // do...while loop template and structure
        // 
        // do{
        //      block of code
        // }while(condition);
        //
        // dont forget the semicolon after the while
        // use do...while loop if you want something to run at least once

        // counting from 0 to 4
        int i = 0;  // initialization
        do{
            System.out.println("I is " + i);
        }while(i < 5); // condition
    }

}
