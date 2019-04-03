package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Arrays;
import java.util.Random;

//import java.util.Scanner;

public class Controller {

    @FXML
    private Button lotek;


    public Controller() {
        System.out.println("Jestem wspaniały");
    }

    @FXML
    void initialize() {
        lotek.setText("Big Lotek");
    }

    @FXML
    private void OnActionlotek() {
        System.out.println();
        System.out.println("Lotek będzie sie losował przez OnActionButton");
        //System.out.println();
        Random rand = new Random();
        //Scanner sc = new Scanner(System.in);
        int[] tab = new int[7];
        int kulka, jakpadla, liczbapadla, ilosc, licznik;

        //System.out.println("Cześć Ile zestawów dużego lotka masz zamiar wylosować");
        // ilosc = sc.nextInt();
        //sprawdz=0;
        //for (licznik = 1; licznik <= ilosc; licznik++) {
        for (kulka = 0; kulka < 6; kulka++) {
            tab[kulka] = rand.nextInt(49 + 1);
            liczbapadla = -1;

            for (jakpadla = 0; jakpadla < kulka; jakpadla++) {
                //tab[jakpadla] = rand.nextInt(49 + 1) + 1;

                //sprawdz= kulka -1;
                if (tab[kulka - 1] == tab[kulka]) liczbapadla = 5;

                //a= kulka -2;
                //if (tab[2] == tab[4]) liczbapadla = 5;
                //if (tab[3] == tab[2]) liczbapadla = 5;
                //if (tab[4] == tab[2]) liczbapadla = 5;
                //if (tab[5] == tab[2]) liczbapadla = 5;
                //if (tab[6] == tab[2]) liczbapadla = 5;

                // a= kulka -3;
                //if (tab[a] == tab[kulka]) liczbapadla = 1;

                //a=

                if (liczbapadla > 0) kulka--;
                //else tab[kulka] = tab[jakpadla];
            }
        }
        System.out.print("Los Dużego Lotka:   ");
        for (kulka = 0; kulka < 6; kulka++) {
            System.out.print(tab[kulka] + " ");
        }

        //System.out.println();
            /*for (kulka = 0; kulka < 6; kulka++) {
                System.out.print(tab[kulka] + " ");
            }*/


    }

    @FXML
    private void OnActionlotek1() {
        System.out.println();
        System.out.println("Lotek będzie sie losował przez OnActionButton1");
        Random rand = new Random();
        //Scanner sc = new Scanner(System.in);
        int[] tab = new int[11];
        int kulka, jakpadla, liczbapadla, ilosc, licznik;

        for (kulka = 0; kulka < 10; kulka++) {
            tab[kulka] = rand.nextInt(80 + 1);
            liczbapadla = -1;

            for (jakpadla = 0; jakpadla < kulka; jakpadla++) {

                if (tab[kulka - 1] == tab[kulka]) liczbapadla = 5;

                if (liczbapadla > 0) kulka--;
                //else tab[kulka] = tab[jakpadla];
            }
        }
        System.out.print("Los Multi Lotka:   ");
        for (kulka = 0; kulka < 10; kulka++) {
            System.out.print(tab[kulka] + " ");
        }
    }

    @FXML
    private void OnActionlotek2() {
        System.out.println();
        System.out.println("Lotek będzie sie losował przez OnActionButton2");
        Random rand = new Random();
        //Scanner sc = new Scanner(System.in);
        int[] tab = new int[6];
        int kulka, jakpadla, liczbapadla, ilosc, licznik;

        //System.out.println("Cześć Ile zestawów dużego lotka masz zamiar wylosować");
        // ilosc = sc.nextInt();
        //sprawdz=0;
        //for (licznik = 1; licznik <= ilosc; licznik++) {
        for (kulka = 0; kulka < 5; kulka++) {
            tab[kulka] = rand.nextInt(42 + 1);
            liczbapadla = -1;

            for (jakpadla = 0; jakpadla < kulka; jakpadla++) {
                //tab[jakpadla] = rand.nextInt(49 + 1) + 1;

                //sprawdz= kulka -1;
                if (tab[kulka - 1] == tab[kulka]) liczbapadla = 5;

                //a= kulka -2;
                //if (tab[2] == tab[4]) liczbapadla = 5;
                //if (tab[3] == tab[2]) liczbapadla = 5;
                //if (tab[4] == tab[2]) liczbapadla = 5;
                //if (tab[5] == tab[2]) liczbapadla = 5;
                //if (tab[6] == tab[2]) liczbapadla = 5;

                // a= kulka -3;
                //if (tab[a] == tab[kulka]) liczbapadla = 1;

                //a=

                if (liczbapadla > 0) kulka--;
                //else tab[kulka] = tab[jakpadla];
            }
        }
        System.out.print("Los Ekspress Lotka:   ");
        for (kulka = 0; kulka < 5; kulka++) {
            System.out.print(tab[kulka] + " ");
        }

        //System.out.println();
            /*for (kulka = 0; kulka < 6; kulka++) {
                System.out.print(tab[kulka] + " ");
            }*/


    }

    @FXML
    private Sphere kula;

    @FXML
    private void OnMouseEnteredKula() {
        kula.setRadius(54);
        //kula1.setRadius(54);
        //kula2.setRadius(54);

    }

    @FXML
    private void OnMouseClickedKula(){
        System.out.println("Kula środkowa na OnMouseClickedKula");
        AudioClip note = new AudioClip(this.getClass().getResource("sample.wav").toString());
        note.play();
    }

    @FXML
    private void PlayAudio(){
        AudioClip note = new AudioClip(this.getClass().getResource("sample.wav").toString());
        note.play();

    }

    @FXML
    private void OnMouseExitedKula() {
        kula.setRadius(50);
        //kula1.setRadius(50);
        //kula2.setRadius(50);
    }

    @FXML
    private Sphere kula1;

    @FXML
    private void OnMouseEnteredKula1() {
        //kula.setRadius(54);
        kula1.setRadius(54);
        //kula2.setRadius(54);

    }

    @FXML
    private void OnMouseClickedKula1(){
        System.out.println("Kula lewa na OnMouseClickedKula1");
        AudioClip note = new AudioClip(this.getClass().getResource("sample.wav").toString());
        note.play();
    }

    @FXML
    private void OnMouseExitedKula1() {
        //kula.setRadius(50);
        kula1.setRadius(50);
        //kula2.setRadius(50);
    }

    @FXML
    private Sphere kula2;

    @FXML
    private void OnMouseEnteredKula2() {
        //kula.setRadius(54);
        //kula1.setRadius(54);
        kula2.setRadius(54);

    }

    @FXML
    private void OnMouseClickedKula2(){
        System.out.println("Kula prawa na OnMouseClickedKula2");
        AudioClip note = new AudioClip(this.getClass().getResource("sample.wav").toString());
        note.play();
    }

    @FXML
    private void OnMouseExitedKula2() {
        //kula.setRadius(50);
        //kula1.setRadius(50);
        kula2.setRadius(50);
    }

}
