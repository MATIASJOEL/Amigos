package joel.com.aplicacion.listviewybaseadapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 15/10/2016.
 */
public class AmigosDataProvider {
    public static List<Amigo> getAmigos(){
        List<Amigo> amigos = new ArrayList<>();

        for (int i = 1; i<101;i++){
            Amigo a = new Amigo();
            a.setNombre("Nombre"+i);
            a.setEmail("email"+i+"@usuario.com");

            amigos.add(a);
        }

        return amigos;
    }
}
