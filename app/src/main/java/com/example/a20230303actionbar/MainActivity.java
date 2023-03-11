package com.example.a20230303actionbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActionBar actionBar = getActionBar();
//        actionBar.hide();
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowHomeEnabled(true);

        actionBar.setLogo(R.drawable.test6s);

        actionBar.setDisplayUseLogoEnabled(true);


//————————————————
//        版权声明：本文为CSDN博主「呼啦啦啦花开啦」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//        原文链接：https://blog.csdn.net/qq_31994221/article/details/49420923

        //actionBar.hide();
        actionBar.setTitle(getString(R.string.ationbar_title));
        actionBar.setDisplayShowTitleEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.actionitems,menu);
        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_add:
                Toast.makeText(this,"add",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_delete:
                Toast.makeText(this,"delect",Toast.LENGTH_LONG).show();
                return true;
            case R.id.action_email:
                Toast.makeText(this,"email",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}