/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancomacro;

/**
 *
 * @author marquitos
 */
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
