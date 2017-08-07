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
 * The SudukoGroup class
 **
 */

public class SudukoGroup extends SudukoElement {
  public static SudukoElement[] SEs;
  
  SudukoGroup() {
    SEs = new SudukoElement[9];
  }

  SudukoGroup(SudukoElement E1, SudukoElement E2, SudukoElement E3,
              SudukoElement E4, SudukoElement E5, SudukoElement E6,
              SudukoElement E7, SudukoElement E8, SudukoElement E9) {
       SEs = new SudukoElement[9];
       SEs[0] = E1;
       SEs[1] = E2;
       SEs[2] = E3;
       SEs[3] = E4;
       SEs[4] = E5;
       SEs[5] = E6;
       SEs[6] = E7;
       SEs[7] = E8;
       SEs[8] = E9;
  }

  SudukoElement getElement(int i) {
    return SEs[i];
  }
}
