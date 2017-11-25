import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listas {
    public static void main(String[] args) {
        //primero declaremos un string de almacenamiento de datos
        List listas = new ArrayList();
        List<String> list = new ArrayList<String>();
        //List<String> listas =  new ArrayList<String>();
        //con add agregaremos datos
        listas.add("megan");
        listas.add("drake");
        listas.add("josh");
        listas.add("nicol");
        listas.add("pamela");
        listas.add("sintia");

        //Para consultar la lista se utiliza
        listas.size();
        //Si queremos eliminar determinado elemento
        listas.get(0);
        //listas.remove(0);
        //listas.remove("drake");

        //Ya solo imprimimos los datos
        System.out.println(listas.subList(0, 2));
        //También podemos imprimir de forma individual con for
        for (int i = 0; i <= listas.size() - 1; i++) {
            System.out.println(listas.get(i));
        }
       /* Iterator i = listas.iterator();
        while (i.hasNext())
        {
            System.out.println((i.next()));
        }

        listas.clear();
        listas.isEmpty();
        listas.contains("megan");
        listas.set(1,"drake");
        listas.subList(0,2);*/

    }

        private static abstract class Arraylist implements List {
        }
    }
