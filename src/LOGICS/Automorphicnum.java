package LOGICS;

/*
CREATED BY BISWARUP BHATTACHARJEE
EMAIL    : bbiswa471@gmail.com
PHONE NO : 6290272740
*/
import java.util.Scanner;
public class Automorphicnum {
    public boolean isAutomorphic(int a){

        if ((a*a)%10==a)
            return true;
        else
            return false;
    }
}
