package com.debajyotibasak.phonepeclone.ui;

import android.content.Intent;
import android.os.Bundle;
import com.debajyotibasak.phonepeclone.R;
import com.debajyotibasak.phonepeclone.ui.dashboard_layout.Bills;
import com.debajyotibasak.phonepeclone.ui.dashboard_layout.Clothing;
import com.debajyotibasak.phonepeclone.ui.dashboard_layout.Groceries;
import com.debajyotibasak.phonepeclone.ui.dashboard_layout.Medical;
import com.debajyotibasak.phonepeclone.ui.dashboard_layout.Others;
import com.debajyotibasak.phonepeclone.ui.dashboard_layout.Snacks;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.Snacks:
//                Intent intent1 = new Intent(this, Snacks.class);
//                startActivity(intent1);
//                return true;
//            case R.id.Groceries:
//                Intent intent2 = new Intent(this, Groceries.class);
//                startActivity(intent2);
//                return true;
//            case R.id.Clothing:
//                Intent intent3 = new Intent(this, Clothing.class);
//                startActivity(intent3);
//                return true;
//            case R.id.Medical:
//                Intent intent4 = new Intent(this, Medical.class);
//                startActivity(intent4);
//                return true;
//            case R.id.Bills:
//                Intent intent5 = new Intent(this, Bills.class);
//                startActivity(intent5);
//                return true;
//            case R.id.Others:
//                Intent intent6 = new Intent(this, Others.class);
//                startActivity(intent6);
//                return true;
//
//            default:
////                Toast.makeText(this, "default case", Toast.LENGTH_SHORT).show();
//                return super.onOptionsItemSelected(item);
//        }
//    }
}