package digitalhouse.com.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceptorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        TextView textnome = (TextView) findViewById(R.id.textnome);

        Intent outroIntent = getIntent();
        Bundle outroBundle = outroIntent.getExtras();
        String unValor = outroBundle.getString("MinhaChave");
        textnome.setText(unValor);
    }
}
