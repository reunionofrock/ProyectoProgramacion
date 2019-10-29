///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Modelo;
//
///**
// *
// * @author reuni
// */
//    
//public class Pila {
//    private PilaEstudiantes pRaiz;
//    String nombre;
//    String carnet;
//    String fecha_nacimiento;
//    
//    
//
//    
//    public Pila(){
//        pRaiz = null;
//        String nombre;
//        String carnet;
//        String fecha_nacimiento;
//    
//    }
//    
//    // Pila Vacia
//    public boolean estaVacia(){
//        return pRaiz == null;
//    }
//    
//    // PUSH
//    public void push(String nombre, String carnet, String fecha_nacimiento){
//        PilaEstudiantes nuevo = new PilaEstudiantes(nombre, carnet, fecha_nacimiento);
//        nuevo.setSuguiente(pRaiz);
//        pRaiz = nuevo;
//        //cElementos++;
//    }
//    
//    //POP
//    public int pop(){
//        PilaEstudiantes auxiliar = pRaiz;
//        auxiliar.setSuguiente(null);
//        //terminar pop
//    }
//    
//    //Valor Raiz
//    public int valorRaiz(){
//        return pRaiz.getDato();
//    }
//    
//    //Tamaño de Pila
////    public int cantidadElementos(){
////        return cElementos;
////    }
//    
//    //Limpiar la Pila
//    public void limpiarPila(){
//        while(!estaVacia()){
//            pop();
//        }
//    }
//    
////    public void verElementos(){
////       PilaEstudiantes aux;
////       aux = pRaiz;
////       while(null!=aux){
////          JOptionPane.showMessageDialog(null, "Valor del elemento " + aux.getDato(), "Valor Elemento", JOptionPane.INFORMATION_MESSAGE); 
////           aux = aux.getSuguiente();
////       }
////    }
//}
//
