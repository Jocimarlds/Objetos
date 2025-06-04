import com.sun.speech.freetts.*;

public class PruebaVoz {
    public static void main(String[] args) {
        VoiceManager vm = VoiceManager.getInstance();
        Voice voz = vm.getVoice("kevin16");

        if (voz == null) {
            System.err.println("❌ Voz 'kevin16' no encontrada.");
            return;
        }

        voz.allocate();
        voz.speak("Hola. Esta es una prueba de voz usando Free T T S en Java.");
        voz.deallocate();
    }
}
