package com.companyproject.fujitsu.discountdeals;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import static android.app.DialogFragment.STYLE_NO_FRAME;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChangePassword extends Fragment implements View.OnClickListener {

    Button mresetbtn;

    public ChangePassword() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_change_password, container, false);

        mresetbtn = (Button) view.findViewById(R.id.reset_btn);
        mresetbtn.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {

       Dialog dialog = new Dialog(getActivity(), android.R.style.Theme_Dialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.activity_dialoguepass);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();

    }
}
