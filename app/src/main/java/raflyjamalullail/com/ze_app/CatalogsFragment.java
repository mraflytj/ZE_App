package raflyjamalullail.com.ze_app;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class CatalogsFragment extends Fragment {
    View v;

    private static final String TAG = "CatalogFragment";
    private ListView listViewCatalog;

    private ArrayList<EO_Model> eo_modelArrayList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_catalogs, container, false);
        listViewCatalog = v.findViewById(R.id.list_ViewCatalog);
        fetchEOS();

        return v;
    }

    private void fetchEOS(){
        class FetchEOS extends AsyncTask<Void,Void,String> {
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected String doInBackground(Void... voids) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(Config.URL_FETCH);
                Log.d(TAG, "doInBackground: json = "+s);
                return s;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                convertJSON(s);
            }
        }

        FetchEOS fetchEOS = new FetchEOS();
        fetchEOS.execute();
    }

    private void convertJSON(String s){
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(s);
            JSONArray jsonArray = jsonObject.getJSONArray(Config.TAG_RESULT);
            for (int i = 0; i < jsonArray.length(); i++){
                JSONObject object = jsonArray.getJSONObject(i);
                String id, user_id, nama_eo, email, alamat, kontak, link, gambar_profil, deskripsi, created_at, updated_at;
                id = object.getString(Config.TAG_EOS_ID);
                user_id = object.getString(Config.TAG_EOS_USER_ID);
                nama_eo = object.getString(Config.TAG_EOS_NAMA_EO);
                email = object.getString(Config.TAG_EOS_EMAIL);
                alamat = object.getString(Config.TAG_EOS_ALAMAT);
                kontak = object.getString(Config.TAG_EOS_KONTAK);
                link = object.getString(Config.TAG_EOS_LINK);
                gambar_profil = object.getString(Config.TAG_EOS_GAMBAR_PROFIL);
                deskripsi = object.getString(Config.TAG_EOS_DESKRIPSI);
                created_at = object.getString(Config.TAG_EOS_CREATED_AT);
                updated_at = object.getString(Config.TAG_EOS_UPDATED_AT);

                EO_Model eo_model = new EO_Model(id, user_id, nama_eo, email, alamat, kontak, link, gambar_profil, deskripsi, created_at, updated_at);
                eo_modelArrayList.add(eo_model);
            }
            Log.d(TAG, "convertJSON: array length = " + eo_modelArrayList.size());
        }catch(JSONException e){
            e.getStackTrace();
        }

        ListViewAdapterEO listViewAdapterEO = new ListViewAdapterEO(getActivity(), R.layout.item_services, eo_modelArrayList);
        listViewCatalog.setAdapter(listViewAdapterEO);
    }
}
