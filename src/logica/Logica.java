package logica;

public class Logica {
        public static int d(int x) {
            return x*2;
        }
        public static int e(int x) {
            return x*5;
        }
        public static int fn(int x) {
            if (x<1)
                return 0;
            else
                return 4+fn(x-4);
        }
        public static int g(int y){
            return 10+fn(y)+e(y)+d(y);
        }

    public static void main(String[] args) {
        System.out.println(g(5));
    }
}
