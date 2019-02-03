package com.example.divyampandya63.qourier.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
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
 * {@link Courier.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Courier extends Fragment {
    private EditText from_pincode;
    private EditText to_pincode;
    private EditText weight;
    private Button next;
    private Button save;

    public Courier() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     *
     * @return A new instance of fragment Courier.
     */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_courier, container, false);
        from_pincode = (view).findViewById(R.id.fpin);
        to_pincode = (view).findViewById(R.id.tpin);
        weight = (view).findViewById(R.id.kg);
        String f_pincode = from_pincode.getText().toString();
//        if (f_pincode.matches("")) {
//            Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();
//
//        }

        String t_pincode = to_pincode.getText().toString();
//        if (t_pincode.matches("")) {
//            Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();
//
//        }

        String weigh = weight.getText().toString();
//        if (weigh.matches("")) {
//            Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();
//
//        }
        save = (view).findViewById(R.id.save);
        next = (view).findViewById(R.id.next);

        from_pincode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (from_pincode.toString().trim().length() > 0) {
                    next.setEnabled(true);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), CourierList.class);
                            startActivity(intent);
                        }
                    });
                } else {
                    next.setEnabled(false);
                    // Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();

                }
            }
        });

        from_pincode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (from_pincode.toString().trim().length() > 0) {
                    save.setEnabled(true);
                    save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getActivity(),"Data is saved",Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    save.setEnabled(false);
                    // Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();
                }
            }
        });

        to_pincode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if (charSequence.toString().trim().length() > 0) {
//                    next.setEnabled(true);
//                } else {
//                    next.setEnabled(false);
//                   // Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();
//                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

                if (to_pincode.toString().trim().length() > 0) {
                    next.setEnabled(true);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), CourierList.class);
                            startActivity(intent);
                        }
                    });
                } else {
                    next.setEnabled(false);
                    Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();
                }
            }
        });

        to_pincode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (to_pincode.toString().trim().length() > 0) {
                    save.setEnabled(true);
                    save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getActivity(),"Data is saved",Toast.LENGTH_SHORT).show();
                        }
                    });
                } else {
                    save.setEnabled(false);
                    Toast.makeText(getContext(), "You did not enter the pincode", Toast.LENGTH_SHORT).show();
                }
            }
        });

        weight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (weight.toString().trim().length() > 0) {
                    next.setEnabled(true);
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getActivity(), CourierList.class);
                            startActivity(intent);
                        }
                    });
                } else {
                    next.setEnabled(false);
                     Toast.makeText(getContext(), "You did not enter the weight", Toast.LENGTH_SHORT).show();
                }
            }
        });

        weight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (weight.toString().trim().length() > 0) {
                    save.setEnabled(true);
                    save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getActivity(),"Data is saved",Toast.LENGTH_SHORT).show();
                        }
                    });

                } else {
                    save.setEnabled(false);
                    Toast.makeText(getContext(), "You did not enter the weight", Toast.LENGTH_SHORT).show();
                }
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
