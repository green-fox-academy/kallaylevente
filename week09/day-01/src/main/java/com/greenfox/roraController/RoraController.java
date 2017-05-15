package com.greenfox.roraController;

import com.greenfox.grootModel.Errormessage;
import com.greenfox.roraModel.FilledShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoraController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
  public Errormessage missingPathVariableException() {
    Errormessage m = new Errormessage();
    m.setError("No caliber and amount added");
    return m;
  }

  @Autowired
  Ship ship;

  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Object shipInfo() {
    /*Ship ship = new Ship();*/
    ship.setShipStatus(ship.shipStatusTracker());
    return ship;
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public Object shipFill(@RequestParam("caliber") String caliber, @RequestParam("amount") int amount) {
    FilledShip filledShip = new FilledShip();
    filledShip.fill(caliber,amount);
    /*ship.fillShip(caliber,amount);*/
    return filledShip;
  }

}
