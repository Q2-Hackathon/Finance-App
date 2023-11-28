package com.debajyotibasak.phonepeclone.ui;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.debajyotibasak.phonepeclone.helper.BottomNavigationViewHelper;
import com.debajyotibasak.phonepeclone.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView mTxvToolbarTitle;
    private BottomNavigationView mBottomNavigationView;
    private HomeFragment homeFragment;
    private AccountFragment accountFragment;
    private OffersFragment offersFragment;
    private PaymentFragment paymentFragment;
    private TransactionsFragment transactionsFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = item -> {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        mTxvToolbarTitle.setText(R.string.app_name);
                        setUpFragment(homeFragment);
                        return true;
                    case R.id.navigation_offers:
                        mTxvToolbarTitle.setText(R.string.title_offers);
                        setUpFragment(offersFragment);
                        return true;
                    case R.id.navigation_payment:
                        mTxvToolbarTitle.setText(R.string.title_payment);
                        setUpFragment(paymentFragment);
                        return true;
                    case R.id.navigation_account:
                        mTxvToolbarTitle.setText(R.string.title_my_account);
                        setUpFragment(accountFragment);
                        return true;
                    case R.id.navigation_transactions:
                        mTxvToolbarTitle.setText(R.string.title_transactions);
                        setUpFragment(transactionsFragment);
                        return true;
                    default:
                        return false;

                }
            };

    private void initViews() {
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        mTxvToolbarTitle = findViewById(R.id.txv_toolbar_title);
        mBottomNavigationView = findViewById(R.id.navigation);
        homeFragment = HomeFragment.newInstance();
        accountFragment = AccountFragment.newInstance();
        offersFragment = OffersFragment.newInstance();
        paymentFragment = PaymentFragment.newInstance();
        transactionsFragment = TransactionsFragment.newInstance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        mTxvToolbarTitle.setText(R.string.app_name);

        mBottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        BottomNavigationViewHelper.removeShiftMode(mBottomNavigationView);

        FragmentTransaction buildBeginTransaction = getSupportFragmentManager().beginTransaction();
        buildBeginTransaction.replace(R.id.container_home, homeFragment);
        buildBeginTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.AI_assistant:
                Toast.makeText(this, "Ai assistant", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_notification:
                Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Dashboard:
                Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, dashboard.class);
                startActivity(intent);
                return true;

            default:
                Toast.makeText(this, "default case", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }

    private void setUpFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        fragmentTransaction.replace(R.id.container_home, fragment);
        fragmentTransaction.commit();
    }
}
