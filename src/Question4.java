 class ArraySum {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Sum of each column:");
        for (int col = 0; col < array[0].length; col++) {
            int colSum = 0;
            for (int row = 0; row < array.length; row++) {
                colSum += array[row][col];
            }
            System.out.println("Sum of Column " + col + ": " + colSum);
        }
        System.out.println("\nSum of each row:");
        for (int row = 0; row < array.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < array[row].length; col++) {
                rowSum += array[row][col];
            }
            System.out.println("Sum of Row " + row + ": " + rowSum);
        }
    }
}
