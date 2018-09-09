package sparshwadhwa.github.io.innokratstest.P3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sparshwadhwa.github.io.innokratstest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class longTextFrag extends Fragment {
TextView textView;

    public longTextFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_long_text, container, false);
        textView = view.findViewById(R.id.long_textview);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        return view;
    }

}
