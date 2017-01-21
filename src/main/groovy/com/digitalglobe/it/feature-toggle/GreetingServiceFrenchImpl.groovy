package com.digitalglobe.it.featuretoogle

import org.springframework.stereotype.Controller
import org.ff4j.aop.Flip;

@Component("greeting.french")
public class GreetingServiceFrenchImpl implements GreetingService {
  public String sayHello(String name) {
    return "Bonjour " + name;
  }
}
