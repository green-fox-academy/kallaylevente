package com.greenfox.roraController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoraController {

  @RequestMapping(value = "/rocket", method = RequestMethod.GET)
  public Object shipInfo() {
    Ship ship = new Ship();
    ship.setShipStatus(ship.shipStatusTracker());
    return ship;
  }

  @RequestMapping(value = "/rocket/fill", method = RequestMethod.GET)
  public Object shipFill(@RequestParam("caliber") String caliber, @RequestParam("amount") int amount) {

  }

}
