package javahive.silnia.impl;

import com.google.common.math.BigIntegerMath;

import javahive.silnia.KalkulatorSilni;

/**
 *
 * @author mgr
 */
public class KalkulatorSilniGuava implements KalkulatorSilni{

    public String licz(int arg) {
        return BigIntegerMath.factorial(arg).toString();
    }
}
