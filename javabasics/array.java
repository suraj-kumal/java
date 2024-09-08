public class array {
    public static void main(String[] args) {
        // 1d array
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("\n");
        // 2d array
        int[][] matrix = { { 1, 0 }, { 0, 1 } };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
