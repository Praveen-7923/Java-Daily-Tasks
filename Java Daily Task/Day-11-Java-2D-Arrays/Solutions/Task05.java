public class Task05 {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 25, 8},
            {45, 17, 30},
            {9, 52, 21}
        };

        int largest = matrix[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("Largest element = " + largest);
    }
}