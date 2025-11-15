package Others;

public class Diary {
   private String lastEntry;
   private String entry;
   private String readEntry;
   private int exit=3;

   public String writeEntry(){
return lastEntry;
       //public String readEntry(){
           //return entry;

   }


      /*
  You are to build a diary app that behaves like a simple text-based application
  The program should have a main menu that keep showing until the user chooses to exit.

  Program Requirements:
  1. The app should keep running in a loop until the user chooses to exit.(Hint: use a while or do...while loop)
  2. The user can:
  * Write a new entry - The app should ask the user to type their dairy entry and save it
  * View last entry - The app should display the most recent saved entry
  * Exit - The app should display a goodbye message and stop running
  3. If there's no diary entry yet, and the user chooses "View last entry", show a message "No entry found".
  4. The app should have at least two classes:
   * DiaryApp.java  - contains the main method and the menu logic
   * Diary.java - contains methods for writing and reading entries
   5. You can only save one diary entry for now (no array or lists yet).
   if a new entry is written, it replaces the previous one.

   Hints:
   * Use Scanner to collect user input.
   * Use a boolean variable to control your loop (while(running){...}).
   * Inside your Diary class, create:
   A String variable (e.g. lastEntry) to hold the diary text.
   A method writeEntry(String entry) to save a new entry.
   A method readEntry() to return the saved entry.
   Use if ...else or switch statements for menu options.

   */


}
