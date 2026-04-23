package cpack;

import apack.A;

public class C {

    public void display() {
        A obj = new A(10, 20, 30);

        System.out.println("From C (Non-Subclass):");
        System.out.println("Public Variable: " + obj.pubVar);
        System.out.println("Private Variable via method: " + obj.getPrivVar());
    }
}