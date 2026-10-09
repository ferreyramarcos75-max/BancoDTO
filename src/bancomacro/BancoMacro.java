/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancomacro;

/**
 *
 * @author marquitos
 */
public class BancoMacro {

    public static ClienteDTO convertirADTO (Cliente cli) {
      
        
        return new ClienteDTO (cli.getNombre(), cli.getApellido(), cli.getDni());
        
         
       
    }
    
     public static CuentaDTO convertirADTO (Cuenta cuen) {
         return new CuentaDTO(cuen.getNrocuenta());
         
         
     }
      
    
    public static void main(String[] args) {
     
        Cliente cli = new Cliente(67L, "Joel", "DeGabilan", "4344523", "pws22dwd");
        ClienteDTO cliDTO = convertirADTO(cli);
        RespestaDTO<ClienteDTO> respuesta = new RespestaDTO<>(true, "exito", cliDTO);
        
        
        Cuenta cuen = new Cuenta(55544455445L, "3223223232134342", "40000", "joelselacomeqqqq");
        CuentaDTO cuentDTO = convertirADTO(cuen);
         RespestaDTO<CuentaDTO> respuest = new RespestaDTO<>(true,"exito",cuentDTO);
        
       
       
    }
    
}
