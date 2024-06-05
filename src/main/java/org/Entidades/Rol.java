package org.Entidades;
import java.util.List;

public class Rol {
    private int Id;
    private String Nombre;
    private int Estado;
    private int Top_Aux;
    private List<Usuario> usuarios;

    public Rol()
    {

    }

    public Rol(int id, String nombre, int estado, int top_Aux, List<Usuario> usuarios) {
        Id = id;
        Nombre = nombre;
        Estado = estado;
        Top_Aux = top_Aux;
        this.usuarios = usuarios;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id)
    {
        Id = id;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String nombre)
    {
        Nombre = nombre;
    }

    public int getEstado()
    {
        return Estado;
    }

    public void setEstado(int estado)
    {
        Estado = estado;
    }

    public int getTop_Aux()
    {
        return Top_Aux;
    }

    public void setTop_Aux(int top_Aux)
    {
        Top_Aux = top_Aux;
    }

    public List<Usuario> getUsuarios()
    {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios)
    {
        this.usuarios = usuarios;
    }

}
