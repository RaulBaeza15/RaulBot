public class CortaTextosBackTracking {
    Silabas silabas = new Silabas( Cortadora.getSilabas());
    public CortaTextosBackTracking(){

    }

    public Silabas cortaTexto(String textoCrudo) {
        Silabas silabasResultantes=new Silabas();
        String texto=textoCrudo.toLowerCase();
        Booleano exito=new Booleano();
        cortaTextoBacktracking(silabasResultantes,texto, exito);
        return silabasResultantes;
    }

    private void cortaTextoBacktracking(Silabas silabasResultantes, String texto, Booleano exito) {

        if(silabasResultantes.esMismoTexto(texto)){
            exito.setBoleano(true);
        }else {
            int i =0;
            while (!exito.isBoleano()&&i<silabas.getSilabas().size()){


                if(silabasResultantes.esAceptable(texto, silabas.getSilabas().get(i))){

                    Silaba silabaActual = silabas.getSilabas().get(i);
                    silabasResultantes.getSilabas().add(silabaActual);
                    cortaTextoBacktracking( silabasResultantes,  texto,  exito);
                    if (!exito.isBoleano()){
                        silabasResultantes.getSilabas().remove(silabasResultantes.getSilabas().size()-1);
                    }

                }
                i++;



            }
        }


    }
}
