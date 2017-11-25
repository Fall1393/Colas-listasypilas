import java.util.ArrayList;
public class pila {
    public static void main (String[]arg){
        System.out.println("*****Pila*****");
        Pila pila = new Pila();
        pila.pilar("A");
        pila.pilar("B");
        pila.pilar("C");
        pila.pilar("D");
        pila.pilar("E");

        System.out.println("Esta vacia la pila?: " + pila.vacia());
        System.out.println("Tamaño de la pila: " + pila.size());

        System.out.println(pila.cima());
        pila.sipila();
        System.out.println(pila.cima());
        pila.sipila();
        System.out.println(pila.cima());
        pila.sipila();
        System.out.println(pila.cima());
        pila.sipila();
        System.out.println(pila.cima());
        pila.sipila();

        System.out.println("Esta vacia la pila?: " + pila.vacia());


    }

    public static class Pila extends ArrayList{

        //se añade un elemento a la pila.(push)
        public void pilar(Object dato){
            if(dato != null){
                this.add(dato);
            }else{
                System.out.println("Introduzca un dato no nulo");
            }
        }

        //se elimina el elemento frontal de la pila.(pop)
        public void sipila(){
            if(size() > 0){
                this.remove(this.size()-1);
            }
        }

        //devuelve el elemento que esta en la cima de la pila. (top o peek)
        public Object cima(){
            Object datoAuxiliar = null;
            if(this.size() > 0){
                datoAuxiliar = this.get(this.size()-1);
            }
            return datoAuxiliar;
        }

        //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
        public boolean vacia(){
            return this.isEmpty();
        }
    }
}
