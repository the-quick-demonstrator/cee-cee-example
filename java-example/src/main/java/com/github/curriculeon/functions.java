public class functions {
    public static int multiply(int x, int y) {
        final int product = x * y;
        return product;
    }


    public static void main(String[] args) {
        final int firstProduct = multiply(10,5);
        final int secondProduct = multiply(11,6);
        final int thirdProduct = multiply("hello", "world");


        System.out.println(firstProduct);
        System.out.println(secondProduct);
        System.out.println(thirdProduct); 
    }

}