package com.greenfoxacademy.springstart.Service;

import org.springframework.stereotype.Service;

@Service
public class Cesar {


  public String caesar(String text, int number) {
    if (number < 0) {
      number = 26 + number;
    }

    String result = "";
    for(int i = 0; i < text.length(); i++) {
      int offset = Character.isUpperCase(text.charAt(i)) ? 'A' : 'a';
      result += (char)(((int)text.charAt(i) + number - offset) % 26 + offset);
    }
    return result;
  }
}
