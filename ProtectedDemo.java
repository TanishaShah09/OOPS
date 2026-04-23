package dpack;

import bpack.B;
import cpack.C;
public class ProtectedDemo {
    public static void main(String[] args) {
        B objB = new B(1, 2, 3);
        objB.display();
        System.out.println();
        C objC = new C();
        objC.display();
    }
}