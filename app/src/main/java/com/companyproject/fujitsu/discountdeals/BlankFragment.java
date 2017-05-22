package com.companyproject.fujitsu.discountdeals;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements AdapterView.OnItemClickListener {

    ListView mremarklist;

    private textAdapter mNameAdapter;
    private ArrayList<customeclass> dummydata;
String str[]= {"Ritesh","Shailendra"};
    Toolbar toolbar;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);


        mremarklist = (ListView) view.findViewById(R.id.remark_list);

        dummydata = new ArrayList<>();
        customeclass r1 = new customeclass(str[0],"Rajesh");
        customeclass r2 = new customeclass(str[1],"Mahesh");


        dummydata.add(r1);
        dummydata.add(r2);

        mNameAdapter = new textAdapter(getContext(), dummydata);
        mremarklist.setAdapter(mNameAdapter);

        mremarklist.setOnItemClickListener(this);



        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//        Intent studentIntent = new Intent(getContext(), DetailFragment.class);
//        for(int i = 0 ; i<=position; i++){
//            studentIntent.putExtra("img", str[i]);
//        }startActivity(studentIntent);
         if(position == 0) {

    DetailFragment fragment = new DetailFragment();
    FragmentManager manager = getFragmentManager();
    manager.beginTransaction().replace(R.id.frame_trans, fragment).addToBackStack("Ritesh").commit();

         }

        if(position==1){

            name fragment = new name();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.frame_trans, fragment).addToBackStack("Shailendra").commit();

        }

       // manager.addOnBackStackChangedListener(this);

    }
}
