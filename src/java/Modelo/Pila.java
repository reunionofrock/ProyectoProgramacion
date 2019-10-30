
package Modelo;

public class Pila{
    
    private PilaEstudiante pRaiz;
    int cElementos;
    
    public Pila(){
    pRaiz = null;
    cElementos = 0;
    
}

    public Pila(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     // Pila Vacia
    public boolean estaVacia(){
        return pRaiz == null;
    }
    
     public void push(String nombre, String carnet, String born){
        PilaEstudiante nuevo = new PilaEstudiante(nombre, carnet, born);
        nuevo.setSiguiente(pRaiz);
        pRaiz = nuevo;
        cElementos++;
    }
    
    //POP
    public PilaEstudiante pop(){
        PilaEstudiante auxiliar = pRaiz;
        pRaiz = pRaiz.getSiguiente();
        auxiliar.setSiguiente(null);
        cElementos--;
        return auxiliar;
    }

    public String getNumero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pila getSiguiente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
