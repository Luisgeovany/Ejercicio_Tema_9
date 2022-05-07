public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre("Luis Geovany");
        cliente.setEdad(32);
        cliente.setTelefono("318654123");
        cliente.setCredito(1000000);

        System.out.println("cliente: " + cliente.getNombre());
        System.out.println("edad: " + cliente.getEdad() + " anios");
        System.out.println("telefono: " + cliente.getTelefono());
        System.out.println("Su credito es de: $" + cliente.getCredito());

        System.out.println("-------------------------------------");

        Trabajador empleado = new Trabajador();

        empleado.setNombre("Cristiano Ronaldo");
        empleado.setEdad(38);
        empleado.setTelefono("77777777");
        empleado.setSalario(100000000);

        System.out.println("Trabajador: " + empleado.getNombre());
        System.out.println("edad: " + empleado.getEdad() + " anios");
        System.out.println("telefono: " + empleado.getTelefono());
        System.out.println("Su salario es de: $" + empleado.getSalario());
    }
}
class Persona {
   private String nombre;
   private int edad;
   private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;

    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

}
class Cliente extends Persona{
   private int credito;
   public void setCredito(int credito){
       this.credito = credito;
   }
   public int getCredito(){
       return this.credito;
   }
}
class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario){
        this.salario = salario;
    }
    public int getSalario (){
        return this.salario;
    }
}