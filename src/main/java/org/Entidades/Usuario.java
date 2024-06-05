package org.Entidades;
import java.time.LocalDate;

public class Usuario {
    private int IdUsuario;
    private String Nombre;
    private String Apellido;
    private int IdRol;
    private int IdGrupo;
    private LocalDate FechaDeNacimiento;
    private LocalDate FechaDeRegistro;
    private String Direccion;
    private String Codigo;
    private String Telefono;
    private String Departamento;
    private String Foto;
    private int Estado;
    private String Rfid;
    private String Password;
    private String Login;
    private Asistencia asistencias;
    private Rol rol;
    private Grupo grupo;
    private String ConfirmPassword;
    private int Top_aux;

    public Usuario()
    {

    }

    public Usuario(int idUsuario, String nombre, String apellido, int idRol, int idGrupo, LocalDate fechaDeNacimiento, LocalDate fechaDeRegistro, String direccion, String codigo, String telefono, String departamento, String foto, int estado, String rfid, String password, String login, Asistencia asistencias, Rol rol, Grupo grupo, String confirmPassword, int top_aux) {
        IdUsuario = idUsuario;
        Nombre = nombre;
        Apellido = apellido;
        IdRol = idRol;
        IdGrupo = idGrupo;
        FechaDeNacimiento = fechaDeNacimiento;
        FechaDeRegistro = fechaDeRegistro;
        Direccion = direccion;
        Codigo = codigo;
        Telefono = telefono;
        Departamento = departamento;
        Foto = foto;
        Estado = estado;
        Rfid = rfid;
        Password = password;
        Login = login;
        this.asistencias = asistencias;
        this.rol = rol;
        this.grupo = grupo;
        ConfirmPassword = confirmPassword;
        Top_aux = top_aux;
    }


    public int getIdUsuario()
    {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario)
    {
        IdUsuario = idUsuario;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String nombre)
    {
        Nombre = nombre;
    }

    public String getApellido()
    {
        return Apellido;
    }

    public void setApellido(String apellido)
    {
        Apellido = apellido;
    }

    public int getIdRol()
    {
        return IdRol;
    }

    public void setIdRol(int idRol)
    {
        IdRol = idRol;
    }

    public int getIdGrupo()
    {
        return IdGrupo;
    }

    public void setIdGrupo(int idGrupo)
    {
        IdGrupo = idGrupo;
    }

    public LocalDate getFechaDeNacimiento()
    {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento)
    {
        FechaDeNacimiento = fechaDeNacimiento;
    }

    public LocalDate getFechaDeRegistro()
    {
        return FechaDeRegistro;
    }

    public void setFechaDeRegistro(LocalDate fechaDeRegistro)
    {
        FechaDeRegistro = fechaDeRegistro;
    }

    public String getDireccion()
    {
        return Direccion;
    }

    public void setDireccion(String direccion)
    {
        Direccion = direccion;
    }

    public String getCodigo()
    {
        return Codigo;
    }

    public void setCodigo(String codigo)
    {
        Codigo = codigo;
    }

    public String getTelefono()
    {
        return Telefono;
    }

    public void setTelefono(String telefono)
    {
        Telefono = telefono;
    }

    public String getDepartamento()
    {
        return Departamento;
    }

    public void setDepartamento(String departamento)
    {
        Departamento = departamento;
    }

    public String getFoto()
    {
        return Foto;
    }

    public void setFoto(String foto)
    {
        Foto = foto;
    }

    public int getEstado()
    {
        return Estado;
    }

    public void setEstado(int estado)
    {
        Estado = estado;
    }

    public String getRfid()
    {
        return Rfid;
    }

    public void setRfid(String rfid)
    {
        Rfid = rfid;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String password)
    {
        Password = password;
    }

    public String getLogin()
    {
        return Login;
    }

    public void setLogin(String login)
    {
        Login = login;
    }

    public Asistencia getAsistencias()
    {
        return asistencias;
    }

    public void setAsistencias(Asistencia asistencias)
    {
        this.asistencias = asistencias;
    }

    public Rol getRol()
    {
        return rol;
    }

    public void setRol(Rol rol)
    {
        this.rol = rol;
    }

    public Grupo getGrupo()
    {
        return grupo;
    }

    public void setGrupo(Grupo grupo)
    {
        this.grupo = grupo;
    }

    public String getConfirmPassword()
    {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword)
    {
        ConfirmPassword = confirmPassword;
    }

    public int getTop_aux()
    {
        return Top_aux;
    }

    public void setTop_aux(int top_aux) {
        Top_aux = top_aux;
    }
}
