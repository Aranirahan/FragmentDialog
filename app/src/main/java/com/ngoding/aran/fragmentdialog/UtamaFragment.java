package com.ngoding.aran.fragmentdialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class UtamaFragment extends Fragment implements View.OnClickListener {
    public Button btnpanggilFragment;


    public UtamaFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_utama,container,false);
        btnpanggilFragment = view.findViewById(R.id.btn_panggil_fragment);
        btnpanggilFragment.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
//        OptionDialogFragment mOptionDialogFragment = new OptionDialogFragment();
//        mOptionDialogFragment.setOnOptionDialogListener(new OptionDialogFragment.OnOptionDialogListener() {
//            @Override
//            public void onOptionChoosen(String text) {
//                Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
//            }
//        });
        DialogFragment mDialogFragment = new DialogFragment();

        FragmentManager mFragmentManager = getChildFragmentManager();
        mDialogFragment.show(mFragmentManager,DialogFragment.class.getSimpleName());
    }
}
