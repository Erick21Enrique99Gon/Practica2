/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;


import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JLabel;


public class Mover extends Thread{
    /*JLabel bicho;

    static Juego vtn;

    public Mover(Juego vtn) {
        this.vtn = vtn;
    }
    static int asd;
    public void run() {
        int posx = vtn.bicho1.getX();
        int posy = vtn.bicho1.getY();
        int posx1 = vtn.bicho2.getX();
        int posy1 = vtn.bicho2.getY();
        int posx2 = vtn.bicho3.getX();
        int posy2 = vtn.bicho3.getY();
        int posx3 = vtn.bicho4.getX();
        int posy3 = vtn.bicho4.getY();
        int posx4 = vtn.bicho5.getX();
        int posy4 = vtn.bicho5.getY();
        int posx5 = vtn.bicho6.getX();
        int posy5 = vtn.bicho6.getY();
        int posx6 = vtn.bicho7.getX();
        int posy6 = vtn.bicho7.getY();
        int posx7 = vtn.bicho8.getX();
        int posy7 = vtn.bicho8.getY();
        ////////////////////////////////
        int posx11 = vtn.bicho11.getX();
        int posy11 = vtn.bicho11.getY();
        int posx12=  vtn.bicho12.getX();
        int posy12 = vtn.bicho12.getY();
        int posx13 = vtn.bicho13.getX();
        int posy13 = vtn.bicho13.getY();
        int posx14 = vtn.bicho14.getX();
        int posy14 = vtn.bicho14.getY();
        int posx15 = vtn.bicho15.getX();
        int posy15 = vtn.bicho15.getY();
        int posx16 = vtn.bicho16.getX();
        int posy16 = vtn.bicho16.getY();
        int posx17 = vtn.bicho17.getX();
        int posy17 = vtn.bicho17.getY();
        int posx18 = vtn.bicho18.getX();
        int posy18 = vtn.bicho18.getY();
        ////////////////////////////////
        int posx21 = vtn.bicho21.getX();
        int posy21 = vtn.bicho21.getY();
        int posx22=  vtn.bicho22.getX();
        int posy22 = vtn.bicho22.getY();
        int posx23 = vtn.bicho23.getX();
        int posy23 = vtn.bicho23.getY();
        int posx24 = vtn.bicho24.getX();
        int posy24 = vtn.bicho24.getY();
        int posx25 = vtn.bicho25.getX();
        int posy25 = vtn.bicho25.getY();
        int posx26 = vtn.bicho26.getX();
        int posy26 = vtn.bicho26.getY();
        int posx27 = vtn.bicho27.getX();
        int posy27 = vtn.bicho27.getY();
        int posx28 = vtn.bicho28.getX();
        int posy28 = vtn.bicho28.getY();
        ////////////////////////////////
        int posx31 = vtn.bicho31.getX();
        int posy31 = vtn.bicho31.getY();
        int posx32=  vtn.bicho32.getX();
        int posy32 = vtn.bicho32.getY();
        int posx33 = vtn.bicho33.getX();
        int posy33 = vtn.bicho33.getY();
        int posx34 = vtn.bicho34.getX();
        int posy34 = vtn.bicho34.getY();
        int posx35 = vtn.bicho35.getX();
        int posy35 = vtn.bicho35.getY();
        int posx36 = vtn.bicho36.getX();
        int posy36 = vtn.bicho36.getY();
        int posx37 = vtn.bicho37.getX();
        int posy37 = vtn.bicho37.getY();
        int posx38 = vtn.bicho38.getX();
        int posy38 = vtn.bicho38.getY();
        ////////////////////////////////
        int posx41 = vtn.bicho41.getX();
        int posy41 = vtn.bicho41.getY();
        int posx42=  vtn.bicho42.getX();
        int posy42 = vtn.bicho42.getY();
        int posx43 = vtn.bicho43.getX();
        int posy43 = vtn.bicho43.getY();
        int posx44 = vtn.bicho44.getX();
        int posy44 = vtn.bicho44.getY();
        int posx45 = vtn.bicho45.getX();
        int posy45 = vtn.bicho45.getY();
        int posx46 = vtn.bicho46.getX();
        int posy46 = vtn.bicho46.getY();
        int posx47 = vtn.bicho47.getX();
        int posy47 = vtn.bicho47.getY();
        int posx48 = vtn.bicho48.getX();
        int posy48 = vtn.bicho48.getY();
        
        try {
            while (true) {
                sleep(200);
                posy += 15;
                posy1 += 15;
                posy2 += 15;
                posy3 += 15;
                posy4 += 15;
                posy5 += 15;
                posy6 += 15;
                posy7 += 15;
                /////////////
                posy11 += 15;
                posy12 += 15;
                posy13 += 15;
                posy14 += 15;
                posy15 += 15;
                posy16 += 15;
                posy17 += 15;
                posy18 += 15;
                //////////////
                posy21 += 15;
                posy22 += 15;
                posy23 += 15;
                posy24 += 15;
                posy25 += 15;
                posy26 += 15;
                posy27 += 15;
                posy28 += 15;
                //////////////
                posy31 += 15;
                posy32 += 15;
                posy33 += 15;
                posy34 += 15;
                posy35 += 15;
                posy36 += 15;
                posy37 += 15;
                posy38 += 15;
                //////////////
                posy41 += 15;
                posy42 += 15;
                posy43 += 15;
                posy44 += 15;
                posy45 += 15;
                posy46 += 15;
                posy47 += 15;
                posy48 += 15;
                //////////////
                
                
                vtn.bicho1.setLocation(vtn.bicho1.getX(),posy);
                vtn.bicho2.setLocation(vtn.bicho2.getX(),posy1);
                vtn.bicho3.setLocation(vtn.bicho3.getX(),posy2);
                vtn.bicho4.setLocation(vtn.bicho4.getX(),posy3);
                vtn.bicho5.setLocation(vtn.bicho5.getX(),posy4);
                vtn.bicho6.setLocation(vtn.bicho6.getX(),posy5);
                vtn.bicho7.setLocation(vtn.bicho7.getX(),posy6);
                vtn.bicho8.setLocation(vtn.bicho8.getX(),posy7);
                ////////////////////////////////////////////////
                vtn.bicho11.setLocation(vtn.bicho11.getX(),posy11);
                vtn.bicho12.setLocation(vtn.bicho12.getX(),posy12);
                vtn.bicho13.setLocation(vtn.bicho13.getX(),posy13);
                vtn.bicho14.setLocation(vtn.bicho14.getX(),posy14);
                vtn.bicho15.setLocation(vtn.bicho15.getX(),posy15);
                vtn.bicho16.setLocation(vtn.bicho16.getX(),posy16);
                vtn.bicho17.setLocation(vtn.bicho17.getX(),posy17);
                vtn.bicho18.setLocation(vtn.bicho18.getX(),posy18);
                ///////////////////////////////////////////////////
                vtn.bicho21.setLocation(vtn.bicho21.getX(),posy21);
                vtn.bicho22.setLocation(vtn.bicho22.getX(),posy22);
                vtn.bicho23.setLocation(vtn.bicho23.getX(),posy23);
                vtn.bicho24.setLocation(vtn.bicho24.getX(),posy24);
                vtn.bicho25.setLocation(vtn.bicho25.getX(),posy25);
                vtn.bicho26.setLocation(vtn.bicho26.getX(),posy26);
                vtn.bicho27.setLocation(vtn.bicho27.getX(),posy27);
                vtn.bicho28.setLocation(vtn.bicho28.getX(),posy28);
                ///////////////////////////////////////////////////
                vtn.bicho31.setLocation(vtn.bicho31.getX(),posy31);
                vtn.bicho32.setLocation(vtn.bicho32.getX(),posy32);
                vtn.bicho33.setLocation(vtn.bicho33.getX(),posy33);
                vtn.bicho34.setLocation(vtn.bicho34.getX(),posy34);
                vtn.bicho35.setLocation(vtn.bicho35.getX(),posy35);
                vtn.bicho36.setLocation(vtn.bicho36.getX(),posy36);
                vtn.bicho37.setLocation(vtn.bicho37.getX(),posy37);
                vtn.bicho38.setLocation(vtn.bicho38.getX(),posy38);
                ///////////////////////////////////////////////////
                vtn.bicho41.setLocation(vtn.bicho41.getX(),posy41);
                vtn.bicho42.setLocation(vtn.bicho42.getX(),posy42);
                vtn.bicho43.setLocation(vtn.bicho43.getX(),posy43);
                vtn.bicho44.setLocation(vtn.bicho44.getX(),posy44);
                vtn.bicho45.setLocation(vtn.bicho45.getX(),posy45);
                vtn.bicho46.setLocation(vtn.bicho46.getX(), posy46);
                vtn.bicho47.setLocation(vtn.bicho47.getX(), posy47);
                vtn.bicho48.setLocation(vtn.bicho48.getX(), posy48);
                ///////////////////////////////////////////////////
                
               */
    

    
    }
