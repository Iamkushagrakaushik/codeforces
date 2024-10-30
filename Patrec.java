public class Patrec {

    public static void main(String[] args) {
        int n = 4;

        printSolidSquare(n, 0);
        System.out.println("_______________________________________________");
        printHollowSquare(n, 0);
        System.out.println("_______________________________________________");
        printRightAngledTriangle(n, 0);
        System.out.println("_______________________________________________");
        printInvertedTriangle(n, 0);
        System.out.println("_______________________________________________");
        printShiftedSquare(n, 0);
        System.out.println("_______________________________________________");
        printShiftedSquareRight(n, 0);
    }

    static void printSolidSquare(int n, int row) {
        if (row == n) return;
        printRow(n, 0);
        System.out.println();
        printSolidSquare(n, row + 1);
    }

    static void printRow(int n, int col) {
        if (col == n) return;
        System.out.print("*");
        printRow(n, col + 1);
    }

    static void printHollowSquare(int n, int row) {
        if (row == n) return;
        printHollowRow(n, row, 0);
        System.out.println();
        printHollowSquare(n, row + 1);
    }

    static void printHollowRow(int n, int row, int col) {
        if (col == n) return;
        if (col == 0 || col == n - 1 || row == 0 || row == n - 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
        printHollowRow(n, row, col + 1);
    }

    static void printRightAngledTriangle(int n, int row) {
        if (row == n) return;
        printRow(row + 1, 0);
        System.out.println();
        printRightAngledTriangle(n, row + 1);
    }

    static void printInvertedTriangle(int n, int row) {
        if (row == n) return;
        printRow(n - row, 0);
        System.out.println();
        printInvertedTriangle(n, row + 1);
    }

    static void printShiftedSquare(int n, int row) {
        if (row == n) return;
        printSpaces(row, 0);
        printRow(n, 0);
        System.out.println();
        printShiftedSquare(n, row + 1);
    }

    static void printSpaces(int count, int current) {
        if (current == count) return;
        System.out.print(" ");
        printSpaces(count, current + 1);
    }

    static void printShiftedSquareRight(int n, int row) {
        if (row == n) return;
        printSpaces(n - row, 0);
        printRow(n, 0);
        System.out.println();
        printShiftedSquareRight(n, row + 1);
    }
}
