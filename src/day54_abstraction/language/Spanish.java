package day54_abstraction.language;
// We do not use extend for the interface. We just use implement for the interface.
public class Spanish implements Language{
    @Override
    public void hi() {
        System.out.println("hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }


}
