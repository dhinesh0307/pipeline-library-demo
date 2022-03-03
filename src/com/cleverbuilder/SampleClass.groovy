#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }
   
   String envi(String env){
   
      if(env.equals("prod")){
       return "yes"  
      }
      else
      {
       return "no"  
      }
   }
   
}
