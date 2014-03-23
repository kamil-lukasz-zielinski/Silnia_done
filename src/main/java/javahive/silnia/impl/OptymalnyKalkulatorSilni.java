package javahive.silnia.impl;
import javahive.silnia.KalkulatorSilni;

public class OptymalnyKalkulatorSilni implements KalkulatorSilni{
    
    private static final int MAKSYMALNYARGUMENTDLALONG=12;
    
    public String licz(int podstawa){
        KalkulatorSilni i=null;
        if(podstawa <= MAKSYMALNYARGUMENTDLALONG) {
            i = new SzybkiKalkulatorSilni();
        }
        else {
            i = new KalkulatorSilniBigDecimal();
        }
        return i.licz(podstawa);
    }
}
