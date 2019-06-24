package raflyjamalullail.com.ze_app._adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import raflyjamalullail.com.ze_app.Detail_Eo;
import raflyjamalullail.com.ze_app._model.EO_Model;
import raflyjamalullail.com.ze_app.R;

public class ListViewAdapterEO extends RecyclerView.Adapter<ListViewAdapterEO.ViewHolder> {
    private Context context;
    private static final String TAG = "ListViewAdapterEO";
    private ArrayList<EO_Model> eo_modelArrayList = new ArrayList<>();
    
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        Log.d(TAG, "onCreateViewHolder: called");
        View convertView = LayoutInflater.from(context).inflate(R.layout.item_services, parent, false);
        return new ViewHolder(convertView);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        Log.d(TAG, "onBindViewHolder: called");
        viewHolder.namaEO.setText(eo_modelArrayList.get(i).getNama_eo());
        viewHolder.emailEO.setText(eo_modelArrayList.get(i).getEmail());
        viewHolder.alamatEO.setText(eo_modelArrayList.get(i).getAlamat());
        viewHolder.kontakEO.setText(eo_modelArrayList.get(i).getKontak());
        viewHolder.deskripsiEO.setText(eo_modelArrayList.get(i).getDeskripsi());

        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Detail_Eo.class);
                intent.putExtra("EO_Detail", eo_modelArrayList.get(i));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: called");
        return eo_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private static final String TAG = "ViewHolder";
        public TextView namaEO, emailEO, alamatEO, kontakEO, deskripsiEO;

        public RelativeLayout relativeLayout;

        public ViewHolder(View convertView) {
            super(convertView);
            Log.d(TAG, "ViewHolder: called");
            namaEO = convertView.findViewById(R.id.tv_namaEO);
            emailEO = convertView.findViewById(R.id.tv_emailEO);
            alamatEO = convertView.findViewById(R.id.tv_alamatEO);
            kontakEO = convertView.findViewById(R.id.tv_kontakEO);
            deskripsiEO = convertView.findViewById(R.id.tv_deskripsiEO);
            relativeLayout = convertView.findViewById(R.id.relativeLayoutCard);
        }
    }

    public ListViewAdapterEO(ArrayList<EO_Model> eo_modelArrayList, Context context) {
        Log.d(TAG, "ListViewAdapterEO: called");
        this.eo_modelArrayList = eo_modelArrayList;
        this.context = context;
    }
}




//    public ListViewAdapterEO(Context context, int resource, ArrayList<EO_Model> eo_models) {
//        super(context, resource, eo_models);
//        Log.d(TAG, "ListViewAdapterEO: called");
//        this.context = context;
//        this.resources = resource;
//    }

//    @NonNull
//    @Override
//    public View getView(int position,  View convertView, @NonNull ViewGroup parent) {
//        Log.d(TAG, "getView: called");
//        String id, user_id, nama_eo, email, alamat, kontak, link, gambar_profil, deskripsi, created_at, updated_at;
//        id = getItem(position).getId();
//        user_id = getItem(position).getUser_id();
//        nama_eo = getItem(position).getNama_eo();
//        email = getItem(position).getEmail();
//        alamat = getItem(position).getAlamat();
//        kontak = getItem(position).getKontak();
//        link = getItem(position).getLink();
//        gambar_profil = getItem(position).getGambar_profil();
//        deskripsi = getItem(position).getDeskripsi();
//        created_at = getItem(position).getCreated_at();
//        updated_at = getItem(position).getUpdated_at();
//
//        EO_Model eo_model = new EO_Model(id, user_id, nama_eo, email, alamat, kontak, link, gambar_profil, deskripsi, created_at, updated_at);
//        if (convertView == null) {
//            convertView = LayoutInflater.from(context).inflate(resources, parent, false);
//        }
//
//        TextView namaEO = convertView.findViewById(R.id.tv_namaEO);
//        TextView emailEO = convertView.findViewById(R.id.tv_emailEO);
//        TextView alamatEO = convertView.findViewById(R.id.tv_alamatEO);
//        TextView kontakEO = convertView.findViewById(R.id.tv_kontakEO);
//        TextView deskripsiEO = convertView.findViewById(R.id.tv_deskripsiEO);
//
//        namaEO.setText(nama_eo);
//        emailEO.setText(email);
//        alamatEO.setText(alamat);
//        kontakEO.setText(kontak);
//        deskripsiEO.setText(deskripsi);
//
//        Log.d(TAG, "getView: namaEO = "+nama_eo);
//        Log.d(TAG, "getView: emailEO = "+email);
//        Log.d(TAG, "getView: alamatEO = "+alamat);
//        Log.d(TAG, "getView: kontakEO = "+kontakEO);
//        Log.d(TAG, "getView: deskripsiEO = "+deskripsiEO);
//
//        return convertView;
//    }
