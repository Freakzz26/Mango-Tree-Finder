import java.util.Scanner;

public class mango_tree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int cols=scanner.nextInt();
        int num=scanner.nextInt();
        if(num>=1 && num<=rows)
        {
            System.out.print("true");
        }
        else if((num-1)%rows==0)
        {
            System.out.print("true");
        }
        else if(num%rows==0)
        {
            System.out.print("true");
        }
        else {
            System.out.print("false");
        }
    }
}
