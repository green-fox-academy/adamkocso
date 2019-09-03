package com.rest.rest.controllers;

import com.rest.rest.models.*;
import com.rest.rest.models.Errorka;
import com.rest.rest.repositories.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoublingController {

  LogRepo log;

  @Autowired
  public DoublingController(LogRepo log) {
    this.log = log;
  }

  @GetMapping("/doubling")
  public ResponseEntity doublingInput(@RequestParam(name= "input", required=false) Integer input){
    log.save(new Log("/doubling", "input=" + input));
      if(input != null) {
        Doubling doubling = new Doubling(input);
        return ResponseEntity.status(200).body(doubling);
      } else {
        Errorka errorka = new Errorka("Please provide an input!");
        return ResponseEntity.status(200).body(errorka);
      }
  }

  @GetMapping("/greeter")
  public ResponseEntity greeting(@RequestParam(name="name", required = false) String name,
                                @RequestParam(name = "title", required = false) String title){
    log.save(new Log("/greeter", "name=" + name + "&" + "title=" + title));
    if(name != null && title != null){
      Greeter greeter = new Greeter("Oh, hi there " + name + ", my dear " + title + "!");
      return ResponseEntity.status(200).body(greeter);
    } else if (name != null){
      Errorka errorka = new Errorka("Please provide a title!");
      return ResponseEntity.status(200).body(errorka);
    } else if(title != null){
      Errorka errorka = new Errorka("Please provide a name!");
      return ResponseEntity.status(200).body(errorka);
    } else {
      Errorka errorka = new Errorka("Please provide a name and a title!");
      return ResponseEntity.status(200).body(errorka);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity appendA(@PathVariable("appendable") String word){
    log.save(new Log("/appenda/" + word));
    if(word != null){
      AppendA appendA = new AppendA(word);
      return ResponseEntity.status(200).body(appendA);
    } else {
      return ResponseEntity.status(404).build();
    }
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity doUntil(@RequestBody Until until, @PathVariable("action") String action){

    if(until != null){
      log.save(new Log("/dountil/" + action, until.toString()));
      DoUntil doUntil = new DoUntil();
      if(action.equals("sum")){
        doUntil.sum(until.getUntil());
        return ResponseEntity.status(200).body(doUntil);
      } else if(action.equals("factor")) {
        doUntil.factor(until.getUntil());
        return ResponseEntity.status(200).body(doUntil);
      }
      return ResponseEntity.status(404).build();
    } else {
      Errorka errorka = new Errorka("Please provide a number!");
      return ResponseEntity.status(200).body(errorka);
    }
  }

  @PostMapping("/arrays")
  public ResponseEntity arrays(@RequestBody ArraysEx arraysEx){

    if(arraysEx != null){
      log.save(new Log("/arrays", arraysEx.toString()));
      ArraysExResult result = new ArraysExResult();
      if(arraysEx.getWhat().equals("sum")){
        result.sum(arraysEx.getNumbers());
        return ResponseEntity.status(200).body(result);
      } else if(arraysEx.getWhat().equals("multiply")){
        result.multiply(arraysEx.getNumbers());
        return ResponseEntity.status(200).body(result);
      } else if(arraysEx.getWhat().equals("double")){
        ArraysExResultArray arrayResult = new ArraysExResultArray();
        arrayResult.doubling(arraysEx.getNumbers());
        return ResponseEntity.status(200).body(arrayResult);
      }
    }

    Errorka errorka = new Errorka("Please provide what to do with the numbers!");
    return ResponseEntity.status(200).body(errorka);

  }

  @GetMapping("/log")
  public ResponseEntity log(){
    LogList logList = new LogList(log.findAll());
    return ResponseEntity.status(200).body(logList);
  }

}
