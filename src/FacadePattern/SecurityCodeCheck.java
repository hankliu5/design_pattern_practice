package FacadePattern;

/**
 * Created by hankliu on 12/4/16.
 */
public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int securityCodeToCheck) {
        if(securityCodeToCheck == getSecurityCode()) return true;
        else return false;
    }
}
