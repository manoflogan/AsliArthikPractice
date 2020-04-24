// Copyright 2020 ManOf Logan. All Rights Reserved.
package com.virtu.coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class IdenticalSubstrings {
  public int solution(String str) {
    if (str == null || str.isEmpty()) {
      return 0;
    }
    List<String> identicalStrings = new ArrayList<>();
    for (int i = 0; i < str.length(); i++) {
      findIdenticalStrings(identicalStrings, str,  "", i);
    }
    return identicalStrings.size();
  }

  private boolean isIdentical(String string) {
    Set<Character> characters = new HashSet<>();
    char[] charArray = string.toCharArray();
    for (char c : charArray) {
      if (characters.isEmpty()) {
        characters.add(c);
      } else if (!characters.contains(c)) {
        return false;
      }
    }
    return true;
  }

  void findIdenticalStrings(List<String> identicalStrings, String string, String fragment, int index) {
    boolean isIdenticalFragment = isIdentical(fragment);
    if (!fragment.isEmpty() && isIdenticalFragment) {
      identicalStrings.add(fragment);
    } else if (!isIdenticalFragment) {
      return;
    }
    if (index == string.length()) {
      return;
    }
    findIdenticalStrings(identicalStrings, string, fragment + string.charAt(index), index + 1);
  }
}
