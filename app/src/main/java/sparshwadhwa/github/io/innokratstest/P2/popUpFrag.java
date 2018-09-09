package sparshwadhwa.github.io.innokratstest.P2;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import sparshwadhwa.github.io.innokratstest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class popUpFrag extends Fragment {
private Button clickMe;

    public popUpFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pop_up, container, false);
        clickMe = view.findViewById(R.id.click_me);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater li = LayoutInflater.from(getContext());
                final View promptsView = li.inflate(R.layout.image_dialog_box, null);
                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                alertDialogBuilder.setView(promptsView);


                alertDialogBuilder
                        .setTitle("Look at the Image")
                        .setCancelable(false)

                        .setNegativeButton("Close",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
        return view;
    }

}
