package id.ac.polinema.luasbangundatar;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Bundle extras = getIntent().getExtras();

        String namaBangun = extras.getString("nama");
        Double hasilLuas = extras.getDouble("hasil");
        TextView bentuk = findViewById(R.id.namabentuk);
        TextView luas = findViewById(R.id.tvHasil);
        bentuk.setText("Luas " + namaBangun);
        luas.setText(" " + hasilLuas);
    }
}