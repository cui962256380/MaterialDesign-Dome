package com.android.system.materialdesign;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.system.materialdesign.adapter.MyViewPagerAdater;
import com.android.system.materialdesign.fragment.BlankFragment;
import com.android.system.materialdesign.view.MySearchView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<String> mList;
    private List<Fragment> mFragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        initData();
        initView();
    }

    private void initView() {
        mTabLayout= (TabLayout) findViewById(R.id.tablayout);
        mViewPager= (ViewPager) findViewById(R.id.viewpager);
        MyViewPagerAdater myAdapter=new MyViewPagerAdater(getSupportFragmentManager(),this,mList,mFragmentList);
        mViewPager.setAdapter(myAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initData() {
       mList=new ArrayList<>();
        mList.add("tab1");
        mList.add("tab2");
        mList.add("tab3");
        mList.add("tab4");
        mFragmentList=new ArrayList<>();
        mFragmentList.add(new BlankFragment());
        mFragmentList.add(new BlankFragment());
        mFragmentList.add(new BlankFragment());
        mFragmentList.add(new BlankFragment());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchView=menu.findItem(R.id.action_search);
        MaterialSearchView msearchView = (MaterialSearchView) findViewById(R.id.search_view);
       msearchView.setBackgroundColor(getColor(R.color.colorPrimary));
        msearchView.setHint("书名:");
        msearchView.setTextColor(getColor(R.color.searchView));
        msearchView.setHintTextColor(getColor(R.color.searchView));
        msearchView.setMenuItem(searchView);
//        EditText mEdit = (SearchView.SearchAutoComplete) mSearchView.findViewById(R.id.search_src_text);
//        ImageView mImage= (ImageView) mSearchView.findViewById(R.id.search_close_btn);
//        mImage.setBackgroundColor(getColor(R.color.searchView));
//        mImage.setImageResource(R.drawable.shanchu3);
//        mEdit.setBackgroundColor(getColor(R.color.searchView));
//        mEdit.setTextColor(getColor(R.color.searchViewTextColor));
//        mEdit.setHintTextColor(getColor(R.color.searchViewTextHintColor));
//        mEdit.setHint("请输入书名：");





//        MenuItemCompat.setOnActionExpandListener(searchView, new MenuItemCompat.OnActionExpandListener() {//设置打开关闭动作监听
//            @Override
//            public boolean onMenuItemActionExpand(MenuItem item) {
//                Toast.makeText(MainActivity.this, "onExpand", Toast.LENGTH_LONG).show();
//                return true;
//            }
//            @Override
//            public boolean onMenuItemActionCollapse(MenuItem item) {
//                Toast.makeText(MainActivity.this, "Collapse", Toast.LENGTH_LONG).show();
//                return true;
//            }
//        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
        if(id==R.id.action_search){
            mTabLayout.setBackgroundColor(getColor(R.color.searchView));
            return false;
        }

        return super.onOptionsItemSelected(item);
    }

}
