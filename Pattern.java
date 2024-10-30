public class Pattern {
    
    public static void main(String[] args) {
        int n=4;
       for(int j=0 ;j<n;j++){
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int i=0;i<n;i++){
            if (i==0 || i==n-1 || j==0 || j==n-1){
            System.out.print("*");}
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int i=0;i<j+1;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int i=j;i<n;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int k=0;k<j;k++){
            System.out.print(" ");
        }
        for(int i=0;i<n;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    System.out.println("_______________________________________________");
    for(int j=0 ;j<n;j++){
        for(int k=0;k<n-j;k++){ 
            System.out.print(" ");
        }
        for(int i=0;i<n;i++){
            
            System.out.print("*");}
        
        
        System.out.println();
    }
    
    
    


    
    

}
}/*public class Pattern {
    
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

    // Solid Square of Asterisks
    static void printSolidSquare(int n, int row) {
        if (row == n) return;  // Base case: stop when all rows are printed
        printRow(n, 0);        // Print one row of n asterisks
        System.out.println();
        printSolidSquare(n, row + 1);  // Recur for next row
    }

    static void printRow(int n, int col) {
        if (col == n) return;  // Stop printing when column count reaches n
        System.out.print("*");
        printRow(n, col + 1);  // Recur to print the next asterisk
    }

    // Hollow Square of Asterisks
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

    // Right-Angled Triangle
    static void printRightAngledTriangle(int n, int row) {
        if (row == n) return;
        printRow(row + 1, 0);
        System.out.println();
        printRightAngledTriangle(n, row + 1);
    }

    // Inverted Right-Angled Triangle
    static void printInvertedTriangle(int n, int row) {
        if (row == n) return;
        printRow(n - row, 0);
        System.out.println();
        printInvertedTriangle(n, row + 1);
    }

    // Shifted Square (each row indented progressively more spaces)
    static void printShiftedSquare(int n, int row) {
        if (row == n) return;
        printSpaces(row, 0);  // Print leading spaces
        printRow(n, 0);       // Print asterisks for the row
        System.out.println();
        printShiftedSquare(n, row + 1);
    }

    static void printSpaces(int count, int current) {
        if (current == count) return;
        System.out.print(" ");
        printSpaces(count, current + 1);
    }

    // Shifted Square with increasing indent (reverse indentation)
    static void printShiftedSquareRight(int n, int row) {
        if (row == n) return;
        printSpaces(n - row, 0);  // Print leading spaces
        printRow(n, 0);           // Print asterisks for the row
        System.out.println();
        printShiftedSquareRight(n, row + 1);
    }
}
 */
