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
 * The SudukoPuzzle class implements structures and elements needed to 
 * represent a complete Suduko Puzzle.
 **
 */

public class SudukoPuzzle extends SudukoElement {
  public static SudukoElement[] SEs;
  public static SudukoGroup[] SRs;
  public static SudukoGroup[] SCs;
  public static SudukoGroup[] SBs;

  public static void main(String[] args) {
    SEs = new SudukoElement[81];
    for(int i=0; i<81; i++) {
      SEs[i] = new SudukoElement((i + (i/9)*3 + i/27)%9 + 1);
    }
    setPositions();
  }

  public static void setPositions() {
    SRs = new SudukoGroup[9];    
    SCs = new SudukoGroup[9];
    SBs = new SudukoGroup[9];
    for(int i=0; i<81; i++) {
      SEs[i].setRow((i/9)%9);
      SEs[i].setCol(i%9);
      SEs[i].setBlk((SEs[i].getRow()/3)*3 + (SEs[i].getCol()/3));
      SEs[i].lockPosition();
      System.out.println("Element " + i + " in in row " + SEs[i].getRow() + " column " + SEs[i].getCol() + " and block " + SEs[i].getBlk());
    }
    for(int i=0; i<9; i++) {
//      System.out.println("Rows = new SudukoGroup("+(i*9)+", "+(i*9+1)+", "+(i*9+2)+", "+(i*9+3)+", "+(i*9+4)+", "+(i*9+5)+", "+(i*9+6)+", "+(i*9+7)+", "+(i*9+8)+")");
      SRs[i] = new SudukoGroup(SEs[i*9],SEs[i*9+1],SEs[i*9+2],SEs[i*9+3],SEs[i*9+4],SEs[i*9+5],SEs[i*9+6],SEs[i*9+7],SEs[i*9+8]);
//      System.out.println("Columns = new SudukoGroup("+(i)+", "+(i+9)+", "+(i+18)+", "+(i+27)+", "+(i+36)+", "+(i+45)+", "+(i+54)+", "+(i+63)+", "+(i+72)+")");
      SCs[i] = new SudukoGroup(SEs[i],SEs[i+9],SEs[i+2*9],SEs[i+3*9],SEs[i+4*9],SEs[i+5*9],SEs[i+6*9],SEs[i+7*9],SEs[i+8*9]);
      System.out.println("Blocks = new SudukoGroup("+(27*(i/3)+(i%3)*3)+", "+(27*(i/3)+(i%3)*3+1)+", "+(27*(i/3)+(i%3)*3+2)+", "+(27*(i/3)+(i%3)*3+9)+", "+(27*(i/3)+(i%3)*3+10)+", "+(27*(i/3)+(i%3)*3+11)+", "+(27*(i/3)+(i%3)*3+18)+", "+(27*(i/3)+(i%3)*3+19)+", "+(27*(i/3)+(i%3)*3+20)+")");
    }
  }
}
