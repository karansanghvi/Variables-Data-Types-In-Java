//program on type promotion to add 3 numbers
public class typepromotion2 {
    public static void main(String[] args) {
        short a = 25;
        byte b = 20;
        char c = 'c';
        byte bt = (byte) (a+b+c);
        System.out.println(bt);
    }
}
