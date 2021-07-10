public class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ir = mat.length;
        int ic = mat[0].length;
        if (ir * ic != r * c) return mat;

        int[][] newMat = new int[r][c];
        for (int i = 0; i < ir; i++) {
            for (int j = 0; j < ic; j++) {
                int element = i * ic + j;
                newMat[element / c][element % c] = mat[i][j];
            }
        }
        return newMat;
    }
}