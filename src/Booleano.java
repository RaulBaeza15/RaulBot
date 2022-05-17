public class Booleano {
    private boolean boleano;
    public Booleano(){
        boleano=false;
    }

    @Override
    public String toString() {
        return boleano+"";
    }

    public boolean isBoleano() {
        return boleano;
    }

    public void setBoleano(boolean boleano) {
        this.boleano = boleano;
    }
}
