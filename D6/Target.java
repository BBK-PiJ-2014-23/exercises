public class Target {
    private int[][][] array;
    private int[] target;

    public Target(int x, int y, int z) {
        array = new int[x][y][z];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = 0;
                }
            }
        }
    }

    public void init() {
        int x = (int) Math.abs(array.length * Math.random());
        int y = (int) Math.abs(array[x].length * Math.random());
        int z = (int) Math.abs(array[x][y].length * Math.random());

        array[x][y][z] = 1;
        target = new int[3];
        target[0] = x;
        target[1] = y;
        target[2] = z;
    }

    public Result fire (int x, int y, int z) {
        //HIT, FAIL_LEFT, FAIL_RIGHT, FAIL_HIGH, FAIL_LOW, FAIL_SHORT, FAIL_LONG, OUT_OF_RANGE
        if (x == target[0] && y == target[1] && z == target[2]) {
            return Result.HIT;
        } else if (x > array.length - 1 || y > array[0].length - 1 || z > array[0][0].length - 1) {
            return Result.OUT_OF_RANGE;
        } else if (x < target[0]) {
            return Result.FAIL_LEFT;
        } else if (x > target[0]) {
            return Result.FAIL_RIGHT;
        } else if (y < target[1]) {
            return Result.FAIL_LOW;
        } else if (y > target[1]) {
            return Result.FAIL_HIGH;
        } else if (z < target[2]) {
            return Result.FAIL_SHORT;
        } else {
            return Result.FAIL_LONG;
        }
    }
}
