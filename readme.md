# Banco DTO

hicimos este proyecto para aprender DTO

## Main
```` java
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

````


## Cliente.java
``` java
public class Cliente {
    
    private long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String password;

    public Cliente(long id, String nombre, String apellido, String dni, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getPassword() {
        return password;
    }
    
    
    
    
}

````

## ClienteDTO.java

```` java
public class ClienteDTO {
    
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteDTO(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
    
    
}

````
## Cuenta.java
```` java
public class Cuenta {
    
    private Long id;
    private String nrocuenta;
    private String saldo;
    private String password;

    public Cuenta(Long id, String nrocuenta, String saldo, String password) {
        this.id = id;
        this.nrocuenta = nrocuenta;
        this.saldo = saldo;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNrocuenta() {
        return nrocuenta;
    }

    public void setNrocuenta(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}

````
## CuentaDTO.java
````java
public class CuentaDTO {
    
    private String nrocuenta;

    public CuentaDTO(String nrocuenta) {
        this.nrocuenta = nrocuenta;
    }

    public String getNrocuenta() {
        return nrocuenta;
    }

    @Override
    public String toString() {
        return "CuentaDTO{" + "nrocuenta=" + nrocuenta + '}';
    }
    
    
    
}

````
## RespuestaDTO.java
```` java
public class RespestaDTO <T>{
    private boolean exito;
    private String mensaje;
    private T dato;

    public RespestaDTO(boolean exito, String mensaje, T dato) {
        this.exito = exito;
        this.mensaje = mensaje;
        this.dato = dato;
    }

    public boolean isExito() {
        return exito;
    }

    public String getMensaje() {
        return mensaje;
    }

    public T getDato() {
        return dato;
    }
    
    
    
    
}
````