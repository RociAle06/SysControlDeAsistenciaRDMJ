package org.Entidades;
import java.time.LocalDate;
import java.util.List;

public class Asistencia {

    private int IdAsistencia;
    private LocalDate Fecha;
    private String EstadoDeAsistencia;
    private LocalDate HoraEntrada;
    private LocalDate HoraSalida;
    private  int IdUsuario;
    private  String Observacion;
    private  int Estado;
    private int Top_Aux;
    private List<Usuario> usuarios;

    public Asistencia ()
    {

    }


    public Asistencia(int idAsistencia, LocalDate fecha, String estadoDeAsistencia, LocalDate horaEntrada, LocalDate horaSalida, int idUsuario, String observacion, int estado, int top_Aux, List<Usuario> usuarios) {
        IdAsistencia = idAsistencia;
        Fecha = fecha;
        EstadoDeAsistencia = estadoDeAsistencia;
        HoraEntrada = horaEntrada;
        HoraSalida = horaSalida;
        IdUsuario = idUsuario;
        Observacion = observacion;
        Estado = estado;
        Top_Aux = top_Aux;
        this.usuarios = usuarios;
    }

    public int getIdAsistencia()
    {
        return IdAsistencia;
    }

    public void setIdAsistencia(int idAsistencia)
    {
        IdAsistencia = idAsistencia;
    }

    public LocalDate getFecha()
    {
        return Fecha;
    }

    public void setFecha(LocalDate fecha)
    {
        Fecha = fecha;
    }

    public String getEstadoDeAsistencia()
    {
        return EstadoDeAsistencia;
    }

    public void setEstadoDeAsistencia(String estadoDeAsistencia)
    {
        EstadoDeAsistencia = estadoDeAsistencia;
    }

    public LocalDate getHoraEntrada()
    {
        return HoraEntrada;
    }

    public void setHoraEntrada(LocalDate horaEntrada)
    {
        HoraEntrada = horaEntrada;
    }

    public LocalDate getHoraSalida()
    {
        return HoraSalida;
    }

    public void setHoraSalida(LocalDate horaSalida)
    {
        HoraSalida = horaSalida;
    }

    public int getIdUsuario()
    {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario)
    {
        IdUsuario = idUsuario;
    }

    public String getObservacion()
    {
        return Observacion;
    }

    public void setObservacion(String observacion)
    {
        Observacion = observacion;
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
