package javahive.silnia.impl;

import java.math.BigDecimal;

import javahive.silnia.KalkulatorSilni;

/**
 *
 * @author Marcin Grabowiecki
 * 
 * proszę zaimplementować algorytm analogiczny jak dla SzybkaSilnia
 * jednak należy się oprzeć na na typie BigDecimal
 * 
 */

public class KalkulatorSilniBigDecimal implements KalkulatorSilni{
    public BigDecimal liczBigDecimal(BigDecimal podstawa){
    	if(podstawa.compareTo(new BigDecimal("0")) == -1)
    	{
    		throw new ArithmeticException();
    	}
        if(podstawa.compareTo(new BigDecimal("0")) == 1) {
            return podstawa.multiply(liczBigDecimal(podstawa.subtract(BigDecimal.ONE)));
        } 
        else {
            return BigDecimal.ONE;
        }
    }
    
    public String licz(int arg) {
        BigDecimal score = new BigDecimal(String.valueOf(arg));
        return ""+liczBigDecimal(score);
    }
}