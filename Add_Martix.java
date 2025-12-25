import java.util.Scanner;

class Add_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();
        int r2 = sc.nextInt(), c2 = sc.nextInt();

        if (r != r2 || c != c2) {
            System.out.println("Addition would not be possible because matrix dimensions don't match");
            return;
        }

        int a[][] = new int[r][c], b[][] = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(a[i][j] + b[i][j] + " ");
            System.out.println();
        }
    }
}