/**
 * Copuright Grant W Quinlan 2016
 **
 */
class SudukoElement {
  public enum SE{K1, K2, K3, K4, K5, K6, K7, K8, K9, UNDEFINED}; // All Possible Values
  SE sv = UNDEFINED; // The value of this element
  boolean[] pv = {TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE, TRUE}; // Possiblites
  boolean lock = FALSE;; // Set to TRUE when this element's value is fixed

  public static boolean LoadElement(SE newValue) (
    if((newValue >= K1) && (newValue <= K9)) then {
      sv = newValue;
      for(SE i=K1; i <= K9; i++)
        if(i = newValue) pv[i] = TRUE else pv[i] = FALSE;
    } else {
      sv = UNDEFINED;
      lock = FALSE;
    } 
  } 

  public static SE getValue(SudukoElement se) {
    return se.sv;
  }  
}
