package raflyjamalullail.com.ze_app._adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import raflyjamalullail.com.ze_app._model.EO_Model;
import raflyjamalullail.com.ze_app.R;

public class ListViewAdapterEO extends ArrayAdapter<EO_Model> {
    private Context context;
    private int resources;
    private static final String TAG = "ListViewAdapterEO";

    public ListViewAdapterEO(Context context, int resource, ArrayList<EO_Model> eo_models) {
        super(context, resource, eo_models);
        Log.d(TAG, "ListViewAdapterEO: called");
        this.context = context;
        this.resources = resource;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "getView: called");
        String id, user_id, nama_eo, email, alamat, kontak, link, gambar_profil, deskripsi, created_at, updated_at;
        id = getItem(position).getId();
        user_id = getItem(position).getUser_id();
        nama_eo = getItem(position).getNama_eo();
        email = getItem(position).getEmail();
        alamat = getItem(position).getAlamat();
        kontak = getItem(position).getKontak();
        link = getItem(position).getLink();
        gambar_profil = getItem(position).getGambar_profil();
        deskripsi = getItem(position).getDeskripsi();
        created_at = getItem(position).getCreated_at();
        updated_at = getItem(position).getUpdated_at();

        EO_Model eo_model = new EO_Model(id, user_id, nama_eo, email, alamat, kontak, link, gambar_profil, deskripsi, created_at, updated_at);
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resources, parent, false);
        }

        TextView namaEO = convertView.findViewById(R.id.tv_namaEO);
        TextView emailEO = convertView.findViewById(R.id.tv_emailEO);
        TextView alamatEO = convertView.findViewById(R.id.tv_alamatEO);
        TextView kontakEO = convertView.findViewById(R.id.tv_kontakEO);
        TextView deskripsiEO = convertView.findViewById(R.id.tv_deskripsiEO);

        namaEO.setText(nama_eo);
        emailEO.setText(email);
        alamatEO.setText(alamat);
        kontakEO.setText(kontak);
        deskripsiEO.setText(deskripsi);

        Log.d(TAG, "getView: namaEO = "+nama_eo);
        Log.d(TAG, "getView: emailEO = "+email);
        Log.d(TAG, "getView: alamatEO = "+alamat);
        Log.d(TAG, "getView: kontakEO = "+kontakEO);
        Log.d(TAG, "getView: deskripsiEO = "+deskripsiEO);

        return convertView;
    }
}
