
package principalventatiquetes;

import javax.swing.JOptionPane;


public class Pelicula {
    private int codPelicula;
    private String nomPelicula;
    private float duracion;

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Pelicula(int codPelicula, String nomPelicula, float duracion) {
        this.codPelicula = codPelicula;
        this.nomPelicula = nomPelicula;
        this.duracion = duracion;
    }
        
    public Pelicula() {
    }

    public int getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(int codPelicula) {
        this.codPelicula = codPelicula;
    }

    public String getNomPelicula() {
        return nomPelicula;
    }

    public void setNomPelicula(String nomPelicula) {
        this.nomPelicula = nomPelicula;
    }
    
    /*public void agregaPelicula (Pelicula vPelicula[]){
        for(int i=0; i<vPelicula.length; i++){
            vPelicula[i]= new Pelicula();
            vPelicula[i].setCodPelicula(Integer.parseInt(JOptionPane.showInputDialog("Digite código de la película")));
            vPelicula[i].setNomPelicula(JOptionPane.showInputDialog("Digite nombre de la película"));
            vPelicula[i].setDuracion(Float.parseFloat(JOptionPane.showInputDialog("Digite duración de la película")));

        }
    }*/
    public void agregaPelicula (Pelicula vPelicula[]){
        vPelicula[0]= new Pelicula();
        vPelicula[0].setCodPelicula(1);
        vPelicula[0].setNomPelicula("Sirenita");
        vPelicula[0].setDuracion(1.5f);
        vPelicula[1]= new Pelicula();
        vPelicula[1].setCodPelicula(2);
        vPelicula[1].setNomPelicula("Rápidos y furiosos 400");
        vPelicula[1].setDuracion(2.5f);
        vPelicula[2]= new Pelicula();
        vPelicula[2].setCodPelicula(3);
        vPelicula[2].setNomPelicula("La casa del mal");
        vPelicula[2].setDuracion(1.3f);

        
    }
    public void imprimePelicula (Pelicula vPelicula[]){
        for(int i=0; i<vPelicula.length; i++){
            System.out.println("Código de película "+ vPelicula[i].getCodPelicula()); 
            System.out.println("Nombre de película "+ vPelicula[i].getNomPelicula()); 
            System.out.println("Duración de película "+ vPelicula[i].getDuracion()); 
        }
    }
    
    public boolean buscaPelicula (Pelicula vPelicula[], int codPeli){
        for(int i=0; i<vPelicula.length; i++){
            if(vPelicula[i].getCodPelicula()==codPeli){
                i=vPelicula.length;
                return true;
            }
        }//cierra for
        return false;
    }//cierra busca película
    
    public void imprimePeliculaEspecifica (Pelicula vPelicula[], int codPeli){
        for(int i=0; i<vPelicula.length; i++){
            if(vPelicula[i].getCodPelicula()==codPeli){                
                System.out.println("Pelicula: "+ vPelicula[i].getNomPelicula());
                i=vPelicula.length;
            }
        }//cierra for
    }//cierra busca película
       
}
