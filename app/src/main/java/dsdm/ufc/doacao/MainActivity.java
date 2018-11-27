package dsdm.ufc.doacao;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import dsdm.ufc.doacao.fragments.Donate;
import dsdm.ufc.doacao.fragments.Home;
import dsdm.ufc.doacao.fragments.Search;
import dsdm.ufc.doacao.fragments.User;
import dsdm.ufc.doacao.fragments.donate.TitleDonate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        switch ( item.getItemId() ) {
                            case R.id.navigation_home:
                                selectedFragment = Home.newInstance();
                                break;
                            case R.id.navigation_pesquisar:
                                selectedFragment = Search.newInstance();
                                break;
                            case R.id.navigation_doar:
                                selectedFragment = Donate.newInstance();
                                break;
                            case R.id.navigation_perfil:
                                selectedFragment = Opcoes.newInstance();

                        }

                        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                        transaction.replace(R.id.frame_layout, selectedFragment);
                        transaction.commit();
                        return true;
                    }
                }
        );

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, Home.newInstance());
        transaction.commit();

    }
}