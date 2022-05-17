public class Silaba {
    private String silabaTexto;
    private Object silabaAudio;

    public Silaba(String silabaTextoIn) {
        silabaTexto=silabaTextoIn;
    }

    public Object getSilabaAudio() {
        return silabaAudio;
    }

    public String getSilabaTexto() {
        return silabaTexto;
    }

    public void setSilabaTexto(String silabaTexto) {
        this.silabaTexto = silabaTexto;
    }

    public void setSilabaAudio(Object silabaAudio) {
        this.silabaAudio = silabaAudio;
    }

    @Override
    public String toString() {
        return silabaTexto;
    }
}
