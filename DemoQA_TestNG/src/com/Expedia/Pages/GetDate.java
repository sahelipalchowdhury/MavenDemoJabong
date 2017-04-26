package com.Expedia.Pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class GetDate {
 
 public static void main(String[] args) {
 
 // Create object of SimpleDateFormat class and decide the format
 DateFormat date1 = new SimpleDateFormat("MM/dd/yyyy ");
 DateFormat date2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
 DateFormat date3 = new SimpleDateFormat("Mon");
 
 //get current date time with Date()
 Date date = new Date();
 
 // Now format the date
 String dateMMDDYY= date1.format(date);
 String dateWithTime=date2.format(date);
 String dateOnlyMonth = date3.format(date);
 
 // Print the Date All Formats
 System.out.println(dateMMDDYY);
 System.out.println(dateWithTime);
 System.out.println(dateOnlyMonth);
 
 }
 
}
