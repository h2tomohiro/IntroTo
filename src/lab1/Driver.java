package lab1;

public class Driver {
    public static void main(String[] args) {
        Model model1 = new Model("Susan", "Smith", 70, 120, true, false);
        Model model2 = new Model("Tiger", "Woods", 72, 190, false, true);

        model1.printDetails();
        System.out.println();
        model1.displayModelDetails();
        System.out.println();

        model2.printDetails();
        System.out.println();
        model2.displayModelDetails();
    }
}