public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;

        boolean f = (f1 > f2);
        System.out.println(f);

        int g1 = 350;
        int g2 = 200;

        boolean g = (g2*2 > g1);
        System.out.println(g);

        int h = 135798745;

        boolean h1 = (h%11 == 0);
        System.out.println(h1);




    }
}
