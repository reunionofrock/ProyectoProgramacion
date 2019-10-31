/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;




/**
 *
 * @author reuni
 */
public class ListaUsuario {
    
    private Lista pInicio;
    private Lista pFin;
    int cElementos;
    
      
    public ListaUsuario(){
        pInicio = null;
        pFin  = null;
        cElementos = 0;
    }
    
    // Pila Vacia
    public boolean estaVacia(){
        return pInicio == null;
    }
   
     // PUSH
    public void push(String nombre, String contraseña){
        Lista nuevo = new Lista(nombre, contraseña);
        if(pInicio == null){
            pInicio = nuevo;
            pFin    = nuevo;
        }else{
            if (nuevo.getUsuario()!=pInicio.getUsuario() && nuevo.getContraseña()!=pInicio.getContraseña() ){
                nuevo.setSiguiente(pInicio);
                pInicio = nuevo;
            }else{
                if (nuevo.getUsuario()==pInicio.getUsuario() && nuevo.getContraseña()==pInicio.getContraseña()){
                    pFin.setSiguiente(nuevo);
                    pFin = nuevo;
                }
            }
        }
        cElementos++;
    }


//pop

  public Lista pop(){
        Lista auxiliar = pInicio;
        pInicio = pInicio.getSiguiente();
        auxiliar.setSiguiente(null);
        cElementos--;
        return auxiliar;
    }
        
        
        
    }
    
    
    
    
    

