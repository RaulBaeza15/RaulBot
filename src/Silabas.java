import java.util.ArrayList;

public class Silabas {
    private final ArrayList<Silaba> silabas;
    public Silabas (ArrayList<String> arrayListSilababas){
        silabas=new ArrayList<>();
        for (String silabaTexto :arrayListSilababas) {
            Silaba silabaNueva= new Silaba(silabaTexto);
            silabas.add(silabaNueva);
        }

    }

    @Override
    public String toString() {
        return "Silabas{" +
                "silabas=" + silabas +
                '}';
    }
}
