package sparshwadhwa.github.io.innokratstest.P1;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;
import sparshwadhwa.github.io.innokratstest.MainActivity;
import sparshwadhwa.github.io.innokratstest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class slidderFrag extends Fragment {

    private static ViewPager mPager;
    private static int currentPage = 0;
    private ArrayList<Integer> imagesList = new ArrayList<Integer>();

    public slidderFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_slidder, container, false);

        imagesList.clear();
        imagesList.add(R.drawable.handshake);
        imagesList.add(R.drawable.handshake);
        imagesList.add(R.drawable.handshake);
        imagesList.add(R.drawable.handshake);
        mPager = (ViewPager) view.findViewById(R.id.pager);
        mPager.setAdapter(new sliderAdapter(getContext(),imagesList));
        CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
        indicator.setViewPager(mPager);

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == imagesList.size()) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 2500, 2500);
        return view;
    }

}
