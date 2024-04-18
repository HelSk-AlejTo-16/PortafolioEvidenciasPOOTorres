package mx.utng.s8;

public class Alumno {
private String curso;
private byte sesion;
private String objetivo;
{
    curso = "Programacion Orientada a objetos";
    sesion =8;
    objetivo = "Bloques de inicializacion";
}
{
curso = "Base de datos";


}

public String getCurso() {
    return curso;
}
public byte getSesion() {
    return sesion;
}
public String getObjetivo() {
    return objetivo;
}
public void setCurso(String curso) {
    this.curso = curso;
}
public void setSesion(byte sesion) {
    this.sesion = sesion;
}
public void setObjetivo(String objetivo) {
    this.objetivo = objetivo;
}
}
