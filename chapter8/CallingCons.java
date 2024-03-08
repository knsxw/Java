class X extends B {
    X() {
        System.out.println("Inside C's constructor.");
    }
}
public class CallingCons {
    public static void main(String[] args) {
        X x = new X();
    }
}
