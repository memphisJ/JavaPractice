package Inventario;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by hmartinez on 7/9/2019.
 */
public class Almacen {
    static public void main(String...args) {
        try (InputStream input = new FileInputStream("productos.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            ObjectMapper objectMapper = new ObjectMapper();
            Producto producto = objectMapper.readValue(prop.getProperty("data.medicamentos"), Medicamento.class);

            System.out.println("La cantidad de unidades es: " + producto.calculoDeUnidades());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
