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
 * The SudukoElement class implements a single element of a Suduko
 * puzzle. There are 81 such elements in each puzzle.
 **
 */

public class SudukoElement extends SudukoValue {
  boolean lock = false;
  SudukoValue sv = new SudukoValue(SV.UNDEFINED);
  boolean[] possibilities;
  boolean positionLock = false;
  int row = 0;
  int col = 0;
  int blk = 0;

  SudukoElement() {
    possibilities = new boolean[9];
    loadElement(SV.UNDEFINED);
    for(int i=0; i<9; i++) possibilities[i]=false;  
    System.out.println("Constructor SudukoElement() called. Used default value " + SV.UNDEFINED);
  }

  SudukoElement(int si) {
    possibilities = new boolean[9];
    loadElement(si);
    for(int i=0; i<9; i++) {
      if((si >= 1) && (si <=9) && (si == (i+1))) {
          possibilities[i]=true;
        } else {
          possibilities[i]=false;
      }
    }
    System.out.println("Constructor SudukoElement(int) called with value " + si);
  }

  SudukoElement(SV newValue) {
    possibilities = new boolean[9];
    loadElement(newValue);
    System.out.println("Constructor SudukoElement(SV) called with value " + newValue);
  }

  void loadElement(int si) {
    if((si < 1)||(si > 9)) {
      loadElement(SV.UNDEFINED);
    } else {
      switch(si) {
        case 1:
          loadElement(SV.K1);
          break;
	case 2:
          loadElement(SV.K2);
          break;
        case 3:
          loadElement(SV.K3);
          break;
        case 4:
          loadElement(SV.K4);
          break;
        case 5:
          loadElement(SV.K5);
          break;
        case 6:
          loadElement(SV.K6);
          break;
        case 7:
          loadElement(SV.K7);
          break;
        case 8:
          loadElement(SV.K8);
          break;
        case 9:
          loadElement(SV.K9);
          break;
        default:
          loadElement(SV.UNDEFINED);
          break;
      }
    }
  }

  void loadElement(SV newValue) {
    System.out.println("loadElement(SV) called with value " + newValue);
    if((newValue.compareTo(SV.K1) >= 0) && (newValue.compareTo(SV.K9) >= -1)) {
      lock = true;
      sv = new SudukoValue(newValue);
      for(int i = 0; i<9; i++) {
        if(sv.toInt() == (i+1)) 
          possibilities[i] = true; 
        else 
          possibilities[i] = false;
      }
    } else {
      lock = false;
      sv = new SudukoValue(SV.UNDEFINED);
      for(int i = 0; i<9; i++) possibilities[1] = true;
    }
  }

  void setRow(int i){
    if(!positionLock) {
      row = i%9;
    }
  }

  void setCol(int i){
    if(!positionLock) {
      col = i%9;
    }

  }
 
  void setBlk(int i){
    if(!positionLock) {
     blk = i%9;
    }
  }

  int getRow() {
    return row;
  }

  int getCol() {
    return col;
  }

  int getBlk() {
    return blk;
  }

  void lockPosition(){
    if(!positionLock) positionLock = true;
  } 
 
  void unlockPosition(){
    if(positionLock) positionLock = false;
  }
 
  void printState() {
    System.out.print("value:" + sv + " lock:" + lock + " possibilities:");
    for(int i = 0; i < 9; i++)
      if(possibilities[i]) System.out.print(" " + (i+1));
    System.out.println();
  } 

@Override
  public String toString() {
    String Str = new String(sv.toString());;
    return Str;
  }
}


