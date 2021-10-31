package LOGICS;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
public class Perfect_no
{
    public boolean isperfect(int n)
    {
        int i,sum=0;
       for(i=1;i<=n;i++)
       {
           if(n%i==0)
               sum=sum+i;
       }

        if(sum==n)
            return true;
        else
            return false;
    }
}
