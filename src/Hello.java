//package basics;

public class Hello {
    //psvm + tab
    public static void main(String[] args) {
        //sout + tab -> print method
        for (int i = 0; i < args.length; i++){
            System.out.println();
        }
        System.out.println("Hello, Java");

        // printf() -> print without a newline
        System.out.print("Vancouver");
        System.out.print("BC\n");

        // printf() -> print with format
        // %s :string
        // %d : int(digit)
        // %f : float
        System.out.printf("%s starts at %02d:%02d pm\n", "Java", 1, 0);
    }
}