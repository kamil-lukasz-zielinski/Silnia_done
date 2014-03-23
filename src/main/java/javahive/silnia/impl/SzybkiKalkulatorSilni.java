package javahive.silnia.impl;
import javahive.silnia.KalkulatorSilni;

public class SzybkiKalkulatorSilni implements KalkulatorSilni{
    public long liczLong(long podstawa){
        if(podstawa<0) {
            throw new ArithmeticException();
        }
        if(podstawa>0) {
            return podstawa*liczLong(podstawa-1);
        } 
        else {
            return 1;
        }
    }
    
    public String licz(int arg) {
        return ""+liczLong(arg);
    }

}
