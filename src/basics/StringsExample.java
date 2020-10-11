package basics;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Derrick";
        String name1 = new String( "Derrick");
        String name2 = "Derrick";

        System.out.println(name == name2);

        System.out.println(name1.equals(name2));
        System.out.println(!name1.equals(name2));

        System.out.println(name.length());

        String cafe = "Starbucks";

        System.out.println(cafe.substring(0,4));

        System.out.println(cafe.indexOf("bucks"));

        //Exercise
        //print every char in a String
        String brand = "Panasonic";
        System.out.println(brand.substring(0, 1));
//        for (int ) {
//            System.out.println(cafe.substring(0,4));
//        }

        for (int i = 0; i < brand.length(); i++) {
            System.out.println(brand.substring(i, i+1)); // string
            System.out.println(brand.charAt(i)); // char
        }

        for (char ch : brand.toCharArray()) {
            System.out.println(ch);
        }
    }
}
