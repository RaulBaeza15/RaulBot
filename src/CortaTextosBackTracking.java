import java.util.ArrayList;

public class CortaTextosBackTracking {
    Silabas silabas = new Silabas( Cortadora.getSilabas());
    public CortaTextosBackTracking(){

    }

    public Silabas cortaTexto(String textoCrudo) {
        Silabas silabasResultantes=new Silabas();
        String texto=textoCrudo.toLowerCase();
        cortaTextoBacktracking(silabasResultantes,texto);
        return silabasResultantes;
    }

    private void cortaTextoBacktracking(Silabas silabasResultantes, String texto) {
        if(silabasResultantes.toString().length()>=texto.length()){

        }

    }
}
