import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        calculate();
    }

    public static void calculate(){
        int a , b=0;
        int operation;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome , these are the operation that I can do for you :");
        System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Square Root \n5.Modulus ");
        System.out.println("Choose the operation you want to perform (type the number of the option) : ");
        operation = sc.nextInt();
        if(operation != 4 ){
            System.out.println("Enter two numbers : ");
            a = sc.nextInt();
            b = sc.nextInt();
        }else{
            System.out.println("Enter one number : ");
            a = sc.nextInt();
        }

        switch (operation){
            case 1 :
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case 2 :
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case 3 :
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case 4 :
                System.out.println(a +" ^ 2" + " = " + a*a);
                break;
            case 5 :
                System.out.println(a + " mod " + b + " = " + (a%b));
                break;
            default:
                System.out.println("You didnt give a valid number");
        }
    }
}
