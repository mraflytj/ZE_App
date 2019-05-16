package raflyjamalullail.com.ze_app._sliders;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import raflyjamalullail.com.ze_app.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by bagicode on 12/04/17.
 */

public class FragmentSlider extends Fragment {

    private static final String ARG_PARAM1 = "params";

    private int imageUrls;

    public FragmentSlider() {
    }

    public static FragmentSlider newInstance(int params) {
        FragmentSlider fragment = new FragmentSlider();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, params);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        imageUrls = getArguments().getInt(ARG_PARAM1);
        View view = inflater.inflate(R.layout.fragment_slider_item, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Glide.with(getActivity())
                .load(imageUrls)
                .apply(RequestOptions.placeholderOf(R.drawable.image_slider_1))
                .into(img);
        return view;
    }
}