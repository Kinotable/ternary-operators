import java.util.Scanner;

public class Main {
    public static String Marks(int x){
        String Msg = (x >= 50) ? "gets to go to picnic" : "no picnic";
        return Msg;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("pls enter the marks");
        int marks = s.nextInt();
        String msg = Marks(marks);
        System.out.println(msg);

    }
}
