package digitalhouse.com.exercicio1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {
    Intent meuIntent;
    String valorDoCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        Button enviar = (Button) findViewById(R.id.benviar);
        final TextView nome = (TextView) findViewById(R.id.textnome);
        TextView sobrenome = (TextView) findViewById(R.id.textsobrenome);
        TextView idade = (TextView) findViewById(R.id.textidade);

        enviar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Botão clicado", Toast.LENGTH_SHORT).show();
              meuIntent = new Intent(v.getContext(),ReceptorActivity.class);
                valorDoCampo = nome.getText().toString();
                Bundle meuBundle = new Bundle();
                meuBundle.putString("MinhaChave",valorDoCampo);
                meuIntent.putExtras(meuBundle);
                startActivity(meuIntent);
            }
            });
    }
}
