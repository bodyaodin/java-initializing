package com.project;

public class Figure {

    private static int x = varInit("Initialize static x - Figure;");
    private int y = varInit("Initialize non-static y - Figure;");

    public Figure() {
        System.out.println("Constructor - Figure;");
    }

    static {
        System.out.println("Static block - Figure;");
    }

    {
        System.out.println("Non-static block - Figure;");
    }

    protected static int varInit (String s) {
        System.out.println(s);
        return 1;
    }
}
