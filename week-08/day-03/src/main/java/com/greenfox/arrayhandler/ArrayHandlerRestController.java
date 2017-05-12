package com.greenfox.arrayhandler;

import com.greenfox.logentrie.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Levente on 2017. 05. 10..
 */
@RestController
public class ArrayHandlerRestController {



  @RequestMapping("/arrays")
  public Object handleArray(@RequestBody InputArray input) {
    ArrayHandlerSum arrayHandlerSum = new ArrayHandlerSum();
    ArrayHandlerMultiply arrayHandlerMultiply = new ArrayHandlerMultiply();
    ArrayHandlerDouble arrayHandlerDouble = new ArrayHandlerDouble();
    if (input.getWhat().equals("sum")){
      arrayHandlerSum.sum(input.getNumbers());
      return arrayHandlerSum;
    } else if (input.getWhat().equals("multiply")) {
      arrayHandlerMultiply.multiply(input.getNumbers());
      return arrayHandlerMultiply;

    } else if (input.getWhat().equals("double")) {
      arrayHandlerDouble.doubler(input.getNumbers());
      return arrayHandlerDouble;

    }

    return null;

  }



}