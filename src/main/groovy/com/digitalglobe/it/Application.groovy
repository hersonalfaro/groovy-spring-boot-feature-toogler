package com.digitalglobe.it
 
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.annotation.ComponentScan
 
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.digitalglobe.it.mvc")
class Application {
    static main(args) {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .bannerMode(Banner.Mode.OFF)
                .run()
    }
}
