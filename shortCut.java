class shortCut {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;
        if (a > b && a > c) {
            System.out.println("a is maximum");
        } else if (b > c && b > a) {
            System.out.println("b is maximum");
        } else
            System.out.println("c is maximum");
    }
}

