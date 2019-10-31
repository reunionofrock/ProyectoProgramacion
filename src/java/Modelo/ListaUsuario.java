/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;



/**
 *
 * @author reuni
 */
public class ListaUsuario {
    
    public class usuario
    {
        String nombre;
        String pass;
        usuario siguiente;

        private usuario(String nombre, String pass) {
            this.nombre = nombre;
            this.pass = pass;
        }
        
    }
    
    private usuario raiz;
    
    public ListaUsuario()
    {
        raiz = null;
    }
    public void insertar(String nombre, String pass){
        usuario temp= new usuario(nombre,pass);
        if (raiz == null){
            raiz=temp;
        }
        else{
            usuario temp2 = raiz;
            while (temp2.siguiente!= null){
                temp2=temp2.siguiente;
            }
            temp2.siguiente = temp;
        }
    }
    
    public void verElementos()
    {
        
        usuario aux;
        aux = raiz;
        while(null != aux)
        {
            //JOptionPane.showMessageDialog(null, "Valor del elemento " + aux.nombre, "valor elemento ", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(aux.nombre);
            aux = aux.siguiente;
        }
        
        
        
        
    }
    
    
    
    
    /*private Lista pInicio;
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
            
            
        }
        
        
        /*else{
            if (nuevo.getUsuario()!=pInicio.getUsuario() && nuevo.getContraseña()!=pInicio.getContraseña() ){
                nuevo.setSiguiente(pInicio);
                pInicio = nuevo;
            }
            else{
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
    }*/
    
}
