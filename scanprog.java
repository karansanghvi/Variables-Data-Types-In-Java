//to use scanner class in java
import java.util.*;
public class scanprog {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //String input = sc.next();
        //System.out.println(input);

        String name = sc.nextLine(); //to capture anything after we put space in the output
        System.out.println(name);
        sc.close();
    }
}
