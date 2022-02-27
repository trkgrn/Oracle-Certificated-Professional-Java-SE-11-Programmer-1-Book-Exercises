package com.company.chapter7;

 public class Gorilla {
 public static int count;
 public static void addGorilla() { count++; }
 public void babyGorilla() { count++; }
 public void announceBabies() {
         addGorilla();
         babyGorilla();
         }
 public static void announceBabiesToEveryone() {
         addGorilla();
      //   babyGorilla(); // DOES NOT COMPILE - required of instance
         }
     public int total;
// public static double average = total / count; // DOES NOT COMPILE

     public Gorilla()
     {
         addGorilla();
     }


 }