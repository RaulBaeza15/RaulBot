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

    public Silabas() {
        silabas=new ArrayList<>();
    }

    public ArrayList<Silaba> getSilabas() {
        return silabas;
    }


    @Override
    public String toString() {
        StringBuilder salida= new StringBuilder();
        for (Silaba silaba:silabas             ) {
            salida.append(silaba.toString());

        }
        return salida.toString();
    }



    public boolean esMismoTexto(String texto) {
        boolean mismo=true;

        if(toString().length()==texto.length()){
            int i =0,j,caracterActual=0 ;
            while(mismo&&i < silabas.size()){
                j=0;
                while (mismo&&j < silabas.get(i).getSilabaTexto().length()){
                    mismo = texto.charAt(caracterActual)== silabas.get(i).getSilabaTexto().charAt(j);
                    j++;
                    caracterActual++;
                }
                i++;
            }

        }else {
            mismo=false;
        }
        return mismo;
    }

    public boolean esAceptable(String texto, Silaba silaba) {
        boolean esAceptable=true;
        int i =0;

        if (silaba.getSilabaTexto().length()+toString().length()<=texto.length()){
            while (esAceptable&& i<silaba.getSilabaTexto().length()){
                esAceptable=texto.charAt(toString().length()+i)==silaba.getSilabaTexto().charAt(i);

                i++;
            }
        }else{
            esAceptable=false;
        }

        return esAceptable;
    }
}
