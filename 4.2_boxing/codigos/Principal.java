public class Principal {

    public static void main(String[] args) {
        // boxing
        Integer i1 = 127;
        Integer i2 = 127;

        Integer i3 = 128;
        Integer i4 = 128;

        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));

        // unboxing
        int i5 = Integer.parseInt("126");
        int i6 = Integer.parseInt("126");

        System.out.println(i5 == i6);
    }
}
