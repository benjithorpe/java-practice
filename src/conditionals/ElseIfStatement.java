package conditionals;

public class ElseIfStatement {

    public static void main(String[] args) {

        /**
         * else if is used to check for multiple if conditions,
         * it must also have a condition to check
         */
        if (10 > 3) {
            System.out.println("10 is greater than 3");
        }else if(3 > 10){
            System.out.println("3 is greater than 10");
        }else if(5 < 10){
            System.out.println("5 is lesser than 10");
        }
        // ... and many more as you like

    }

}
