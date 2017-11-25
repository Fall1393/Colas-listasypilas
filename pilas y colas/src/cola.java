import java.util.ArrayList;
public class cola {
    public static class Cola extends ArrayList{
        public static void main(String []args){
            System.out.println("*****Cola*****");
            Cola cola = new Cola();
            cola.concola("A");
            cola.concola("B");
            cola.concola("C");
            cola.concola("D");
            cola.concola("E");

            System.out.println("Esta vacia la cola?: " + cola.vacia());
            System.out.println("Tamaño de la cola: " + cola.size());

            System.out.println(cola.frente());
            cola.sincola();
            System.out.println(cola.frente());
            cola.sincola();
            System.out.println(cola.frente());
            cola.sincola();
            System.out.println(cola.frente());
            cola.sincola();
            System.out.println(cola.frente());
            cola.sincola();
            System.out.println("Esta vacia la cola?: " + cola.vacia());

        }

        //se añade un elemento a la cola. Se añade al final de esta.
        public void concola(Object dato){
            if(dato != null){
                this.add(dato);
            }else{
                System.out.println("Introduzca un dato no nulo");
            }
        }

        //se elimina el elemento frontal de la cola, es decir, el primer elemento que entró.
        public void sincola(){
            if(this.size() > 0){
                this.remove(0);
            }
        }

        //se devuelve el elemento frontal de la cola, es decir, el primer elemento que entró.
        public Object frente(){
            Object datoAuxiliar = null;
            if(this.size() > 0){
                datoAuxiliar = this.get(0);
            }
            return datoAuxiliar;
        }

        //devuelve cierto si la pila está vacía o falso en caso contrario (empty).
        public boolean vacia(){
            return this.isEmpty();
        }
    }

}
