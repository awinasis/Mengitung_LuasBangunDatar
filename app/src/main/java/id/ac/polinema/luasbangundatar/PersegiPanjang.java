package id.ac.polinema.luasbangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class PersegiPanjang extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.activity_persegipanjang, container, false);

        final TextView panjang = root.findViewById(R.id.txtPanjang);
        final TextView lebar = root.findViewById(R.id.txtLebar);
        Button hasilP = root.findViewById(R.id.btnPersegiPanjang);
        hasilP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Panjang = panjang.getText().toString();
                String Lebar = lebar.getText().toString();
                if (!TextUtils.isEmpty(Lebar) && !TextUtils.isEmpty(Panjang)) {
                    Double L = Double.parseDouble(Lebar);
                    Double P = Double.parseDouble(Panjang);
                    Double hasil = (L * P);

                    Intent intent = new Intent(getActivity(), HasilActivity.class);
                    intent.putExtra("hasil", hasil);
                    intent.putExtra("nama", "Persegi Panjang");
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Silahkan isi terlebih dahulu Panjang dan Lebar nya", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return root;
    }

}
