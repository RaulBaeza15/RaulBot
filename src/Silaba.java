import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class Silaba {
    private String silabaTexto;


    public Silaba(String silabaTextoIn) {
        silabaTexto=silabaTextoIn;
    }



    public String getSilabaTexto() {
        return silabaTexto;
    }

    public void setSilabaTexto(String silabaTexto) {
        this.silabaTexto = silabaTexto;
    }



    @Override
    public String toString() {
        return silabaTexto;
    }
    public void reproducirSonido(){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\Proyectos\\RaulBot\\src\\Sonidos\\cu.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
}
