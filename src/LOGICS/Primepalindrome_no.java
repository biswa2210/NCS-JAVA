package LOGICS;
import LOGICS.Prime_no;
import LOGICS.Palindrome_no;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
public class Primepalindrome_no
{
    public boolean isprimepalindrome(int n)
    {
        Prime_no pr = new Prime_no();
        Palindrome_no pl = new Palindrome_no();

        if(pr.isprime(n) && pl.ispalindrome(n))
            return true;
        else
            return false;
    }
}
