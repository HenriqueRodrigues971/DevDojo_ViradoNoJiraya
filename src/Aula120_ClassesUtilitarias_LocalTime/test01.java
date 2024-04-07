package Aula120_ClassesUtilitarias_LocalTime;

import java.time.LocalTime;

public class test01 {
	public static void main(String[] args) {
    LocalTime time = LocalTime.of(15, 37,10);
    LocalTime timeNow = LocalTime.now();
    System.out.println(time);
    System.out.println(timeNow);
    
    System.out.println("---Chamando separadamente---");
    System.out.println(time.getHour());
    System.out.println(time.getMinute());
    System.out.println(time.getSecond());
	
	System.out.println("Chamando meia noite");
	System.out.println(LocalTime.MIDNIGHT);
	System.out.println(LocalTime.MIN);
	System.out.println(LocalTime.MAX);
	}
}
