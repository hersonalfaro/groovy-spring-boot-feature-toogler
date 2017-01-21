package com.digitalglobe.it.mvc

import org.ff4j.FF4j
import org.ff4j.core.Feature
import org.ff4j.core.FeatureStore

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
/*

<bean id="ff4j" class="org.ff4j.FF4j" >
 <property name="store" ref="ff4j.store.inmemory" />
</bean>

<bean id="ff4j.store.inmemory" class="org.ff4j.store.InMemoryFeatureStore" > 
 <property name="location" value="ff4j.xml" />
</bean>
*/


@Configuration
class Ff4jConfiguration {
    @Bean
    def ff4j() {
        ff4jLocal =  new FF4j("ff4j-demo-aop.xml") ;
    	return ff4jLocal;
    }
    
     
    /*@Bean
    public FF4j ff4j() {
    	FF4j ff4j =  new FF4j("ff4j-demo-aop.xml") ;
    	return ff4j;
    }*/

}
