package org.Entidades;
import java.util.List;

public class Grupo {
    private int IdGrupo;
    private  String Carrera;
    private int NGrupo;
    private String Docente;
    private int Estado;
    private int Top_Aux;
    private List<Usuario> usuarios;

    public Grupo()
    {

    }
    public Grupo(int idGrupo, String carrera, int NGrupo, String docente, int estado, int top_Aux, List<Usuario> usuarios)
    {
        IdGrupo = idGrupo;
        Carrera = carrera;
        this.NGrupo = NGrupo;
        Docente = docente;
        Estado = estado;
        Top_Aux = top_Aux;
        this.usuarios = usuarios;
    }

    public int getIdGrupo()
    {
        return IdGrupo;
    }

    public void setIdGrupo(int idGrupo)
    {
        IdGrupo = idGrupo;
    }

    public String getCarrera()
    {
        return Carrera;
    }

    public void setCarrera(String carrera)
    {
        Carrera = carrera;
    }

    public int getNGrupo()
    {
        return NGrupo;
    }

    public void setNGrupo(int NGrupo)
    {
        this.NGrupo = NGrupo;
    }

    public String getDocente()
    {
        return Docente;
    }

    public void setDocente(String docente) {
        Docente = docente;
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
