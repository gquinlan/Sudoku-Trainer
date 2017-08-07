/**
 * Copyright (c) 2016, Grant W Quinlan. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice and this list of conditions.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice and this list of conditions.
 **
 */

/**
 * The SudukoValue class implements the data type for a single value of a square
 **
 */

public class SudukoValue {
  Exception excp;
  public static enum SV {
    K1, K2, K3, K4, K5, K6, K7, K8, K9, UNDEFINED
  };

  SV sv;

  SudukoValue() {
    sv = SV.UNDEFINED;
    // excp.printStackTrace();
    System.out.println("Constructor SudukoValue() called. sv = " + sv);
  }

  SudukoValue(SV newvalue) {
    switch(newvalue) {
      case K1:
      case K2:
      case K3:
      case K4:
      case K5:
      case K6:
      case K7:
      case K8:
      case K9:
        sv = newvalue;
        break;
      default:
        sv = SV.UNDEFINED;
        break;
      }
    System.out.println("Constructor SudukoValue(SV) called. sv = " + sv);
  }

  SudukoValue(int i) {
    switch(i) {
      case 1:
        sv = SV.K1;
        break;
      case 2:
        sv = SV.K2;
        break;
      case 3:
        sv = SV.K3;
        break;
      case 4:
        sv = SV.K4;
        break;
      case 5:
        sv = SV.K5;
        break;
      case 6:
        sv = SV.K6;
        break;
      case 7:
        sv = SV.K7;
        break;
      case 8:
        sv = SV.K8;
        break;
      case 9:
        sv = SV.K9;
        break;
      default:
        sv = SV.UNDEFINED;
        break;
      }
    System.out.println("Constructor SudukoValue(int) called. sv = " + sv);
  }


@Override
  public String toString() {
    String Str;

    switch(sv) {
      case K1:
        Str = new String(" 1");
        break;
      case K2:
        Str = new String(" 2");
        break;
      case K3:
        Str = new String(" 3");
        break;
      case K4:
        Str = new String(" 4");
        break;
      case K5:
        Str = new String(" 5");
        break;
      case K6:
        Str = new String(" 6");
        break;
      case K7:
        Str = new String(" 7");
        break;
      case K8:
        Str = new String(" 8");
        break;
      case K9:
        Str = new String(" 9");
        break;
      case UNDEFINED:
        Str = new String("  ");
        break;
      default:
        Str = new String("?!Error!?");
        break;
    }
    return Str; 
  }

  public int toInt() {
    switch(sv) {
      case K1:
        return 1;
      case K2:
        return 2;
      case K3:
        return 3;
      case K4:
        return 4;
      case K5:
        return 5;
      case K6:
        return 6;
      case K7:
        return 7;
      case K8:
        return 8;
      case K9:
        return 9;
      case UNDEFINED:
      default:
     	return -2147483647;
    }
  }

  public final int compareTo(SV testValue) {
	System.out.println("Entered SudukoValue.compareTo(" + testValue + ")");
    if(sv == testValue) return 0; 
    else {
      if((testValue == SV.UNDEFINED) || (sv == SV.UNDEFINED)) return -2147483647;
      switch(testValue) {
        case K1:
          if(sv != testValue) {
            return 1;
          }
        case K2:
          switch(sv) {
            case K1:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
        case K3:
          switch(sv) {
            case K1:
            case K2:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
        case K4:
          switch(sv) {
            case K1:
            case K2:
            case K3:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
         case K5:
          switch(sv) {
            case K1:
            case K2:
            case K3:
            case K4:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
         case K6:
          switch(sv) {
            case K1:
            case K2:
            case K3:
            case K4:
            case K5:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
         case K7:
          switch(sv) {
            case K1:
            case K2:
            case K3:
            case K4:
            case K5:
            case K6:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
         case K8:
          switch(sv) {
            case K1:
            case K2:
            case K3:
            case K4:
            case K5:
            case K6:
            case K7:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
         case K9:
          switch(sv) {
            case K1:
            case K2:
            case K3:
            case K4:
            case K5:
            case K6:
            case K7:
            case K8:
              return -1;
            }
          if(sv != testValue) {
            return 1;
          }
         default:
            return -2147483647;
      }
    }
  }
}
