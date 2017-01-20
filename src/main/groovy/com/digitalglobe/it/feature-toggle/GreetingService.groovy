package com.digitalglobe.it.featuretoogle

public interface GreetingService {
 @Flip(name="language-french", alterBean="greeting.french")
 String sayHello(String name);
}
