package com.electroapp.electro_app.domain.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class terceros {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id")
    private Tipodocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "eps_id")
    private Eps eps;

    @ManyToOne
    @JoinColumn(name = "arl_id")
    private Arl arl;

    @OneToMany(mappedBy = "tercero")
    private List<empleado> empleados;

    @OneToMany(mappedBy = "tercero")
    private List<proveedor> proveedores;

    @OneToMany(mappedBy = "tercero")
    private List<cliente> clientes;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Tipodocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Tipodocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Eps getEps() {
        return eps;
    }

    public void setEps(Eps eps) {
        this.eps = eps;
    }

    public Arl getArl() {
        return arl;
    }

    public void setArl(Arl arl) {
        this.arl = arl;
    }

    public List<empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<empleado> empleados) {
        this.empleados = empleados;
    }

    public List<proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public List<cliente>getClientes() {
        return clientes;
    }

    public void setClientes(List<cliente> clientes) {
        this.clientes = clientes;
    }
}