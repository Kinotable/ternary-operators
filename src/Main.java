import java.util.Scanner;

public class Main {
    public static String Marks(int x){
        String Msg = (x >= 50) ? "gets to go to picnic" : "no picnic";
        return Msg;
    }
    // even or odd
    public static String EvenOrOdd(int num){
        String Msg = ( num % 2 == 0) ? "is even" : "is odd";
        return Msg;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("pls enter the marks");
        int marks = s.nextInt();
        String msg = Marks(marks);
        System.out.println(msg);
//even or odd
        System.out.println("pls enter the Even or odd");
        int num = s.nextInt();
        String evenorodd = EvenOrOdd(num);
        System.out.println(evenorodd);
    }
}
