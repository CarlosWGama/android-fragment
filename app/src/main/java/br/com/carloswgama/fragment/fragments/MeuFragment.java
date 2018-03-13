package br.com.carloswgama.fragment.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.carloswgama.fragment.MainActivity;
import br.com.carloswgama.fragment.R;

public class MeuFragment extends Fragment {

    public MeuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(
                R.layout.fragment_meu,
                container,
                false);
        TextView textView = layout.findViewById(R.id.tv_texto_fragment1);
        textView.setText("Meu Fragment 1");

        ((AppCompatActivity)getActivity()).setTitle("Título Fragmento 1");

        setHasOptionsMenu(true);
        return layout;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.fragment1_menu, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
