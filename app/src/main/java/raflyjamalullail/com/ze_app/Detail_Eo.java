package raflyjamalullail.com.ze_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import raflyjamalullail.com.ze_app._model.EO_Model;

public class Detail_Eo extends AppCompatActivity {

    TextView namaEO, kontakEO, alamatEO, linkEO;
    EO_Model eo_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__eo);

        eo_model = getIntent().getParcelableExtra("EO_Detail");

        namaEO = findViewById(R.id.tv_NamaEO);
        kontakEO = findViewById(R.id.tv_KontakEO);
        alamatEO = findViewById(R.id.tv_AlamatEO);
        linkEO = findViewById(R.id.tv_LinkEO);

        namaEO.setText(eo_model.getNama_eo());
        kontakEO.setText(eo_model.getKontak());
        alamatEO.setText(eo_model.getAlamat());
        linkEO.setText(eo_model.getLink());
    }
}
