import java.util.Random;

public class IfBlock {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(11);

        System.out.println("I picked a random number: " + number);

        if (number < 5){
            System.out.println("Number is smaller than 5");
        }
    }
}
