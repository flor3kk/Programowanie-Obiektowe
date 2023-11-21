package programowanie_rok2_lab1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Studenci {

    static List<Student> lista = new LinkedList<>();

    public void menu() throws Exception {
        while (true){

            System.out.println("dodawanie studentow: (1) ");
            System.out.println("usuwanie studentow po imieniu i nazwisku: (2) ");
            System.out.println("usuwanie studentow po nr albumu: (3) ");
            System.out.println("show student info po nr albumu: (4) ");
            System.out.println("pokaz studentow o wyzszym nr albumu: (5) ");
            System.out.println("wprowadz zmiany studentow: (6) ");
            System.out.println("pokaz wszystkich studentow: (7) ");
            System.out.println("zakoncz: (8) ");

            int choice = input();

            switch (choice){
                case 1 -> addStudent();
                case 2 -> removeStudentImie();
                case 3 -> removeStudentNr();
                case 4 -> showStudentInfo();
                case 5 -> showHigher();
                case 6 -> studentChange();
                case 7 -> show();
                case 8 -> close();

            }
        }
    }

    public static void addStudent(){
        System.out.print("podaj imie: ");
        String imie = inpStr();

        System.out.print("podaj nazwisko: ");
        String nazwisko = inpStr();

        System.out.print("podaj nr albumu: ");
        int nr_alb = input();

        String action = "dodano " + imie + " " + nazwisko  + " " + nr_alb + " do studentow";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("zapis.txt", true))) {
                    writer.write(action);
                    writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        lista.add(new Student(imie, nazwisko, nr_alb));
    }

    public static void removeStudentImie() throws Exception {
        System.out.print("podaj imie studenta: ");
        String imie = inpStr();
        System.out.print("podaj nazwisko studenta: ");
        String nazwisko = inpStr();

        try{
            for (Student student: lista){
                if (student.getImie().equals(imie) && student.getNazwisko().equals(nazwisko)){
                    lista.remove(student);
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage() + "nie znaleziono takiego studenta");
        }

    }


    public static void studentChange(){
        System.out.print("podaj nr albumu studenta do zmiany: ");
        int nr_alb = input();

        for(Student student : lista){
            if (student.getNr_albumu() == nr_alb){
                System.out.print("podaj nowe imie: ");
                String imie = inpStr();
                student.setImie(imie);

                System.out.print("podaj nowe naziwsko: ");
                String nazwisko = inpStr();
                student.setNazwisko(nazwisko);
                break;
            }
        }
        System.out.println("brak studenta o takim numerze albumu");
    }

    public static void removeStudentNr(){
        System.out.print("podaj nr albumu studenta ktorego chcesz usunac: ");
        int nr_album = input();
        Student studentRemove = null;
        for (Student student: lista){
            if (student.getNr_albumu() == nr_album){
                studentRemove = student;
            }
        }

        if (studentRemove == null){
            throw new IllegalArgumentException("nie znaleziono studenta");
        }
        else {
            lista.remove(studentRemove);
            System.out.println("poprawnie usunieto studenta o nr albumu: " + nr_album + ", jego imie to: " + studentRemove.getImie());
        }
    }

    public static void showStudentInfo(){
        System.out.print("podaj nr albumu studenta ktorego chcesz zobaczyc: ");
        int nr_album = input();
        Student studentShow = null;
        for (Student student: lista){
            if (student.getNr_albumu() == nr_album){
                studentShow = student;
            }
        }

        if (studentShow == null){
            throw new IllegalArgumentException("nie znaleziono studenta o takim numerze albumu: " + nr_album);
        }
        else System.out.println(studentShow.toString());
    }

    public static void showHigher(){
        System.out.println("podaj nr albumu: ");
        int nr_album = input();
        for (Student student: lista){
            if (student.getNr_albumu() > nr_album){
                System.out.println(student.toString());;
            }
            else continue;
        }
    }

    public static void show(){
        for (Student el: lista){
            System.out.println(el.toString());
        }
    }
    public static String inpStr(){
        Scanner skan = new Scanner(System.in);
        return skan.next();
    }

    public static int input(){
        Scanner skan = new Scanner(System.in);
        return skan.nextInt();
    }

    public static void close(){
        System.exit(0);
    }

}
