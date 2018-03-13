package br.com.carloswgama.fragment;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import br.com.carloswgama.fragment.fragments.MeuFragment;
import br.com.carloswgama.fragment.fragments.MeuSegundoFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.framelayout, new MeuFragment())
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainactivity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_fragment1) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.framelayout, new MeuFragment())
                    .commit();
        } else if (item.getItemId() == R.id.item_fragment2) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.framelayout, new MeuSegundoFragment())
                    .commit();
        }
        return super.onOptionsItemSelected(item);
    }
}
