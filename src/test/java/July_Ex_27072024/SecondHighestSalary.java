package July_Ex_27072024;

import java.util.Arrays;

public class SecondHighestSalary {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        Arrays.sort(salaries);

        System.out.println("Second Highest Salary is " + salaries[salaries.length-2]);
    }
}
