class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] matrix ) {
        // code here
        
        ArrayList<Integer> res = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int topRow = 0,bottomRow = r-1,leftCol = 0,rightCol = c-1;
        int totalElements = 0;
        
        
        while(totalElements < r * c){

            //TopRow -> leftCol To rightCol
            for(int j=leftCol;j<=rightCol && totalElements < r * c; j++){
                res.add(matrix[topRow][j]);
                totalElements++;
            }
            topRow++;

            //RightCol -> topRow To bottomRow
             for(int i=topRow;i<=bottomRow && totalElements < r * c; i++){
               res.add(matrix[i][rightCol]);
                totalElements++;
            }
            rightCol--;

            //BottomRow -> rightCol To leftCol
             for(int j=rightCol;j>=leftCol && totalElements < r * c; j--){
               res.add(matrix[bottomRow][j]);
                totalElements++;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow
             for(int i=bottomRow;i>=topRow && totalElements < r * c; i--){
                res.add(matrix[i][leftCol]);
                totalElements++;
            }
            leftCol++;
        }
        
        return res;
    }
    
}
