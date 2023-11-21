package programowanie_rok2_lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Studenci studenci = new Studenci();
            studenci.menu();
        }
        catch (Exception e){
            e.getMessage();
        }
    }


}

