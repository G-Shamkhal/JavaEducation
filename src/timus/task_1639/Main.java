package timus.task_1639;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        if (n * m % 2 == 0)
            System.out.println("[:=[first]");
        else
            System.out.println("[second]=:]");

        in.close();
    }
}
