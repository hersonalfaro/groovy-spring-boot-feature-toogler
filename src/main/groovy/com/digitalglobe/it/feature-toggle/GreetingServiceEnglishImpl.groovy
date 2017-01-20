package com.digitalglobe.it.featuretoogle


@Component("greeting.english")
public class GreetingServiceEnglishImpl implements GreetingService {

 public String sayHello(String name) {
  return "Hello " + name;
 }
}

