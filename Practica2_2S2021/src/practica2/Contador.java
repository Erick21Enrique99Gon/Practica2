/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

public class Contador extends Thread {
    
    int segundos;
    
    Juego vtn;

    public Contador(Juego vtn) {

        segundos = Integer.parseInt(Configuracion.tiempo);   
        this.vtn = vtn;
    }

      

//    public void run(){
//        try {
//            while (true) {
//                vtn.jLabel5.setText(String.valueOf(segundos));
//                sleep(1000);
//                segundos--;
//                if(segundos == 0){
//                    vtn.move1.stop();
//                    Pantallainicial.fadd.dispose();
//                    this.stop();
//                }
//            }
//        } catch (Exception e) {
//
//        }
//    }
    
}
