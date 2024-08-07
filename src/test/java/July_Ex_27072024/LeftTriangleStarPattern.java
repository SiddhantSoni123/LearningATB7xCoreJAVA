package July_Ex_27072024;

public class LeftTriangleStarPattern {
        public static void main(String[] args) {
            // Nested 2 for loops for iteration over the matrix

            // Outer loop for rows
            int rows = 5;
            for (int i = rows - 1; i >= 0; i--) {

                // Inner loop for columns
                for (int j = 0; j <= i; j++) {

                    // Prints star and space
                    System.out.print("*" + " ");
                }

                // By now we are done with single row so new
                // line
                System.out.println();
            }
        }
    }
