package com.digitalglobe.it.featuretoogle

import org.springframework.stereotype.Controller
import org.ff4j.aop.Flip;

@Component("greeting.english")
public class GreetingServiceEnglishImpl implements GreetingService {

 public String sayHello(String name) {
  return "Hello " + name;
 }
}

