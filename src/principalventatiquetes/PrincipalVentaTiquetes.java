
package principalventatiquetes;

import javax.swing.JOptionPane;


public class PrincipalVentaTiquetes {
    
    public void menu (){
        Cliente vectorCliente[] = new Cliente[3];
        Pelicula vectorPelicula[] = new Pelicula[3];
        Venta vectorVenta[] = new Venta[4];
        
        Cliente objCliente = new Cliente();
        Pelicula objPelicula = new Pelicula();
        Venta objVenta = new Venta();
        
        objPelicula.agregaPelicula(vectorPelicula);
        byte opc=1;
        int i=0, tam=0;
        while (opc>=1 && opc<6){
            opc = Byte.parseByte(JOptionPane.showInputDialog("1.Ingresar cliente\n2.Imprmir cliente\n3.Ver cartelera\n4.Venta tiquetes\n5.Imprime venta\n6.Salir"));
            switch (opc){
                case 1: if(i<vectorCliente.length){
                            objCliente.setIdPersona(JOptionPane.showInputDialog("Digite identificación"));
                            objCliente.setNomPersona(JOptionPane.showInputDialog("Digite nombre"));
                            objCliente.setApePersona(JOptionPane.showInputDialog("Digite apellido"));
                            objCliente.setProvPersona(JOptionPane.showInputDialog("Digite provincia"));
                            char frecuente =JOptionPane.showInputDialog("¿Es cliente frecuente s/n").charAt(0);
                            if(frecuente =='s' || frecuente =='S')
                                objCliente.setClienteFrecuente(true); 
                            else
                                objCliente.setClienteFrecuente(false); 
                            
                            objCliente.agregaCliente(vectorCliente, objCliente.isClienteFrecuente(), objCliente.getIdPersona(), objCliente.getNomPersona(), objCliente.getApePersona(), objCliente.getProvPersona(), i);
                            i++;
                        }
                        else
                            System.out.println("No se pueden ingresar más clientes.");
                break;
                case 2: if(i<=vectorCliente.length)
                            objCliente.imprimeCliente(vectorCliente, i);
                break;
                case 3: objPelicula.imprimePelicula(vectorPelicula);
                break;
                case 4: if(tam <vectorVenta.length){
                            objVenta.ventaTiquetes(vectorCliente, vectorPelicula, vectorVenta, tam, i);
                            tam++;
                        }
                break;
                case 5: if(tam<=vectorVenta.length)
                        objVenta.imprimeTiquetes(vectorCliente, vectorPelicula, vectorVenta, tam, i);
                break;
                default: System.out.println("Saliendo del programa.");
            }//cierra switch
        }//cierra ciclo while
    }//cierra método menú

    public static void main(String[] args) {
        PrincipalVentaTiquetes x = new PrincipalVentaTiquetes();
        x.menu();
    }
    
}
