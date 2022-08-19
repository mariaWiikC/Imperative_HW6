package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int w = 6;
        int p = 0;

        if (w <= 2)
            p = 3;
        if (2 < w && w <= 5)
            p = 3 + 2 * (w - 2);
        if (w > 5)
            p = (3 + 2 * (w - 2)) + 3 * (w - 5);

        System.out.println(p);
    }
}
