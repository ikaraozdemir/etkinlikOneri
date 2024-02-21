import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp;

        Scanner inp = new Scanner(System.in);
        System.out.print("How is the weather? Please enter the temperature value :");
        temp = inp.nextInt();

        if (temp<5){
            System.out.print("You can go skiing");
        }
        else if (temp<=15) {
            System.out.print("You can go to the cinema");

        } else if (temp<=25) {
            System.out.print("You can have a picnic");

        }else {
            System.out.print("You can go swimming");
        }
    }
}