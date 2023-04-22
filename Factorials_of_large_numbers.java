class Solution {
    static ArrayList<Integer> factorial(int N)
    {
        ArrayList<Integer> a = new ArrayList<Integer> ();
        a.add(1);
        int c=0;
        int i=2;
        while(i<=N)
        {
            for(int j=a.size()-1;j>=0;j--)
            {
                int temp=a.get(j)*i+c;
                a.set(j,temp%10);
                c=temp/10;
            }
            while(c!=0)
            {
            a.add(0,c%10);
            c=c/10;
            }
            i++;
            
        }
        
        
     return a;   
    }
}
