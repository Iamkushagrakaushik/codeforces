public class XStarPattern {

    public static void main(String[] args) {
        int n = 5; // Size of the pattern (should be odd for a complete X)
        printXStarPattern(n, 0);
    }

    public static void printXStarPattern(int n, int row) {
        if (row >= n) {
            return; // Base case: stop when all rows are printed
        }

        // Print each row
        for (int col = 0; col < n; col++) {
            if (col == row || col == n - row - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(); // Move to the next line

        // Recursive call for the next row
        printXStarPattern(n, row + 1);
    }
}