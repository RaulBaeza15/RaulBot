import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        CortaTextosBackTracking cortaTextosBackTracking=new CortaTextosBackTracking();
        Silabas silabas=cortaTextosBackTracking.cortaTexto("cu");
        System.out.println(silabas);
        silabas.reproducir();

    }
}
