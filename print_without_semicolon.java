public class print_without_semicolon {

    public static void main(String[] args) {

        if (System.out.printf("Hello World") == null) {}

        System.out.println();

        if (System.out.append("Hello world") == null) {}

        System.out.println();

        if (System.out.append("Hello World").equals(null)) {}

        System.out.println();

        for (int i=0; i<1; System.out.println("Hello World")) { break;}
    }
}
