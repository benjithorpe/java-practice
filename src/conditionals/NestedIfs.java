package conditionals;

public class NestedIfs {
    public static void main(String[] args) {
        byte age = 10;
        if(age > 18){
            if(age < 35){
                System.out.println("You are in your youth age");
            }else{
                System.out.println("You have passed youth age");
            }
        }else{
            System.out.println("Awwww, cute little baby");
        }
    }
    
}
