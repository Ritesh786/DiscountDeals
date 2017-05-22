package com.companyproject.fujitsu.discountdeals;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReedemCoupon extends Fragment implements View.OnClickListener {

    Button msubmitbtn;

    public ReedemCoupon() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_reedem_coupon, container, false);

        msubmitbtn = (Button) view.findViewById(R.id.submit_btn);
        msubmitbtn.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        Dialog dialog = new Dialog(getActivity(), android.R.style.Theme_Dialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.activity_dialogcl);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();

    }
}
