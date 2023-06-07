class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> c=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    c.add(1);
                else
                    c.add(r.get(i-1).get(j-1)+r.get(i-1).get(j));
            }
            r.add(c);
        }
        return r;
    }
}
