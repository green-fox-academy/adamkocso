package com.greenfoxacademy.springstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(SpringstartApplication.class, args);
  }

  @Autowired
  private MyColor mycolor;
  private Printer printer;

  public SpringstartApplication(Printer printer, MyColor color) {
    this.mycolor = color;
    this.printer = printer;
  }


  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
    mycolor.printColor();


  }
}
