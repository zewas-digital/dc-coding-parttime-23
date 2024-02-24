package Matthias.week17_objects.Wiederholung;

import java.util.ArrayList;

public class week17_list {

   public static void main(String args[]) {

       //create Array
       String[] attendees = new String[4];
       //String[] attendees = {"Michael", "Mathias", "Claudia", Simon"};

       //specify values
       attendees[0] = "Michael";
       attendees[1] = "Mathias";
       attendees[2] = "Claudia";
       attendees[3] = "Simon";


       //get attendee at index
       System.out.println(attendees[2]);

       //print
       for (int i = 0; i < attendees.length; i++) {
           System.out.println(attendees[i]);
       }

       //get length
       System.out.println("Anzahl der Teilnehmer: " + attendees.length);

       //create
       ArrayList<String> attendeesArrayList = new ArrayList<>();
       //ArrayList<String> attendeesArrayList = new ArrayList<>(Arrays.asList("Michael", "Mathias", "Claudia", "Simon"));

       //add elements
       attendeesArrayList.add("Michael"); //0
       attendeesArrayList.add("Mathias"); //1
       attendeesArrayList.add("Claudia"); //2
       attendeesArrayList.add("Simon"); //3

       //get attendee at index
       System.out.println(attendeesArrayList.get(2));

       //print
       for (String s : attendeesArrayList) {
           System.out.println(s);
       }

       //get length
       System.out.println("Anzahl der Teilnehmer: " + attendeesArrayList.size());
   }



}
