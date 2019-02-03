package com.example.divyampandya63.qourier.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.divyampandya63.qourier.CourierList;
import com.example.divyampandya63.qourier.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Parcel.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Parcel extends Fragment {

    private EditText length;
    private EditText width;
    private EditText weight;
    private EditText height;
    private EditText invoice_value;
    private EditText shipping_pincode;
    private EditText delivery_pincode;
    private Button save_button;
    private Button next_button;


    public Parcel() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *

     * @return A new instance of fragment Parcel.
     */
    // TODO: Rename and change types and number of parameters


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_parcel, container, false);
        length = (view).findViewById(R.id.edit_length);
        width= (view).findViewById(R.id.edit_width);
        height =(view).findViewById(R.id.edit_height);
        weight = (view).findViewById(R.id.edit_weight);
        invoice_value = (view).findViewById(R.id.edit_invoice_value);
        shipping_pincode = (view).findViewById(R.id.shipping_pincode);
        delivery_pincode = (view).findViewById(R.id.delivery_pincode);
        save_button = (Button) (view).findViewById(R.id.save_button_parcel);
        next_button =(Button)(view).findViewById(R.id.next_button_parcel);

        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CourierList.class);
                startActivity(intent);
            }
        });
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Data is saved",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }




    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
