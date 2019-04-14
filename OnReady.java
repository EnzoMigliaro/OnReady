/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onready;







/**
 *
 * @author notebook
 */
public class OnReady {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      Honda moto1 = new Honda();
      Peugeot auto1 = new Peugeot();
      Peugeot208 auto2 = new Peugeot208();
      Yamaha moto2 = new Yamaha();
      
        System.out.println("Marca:"+auto1.marcaP206+ "// Modelo:"+auto1.marcaP206+" // Puertas:" +auto1.puertasP206+"// Precio:"+ auto1.precioPP206);
        System.out.println("Marca:"+ moto1.marcaH+ " // Modelo:"+moto1.modeloH+" // Cilindrada:"+moto1.cilindradasH+" // Precio:"+moto1.precioHH);
        System.out.println("Marca:"+ auto2.marcaP+" // Modelo:" + auto2.modeloP+" // Puertas:"+auto2.puertasP+ " // Precio:" + auto2.precioPP);
        System.out.println("Marca:"+ moto2.marcaY+" // Modelo:" +moto2.modeloY+" // Cilindrada:"+ moto2.cilindradasY+"// Precio:"+ moto2.precioY);
    
        if (auto2.precioP > auto1.precioP206) {
            
            
                
                if (auto2.precioP > moto2.precioYY) {
                    
                    if (auto2.precioP > moto1.precioH) {
                        
                        System.out.println("Vehiculo mas caro:"+ auto2.marcaP+ auto2.modeloP);
                        
                        
                    }
                    
                    
                }
                
                
            }
            
            if (moto1.precioH< auto2.precioP) {
                if (moto1.precioH < auto1.precioP206) {
                    if (moto1.precioH < moto2.precioYY) {
                        System.out.println("Vehiculo mas barato:" + moto1.marcaH +  moto1.modeloH);
                        
                    }
                    
                }
                
            }
        
            
            switch("Y"){
                case "Y" : System.out.println("Vehículo que contiene en el modelo la letra ‘Y’:" + moto2.marcaY  +   moto2.modeloY + " Precio:" +   moto2.precioY);
                break;
                
            
            }
        
        }
    
    
      
        
   
   

            
            
        
        
        
    }

