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


public class BujurSangkar extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.activity_bujursangkar, container, false);

        final TextView panjang = root.findViewById(R.id.txtPanjang);
        Button hasil = root.findViewById(R.id.btnBujurSangkar);
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bujurpanjang = panjang.getText().toString();
                if (!TextUtils.isEmpty(bujurpanjang)) {
                    Double P = Double.parseDouble(bujurpanjang);
                    Double hasil = (P * P);

                    Intent intent = new Intent(getActivity(), HasilActivity.class);
                    intent.putExtra("hasil", hasil);
                    intent.putExtra("nama", "Bujur Sangkar");
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), "Silahkan isi terlebih dahulu sisinya", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return root;
    }
}