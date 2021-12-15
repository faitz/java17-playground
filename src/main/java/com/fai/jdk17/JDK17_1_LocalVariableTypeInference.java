package com.fai.jdk17;

import com.fai.jdk17.domain.Customer;

import java.util.ArrayList;
import java.util.List;

public class JDK17_1_LocalVariableTypeInference {

    static {
        var number = 10;
    }

    public static void main(String[] args) {
        JDK17_2_Records.CustomerRecord c = new JDK17_2_Records.CustomerRecord("John", "Earth");
    }


   public void varAfter() {

       var customers = new ArrayList<Customer>();

       //var in foreach
       for (var customer : customers) {

       }

       for (var i = 0; i < 10; i++) {

       }



   }


   public void doSomething(){

   }


}
