package org.satya.springbootmonitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/monitor")
    public String monitor(){

        // for high cpu alert notification
        /*try{
            boolean condition = true;
            while(condition){
                Runnable r = () ->{
                    while(true){}
                };
                new Thread(r).start();
            }
        }catch (Exception e){}*/

        return "Hello World!";
    }
}
