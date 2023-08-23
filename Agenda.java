//JHONNY ALVARO TICONA MENDOZA
import java.util.ArrayList;

public class Agenda
{
    private ArrayList<Nota> lista;
    
    
    //CONSTRUCTOR
    
    public Agenda()
    {
        //inicializar la coleccion
        lista = new ArrayList<Nota>();
    }
    
    public void addNota(Nota nota){
        lista.add(nota);
    }
    
    public void listarNotas()
    {
        if(lista.size() > 0)
        {
            //mostrar las notas
            for(Nota item : lista)
            {
                item.mostrar();
            }
            
        }
        else
        {
            System.out.println("-------------------------");
            System.out.println("No hay notas en la agenda");
            System.out.println("-------------------------");
        }
    }
    
    public void contarNotas()
    {
          System.out.println("-------------------------");
          System.out.println("En la agenda existen "+lista.size()+"notas");
          System.out.println("-------------------------");
    }
    
    public void borrarNota(int id)
    {
        int pos = -1;
        boolean flag = false;
        if(lista.size() >0 )
        {
            pos++;
            for (Nota item : lista){
                if(item.getId() == id){
                    flag = true;
                    break;
                }
            }
            if(flag){
                lista.remove(pos);
            }
        }
        System.out.println("-------------------------");
        System.out.println("En la agenda existen "+lista.size()+"notas");
        System.out.println("-------------------------");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}














