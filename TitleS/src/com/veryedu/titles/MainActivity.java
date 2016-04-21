package com.veryedu.titles;

import java.util.ArrayList;

import adpter.VpAdapter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import fragment.Fragment_four;
import fragment.Fragment_one;
import fragment.Fragment_three;
import fragment.Fragment_two;
/**
 * 
 * @author 郑赛
 *
 * @date 2016-4-21
 */
public class MainActivity extends FragmentActivity {

    private ViewPager vp;
	private RadioButton rb3;
	private RadioButton rb2;
	private RadioButton rb1;
	private RadioButton rb;
	private RadioGroup rg;
	int currfragment=0;
	FragmentManager fm=null;
	int screenWidth=0;
	int screenHeight=0;
	int screenW=0;
	private int currImagex;// 线条距离y主坐标
    float offset;// 动画图片偏移量
    int endx=0;
	ArrayList<Fragment> list=new ArrayList<Fragment>();

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       rg = (RadioGroup) findViewById(R.id.main_rg);
       rb = (RadioButton) findViewById(R.id.main_rb0);
       rb1 = (RadioButton) findViewById(R.id.main_rb1);
       rb2 = (RadioButton) findViewById(R.id.main_rb2);
       rb3 = (RadioButton) findViewById(R.id.main_rb3);
       vp = (ViewPager) findViewById(R.id.main_viewpager);
       WindowManager windowManager = MainActivity.this.getWindowManager();
       Display display = windowManager.getDefaultDisplay();
       screenWidth = display.getWidth();
       screenHeight = display.getHeight();
       init();
    }
	public void init(){
		/**
		 * 加碎片加入到数组
		 */
		Fragment_one one=new Fragment_one();
		Fragment_two two=new Fragment_two();
		Fragment_three three=new Fragment_three();
		Fragment_four four=new Fragment_four();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		VpAdapter vpadapter=new VpAdapter(getSupportFragmentManager());
		vpadapter.setList(list);
		vp.setAdapter(vpadapter);
		 vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
	            @Override
	            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

	            }
	            @Override
	            public void onPageSelected(int position) {
	                currfragment= position;
	            }

	            @Override
	            public void onPageScrollStateChanged(int state) {

	            }
	        });
		 InintRadbuttion();
	}
	/**
	 * 点击事件
	 */
	 private void InintRadbuttion() {
		 rb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				vp.setCurrentItem(0);
			
			}
		});
		 rb1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					vp.setCurrentItem(1);
				}
			});
		 rb2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					vp.setCurrentItem(2);
				}
			});
		 rb3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					vp.setCurrentItem(3);
				}
			});
		 
	 }



   
}
