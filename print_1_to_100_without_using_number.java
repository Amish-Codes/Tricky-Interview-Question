public class print_1_to_100_without_using_number {

    int one = 'A'/'A';

    public void m1() {
        String s1 = "..........";

        for (int i=one; i<=(s1.length() * s1.length()); i++) {
            System.out.printf("%d ",i);
        }
    }

    public void m2() {
        for (int i= one; i<='d'; i+=one) {
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {
        print_1_to_100_without_using_number obj = new print_1_to_100_without_using_number();
        obj.m1();
        obj.m2();
    }
}
