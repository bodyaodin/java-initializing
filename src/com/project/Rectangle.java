package com.project;

public class Rectangle extends Quadrangle {

    private static int x = varInit("Initialize static x - Rectangle;");
    private int y = varInit("Initialize non-static y - Rectangle;");

    public Rectangle() {
        System.out.println("Constructor - Rectangle;");
    }

    static {
        System.out.println("Static block - Rectangle;");
    }

    {
        System.out.println("Non-static block - Rectangle;");
    }

}
