/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Solution : 
Step 1: Transpose matrix arr[i][j] = arr[j][i]
Step 2: Reverse each row/swap their position
*/

class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length==0){
            return;
        }
        int n = matrix.length;
        transpose(matrix,n);
        reverse(matrix,n);
    }
    private void transpose(int [][] matrix, int n){
        for(int i=0; i<n; i++){
            for(int j=i;j<n; j++){
                swap(matrix, i,j,j,i);
            }
        }
    }
    private void reverse(int [][] matrix, int n){

        for(int i=0; i<n ; i++){
            for(int j=0, k=n-1 ;j<k ; --k,++j){
                swap(matrix, i,j,i,k);
            }
        }
    }
    private void swap(int [][]matrix, int i, int j, int k, int l){
        int temp;
        temp=matrix[i][j];
        matrix[i][j]=matrix[k][l];
        matrix[k][l]=temp;
    }
}
