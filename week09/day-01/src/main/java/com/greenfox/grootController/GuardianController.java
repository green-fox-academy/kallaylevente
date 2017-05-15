package com.greenfox.grootController;

import com.greenfox.grootModel.Errormessage;
import com.greenfox.grootModel.Groot;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public Errormessage missingPathVariableException() {
    Errormessage m = new Errormessage();
    return m;
  }

  @RequestMapping(value = "/groot", method = RequestMethod.GET)
  public Groot getGroot(@RequestParam("message") String message) {
    Groot groot = new Groot();
    groot.setReceived(message);
    return groot;
  }

}
