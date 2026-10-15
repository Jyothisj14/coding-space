import java.util.Scanner;

public class GuessNumber{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int input=0;
        int random = ((int) (Math.random()*100));

        do{
            System.out.println("Guess my number");
            input = s.nextInt();
            if(input>random)
                System.out.println("the number is less");
            else if(input<random)
                System.out.println("The number is more");
            else
            {
                System.out.println("Yes it is right " + random);
                break;
            }
        }while(input>0);
    }
}
