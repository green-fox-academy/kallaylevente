package com.greenfox.yonduController;

import com.greenfox.grootModel.Errormessage;
import com.greenfox.yondumodell.Yondu;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
  public Errormessage missingPathVariableException() {
    Errormessage m = new Errormessage();
    return m;
  }

  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
  public Errormessage pathVariableo() {
    Errormessage m = new Errormessage();
    m.setError("Please give a positive number");
    return m;
  }


  @RequestMapping(value = "/yondu", method = RequestMethod.GET)
  public Yondu yonduGetMethod(@RequestParam ("distance") String distance,@RequestParam("time") String time ) {
    Yondu yondu = new Yondu();
    yondu.setTime(time);
    yondu.setDistance(distance);
    float dist = Float.parseFloat(distance);
    float tim = Float.parseFloat(time);
    float speed = dist / tim ;
    String spd = Float.toString(speed);
    yondu.setSpeed(spd);
    return yondu;
  }

}
