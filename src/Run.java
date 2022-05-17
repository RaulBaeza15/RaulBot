import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        ArrayList<String> aaa = new ArrayList<>();
        aaa.add("ho");
        Silabas silabas = new Silabas(aaa);
        Silaba nnn=new Silaba("laa");
        System.out.println(silabas.esAceptable("holaa",nnn));

        CortaTextosBackTracking cortaTextosBackTracking=new CortaTextosBackTracking();
        System.out.println(cortaTextosBackTracking.cortaTexto("Hola Buenas Tardes"));


    }
}
