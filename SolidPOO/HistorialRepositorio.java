package repositorio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HistorialRepositorio {
    private final File archivo = new File("historial.txt");

    public void guardarEntrada(String entrada) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(entrada);
            bw.newLine();
        }
    }

    public List<String> leerHistorial() throws IOException {
        List<String> historial = new ArrayList<>();
        if (!archivo.exists()) return historial;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                historial.add(linea);
            }
        }
        return historial;
    }
}
