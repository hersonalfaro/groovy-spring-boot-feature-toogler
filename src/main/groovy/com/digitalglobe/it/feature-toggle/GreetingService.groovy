package com.digitalglobe.it.featuretoogle

import org.springframework.stereotype.Controller
import org.ff4j.aop.Flip;

public interface GreetingService {
 @Flip(name="language-french", alterBean="greeting.french")
 String sayHello(String name);
}
