package florian.week_13_File;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen,
Dateien nach Größe absteigend
 */

import java.io.File;


public class Stream_4_FileStructure {

    public static void main(String[] args) {

        File file = new File("./src/florian");
        System.out.println(file.getName());

        listdir(file,1);
    }


   public static void listdir (File dir, int lvl){

        File [] filearray = dir.listFiles();
        String filesymbol = " +";
        boolean variable =false;
        File sort;

       for (int i = 0; i < filearray.length; i++) {
           for (int j = i + 1; j < filearray.length; j++) {
               if (variable == filearray[i].length() < filearray[j].length()) {
                   sort = filearray[i];
                   filearray[i] = filearray[j];
                   filearray[j] = sort;
               } else if (!variable == filearray[i].length() > filearray[j].length()) {
                   sort = filearray[i];
                   filearray[i] = filearray[j];
                   filearray[j] = sort;

               }
           }

       } for (int i = 0; i < filearray.length; i++) {
           System.out.print(" ".repeat(lvl));

           if (filearray[i].isDirectory()){
               System.out.println(filearray[i].getName());
               listdir(filearray[i],lvl + 1);
           }
           else if (filearray[i].getName().charAt(0) != '.') {
               System.out.println(filesymbol + " " + filearray[i].getName() + " " + filearray[i].length());
           }
       }

    }
        
        

}