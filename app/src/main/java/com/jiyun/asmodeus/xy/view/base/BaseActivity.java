package com.jiyun.asmodeus.xy.view.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.R;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity{
    private BaseFragment lastFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.context = this;
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initData();
        initView();

    }



    protected abstract int getLayoutId();

    protected abstract void initData();

    protected abstract void initView();

    public BaseFragment setContentView(Class<? extends BaseFragment> fragmentClass) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        String fragmentName = fragmentClass.getSimpleName();

        BaseFragment fragment = (BaseFragment) fragmentManager.findFragmentByTag(fragmentName);
        try {
            if (fragment == null) {
                fragment = fragmentClass.newInstance(); // new Fragment()
                transaction.add(R.id.fragmentcontainer, fragment, fragmentName);
            }
            if (lastFragment != null)
                transaction.hide(lastFragment);
            transaction.show(fragment);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        lastFragment = fragment;
        transaction.commit();

        return fragment;
    }

    @Override
    protected void onResume() {
        super.onResume();
        App.context = this;
    }

    @Override
    protected void onPause() {
        super.onPause();
        App.context=null;
    }
}
