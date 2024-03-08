class A {
    int i;
    int j;
    A() {
        System.out.println("Inside A's constructor.");
    }
    void setij(int x, int y) {
        i = x;
        j = y;
    }
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}
class B extends A {
    int k;
    B() {
        System.out.println("Inside B's constructor.");
    }
    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}
class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);
        subOb.sum();
        subOb.sum();;
    }
}
