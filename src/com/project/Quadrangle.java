package com.project;

public class Quadrangle extends Figure {

    private static int x = varInit("Initialize static x - Quadrangle;");
    private int y = varInit("Initialize non-static y - Quadrangle;");

    public Quadrangle() {
        System.out.println("Constructor - Quadrangle;");
    }

    static {
        System.out.println("Static block - Quadrangle;");
    }

    {
        System.out.println("Non-static block - Quadrangle;");
    }

}
