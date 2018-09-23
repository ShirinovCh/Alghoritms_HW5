/**
/*
* Homework. Lesson 5.
*
*@author Chingiz Shirinov 
*@version Sept 23 2018
*/

// Task 1

public class Degree {
    public static void main(String[] args) {
        System.out.println(degree(5, 8));
    }

    public static int degree(int n, int m) {
        if (m == 0) return 1;
        return n * degree(n, m - 1);
    }
}

// Task 2


