public class MatrixChecker {
    public boolean isSymmetrical(int[] array) {
        boolean isSymmetrical = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array.length - 1 - i) {
                isSymmetrical = false;
            }
        }
        return isSymmetrical;
    }
    
    public boolean isSymmetrical(int[][] array) {
        boolean isSymmetrical = true;
        if (array.length != array[0].length) {
            isSymmetrical = false;
        } else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] != array[j][i]) {
                        isSymmetrical = false;
                    }
                }
            }
        }
        return isSymmetrical;
    }
    
    public boolean isTriangular(int[][] array) {
        boolean isTriangular = true;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] != 1) {
                    isTriangular = false;
                }
            }
        }
        return isTriangular;
    }
}