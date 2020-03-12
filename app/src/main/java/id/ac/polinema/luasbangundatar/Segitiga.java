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

    public class Segitiga extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            final View root = inflater.inflate(R.layout.activity_segitiga, container, false);

            final TextView tinggi = root.findViewById(R.id.txtTinggi);
            final TextView alas = root.findViewById(R.id.txtAlas);
            Button hasil = root.findViewById(R.id.btnHitung);
            hasil.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String Tinggi = tinggi.getText().toString();
                    String Alas = alas.getText().toString();
                    if (!TextUtils.isEmpty(Alas) && !TextUtils.isEmpty(Tinggi)) {
                        double A = Double.parseDouble(Alas);
                        double T = Double.parseDouble(Tinggi);
                        double hasil = (A * T) / 2;

                        Intent intent = new Intent(getActivity(), HasilActivity.class);
                        intent.putExtra("hasil", hasil);
                        intent.putExtra("nama", "Segitiga");
                        startActivity(intent);
                    } else {
                        Toast.makeText(getActivity(), "Silahkan isi terlebih dahulu Alas dan Tinggi nya", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            return root;
        }


    }
