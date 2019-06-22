package raflyjamalullail.com.ze_app._fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import raflyjamalullail.com.ze_app.AllFragment;
import raflyjamalullail.com.ze_app.R;
import raflyjamalullail.com.ze_app._adapter.ViewPagerAdapter;

public class NotificationsFragment extends Fragment {

    View view;
    TableLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_notifications, container, false);
//        tabLayout = view.findViewById(R.id.tabLayout);
//        viewPager = view.findViewById(R.id.viewPager);
////        if (viewPager != null){
////            setupViewPager(viewPager);
////        }
//
//        adapter = new ViewPagerAdapter(getFragmentManager());
//        viewPager.setAdapter(adapter);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        AllFragment allFragment = new AllFragment();
        ApprovingFragment approvingFragment = new ApprovingFragment();

        transaction.add(R.id.fragment1, allFragment, "All");
        transaction.add(R.id.fragment2, approvingFragment, "Approving");
        transaction.commit();

        return view;
    }
}
