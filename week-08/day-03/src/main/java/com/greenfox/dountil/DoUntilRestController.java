package com.greenfox.dountil;


import com.greenfox.Greeter.Errormessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Levente on 2017. 05. 10..
 */
@RestController
public class DoUntilRestController {

  @ExceptionHandler({org.springframework.http.converter.HttpMessageNotReadableException.class})
  public ErrorMessage error(org.springframework.http.converter.HttpMessageNotReadableException e){

    return new ErrorMessage();
  }

  @RequestMapping("/dountil/{what}")
  public DoUntil doUntil(@PathVariable("what") String what, @RequestBody Input input) {
    DoUntil doUntil = new DoUntil();
    if (what.equals("sum")) {
      doUntil.sum(input.getUntil());
    } else if (what.equals("factor")) {
      doUntil.factor(input.getUntil());
    }

    return  doUntil;
  }

}
