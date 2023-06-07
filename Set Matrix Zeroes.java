class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] r=new boolean[m];
        boolean[] c=new boolean[n];
        for(int i=0;i<m;i++)
        r[i]=false;
        for(int j=0;j<n;j++)
            c[j]=false;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(r[i]==true || c[j]==true)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
