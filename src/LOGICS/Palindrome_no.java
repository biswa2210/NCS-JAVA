package LOGICS;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
public class Palindrome_no
{
    public boolean ispalindrome(int n)
    {
        int r,sum=0,temp;
        temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if(sum==temp)
            return true;
        else
            return false;
    }
}
