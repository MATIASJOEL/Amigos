package joel.com.aplicacion.listviewybaseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView AmigosListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AmigosListview = (ListView) findViewById(R.id.listViewAmigos);
        List<Amigo> amigos = AmigosDataProvider.getAmigos();
        AmigosAdapter adapter = new AmigosAdapter(amigos,getApplicationContext());
        AmigosListview.setAdapter(adapter);

    }
}
