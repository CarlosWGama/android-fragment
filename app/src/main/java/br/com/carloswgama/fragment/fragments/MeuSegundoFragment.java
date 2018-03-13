package br.com.carloswgama.fragment.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.carloswgama.fragment.R;

public class MeuSegundoFragment extends Fragment {

    public MeuSegundoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(
                R.layout.fragment_meu_segundo,
                container,
                false);
        TextView textView = layout.findViewById(R.id.tv_texto_fragment2);
        textView.setText("Meu Fragment 2");


        ((AppCompatActivity)getActivity()).setTitle("Meu Segundo Fragmento");
        return layout;
    }
}
