package principalventatiquetes;

public class Cliente extends Persona{
    private boolean clienteFrecuente;   

    public Cliente(boolean clienteFrecuente, String idPersona, String nomPersona, String apePersona, String provPersona) {
        super(idPersona, nomPersona, apePersona, provPersona);
        this.clienteFrecuente = clienteFrecuente;
    }

    public Cliente( ) {        
    }

    public boolean isClienteFrecuente() {
        return clienteFrecuente;
    }

    public void setClienteFrecuente(boolean clienteFrecuente) {
        this.clienteFrecuente = clienteFrecuente;
    }
    
    public void agregaCliente(Cliente vCliente[], boolean clienteFrecuente, String idPersona, String nomPersona, String apePersona, String provPersona, int i){
        vCliente[i]= new Cliente();
        vCliente[i].setIdPersona(idPersona);
        vCliente[i].setNomPersona(nomPersona);
        vCliente[i].setApePersona(apePersona);
        vCliente[i].setProvPersona(provPersona);
        vCliente[i].setClienteFrecuente(clienteFrecuente);
        System.out.println("Ingreso al cliente "+ i);
    }
    
    public void imprimeCliente (Cliente vCliente[], int x){
        for (int i=0; i<x; i++){
            System.out.println("Id: "+ vCliente[i].getIdPersona() );
            System.out.println("Nombre: "+ vCliente[i].getNomPersona());
            System.out.println("Apellido: "+ vCliente[i].getApePersona());
            System.out.println("Provincia: "+ vCliente[i].getProvPersona());
            if(vCliente[i].isClienteFrecuente()==true)
                System.out.println("Es cliente frecuente.");
            else
                System.out.println("No es cliente frecuente.");                       
        }
    }//cerra método imprimeCliente  
    
    public boolean buscaCliente (Cliente vCliente[], String idCliente, int cantCliente){
        for(int i=0; i<cantCliente; i++){
            if(vCliente[i].getIdPersona().equalsIgnoreCase(idCliente)){
                i=vCliente.length;
                return true;
            }
        }//cierra for
        return false;
    }//cierra busca película
    
    public void imprimeClienteEspecifico (Cliente vCliente[], String idCliente, int cantCliente){
        for(int i=0; i<cantCliente; i++){
            if(vCliente[i].getIdPersona().equalsIgnoreCase(idCliente)){          
                System.out.println(vCliente[i].getNomPersona()+" "+vCliente[i].getApePersona());
                System.out.println(vCliente[i].getProvPersona());
                i=vCliente.length;
            }
        }//cierra for       
    }//cierra busca película
}//Cierra clase
