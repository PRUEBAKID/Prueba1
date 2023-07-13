 
package principalventatiquetes;
 
import javax.swing.JOptionPane;

public class Venta {
    private int codPelicula;
    private String idPersona;
    private float costoTiquete;
    
    public Venta() {
    }

    public int getCodPelicula() {
        return codPelicula;
    }

    public void setCodPelicula(int codPelicula) {
        this.codPelicula = codPelicula;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public float getCostoTiquete() {
        return costoTiquete;
    }

    public void setCostoTiquete(float costoTiquete) {
        this.costoTiquete = costoTiquete;
    }
    
    public void ventaTiquetes (Cliente vCliente[], Pelicula vPelicula[],Venta vVenta[], int I, int canCli){
        Cliente objCliente = new Cliente();
        Pelicula objPelicula = new Pelicula();
        String idPer= JOptionPane.showInputDialog("Digite identificación del cliente");
        if(objCliente.buscaCliente(vCliente, idPer, canCli)==false){
            System.out.println("Cliente no registrado");
            //agregar cliente
        }
        else{ 
            int codPel = Integer.parseInt(JOptionPane.showInputDialog("Digite código de la película"));
            if(objPelicula.buscaPelicula(vPelicula, codPel)==false)
                System.out.println("Película no existe.");
            else{
                vVenta[I]= new Venta();
                vVenta[I].setCodPelicula(codPel);
                vVenta[I].setIdPersona(idPer);
                vVenta[I].setCostoTiquete(Float.parseFloat(JOptionPane.showInputDialog("Digite el costo del tiquete")));
            }                
        }    
    }
    
    public void imprimeTiquetes(Cliente vCliente[], Pelicula vPelicula[],Venta vVenta[], int X, int cantCliente){       
        Cliente objCliente = new Cliente();
        Pelicula objPelicula = new Pelicula();        
        for(int I=0; I<X; I++){
            String id =vVenta[I].getIdPersona();
            objCliente.imprimeClienteEspecifico(vCliente, id, cantCliente);
            int cod = vVenta[I].getCodPelicula();
            objPelicula.imprimePeliculaEspecifica(vPelicula, cod);            
            System.out.println("Costo tiquete "+ vVenta[I].getCostoTiquete());
        }
    }
    
}
