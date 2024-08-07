package July_Ex_27072024;

public class RightTriangleStarPattern {
        public static void main(String[] args) {

            int n = 5;

            String row = "*";
            int i = 1;
            while(i <= n) {
                System.out.println(row);
                row += "*";
                i++;
            }
        }
}
