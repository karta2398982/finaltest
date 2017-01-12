package ksu4040e071.finaltest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private ImageView imageViewDot;
    private ViewPager viewPager;
    private ImagePagerAdapter adapter;

    private int[] mImages = new int[] { R.drawable.slide1, R.drawable.slide2,
            R.drawable.slide3, R.drawable.slide4, R.drawable.slide5 };
    //圖片檔

    private int[] mImagesDot = new int[] { R.drawable.scroll_dot1,
            R.drawable.scroll_dot2, R.drawable.scroll_dot3,
            R.drawable.scroll_dot4, R.drawable.scroll_dot5 };
    //點點圖案

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        imageViewDot = (ImageView) this.findViewById(R.id.imageView_dot);

        viewPager = (ViewPager) this.findViewById(R.id.view_pager);
        adapter = new ImagePagerAdapter();
        viewPager.setAdapter(adapter);

        viewPager.setOnPageChangeListener(new OnPageChangeListener() {

            public void onPageSelected(int arg0) {
                // TODO Auto-generated method stub

            }

            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub
                imageViewDot.setImageResource(mImagesDot[arg0]);
            }

            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });


    }

    private class ImagePagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mImages.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == ((ImageView) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            Context context = MainActivity.this;

            ImageView imageView = new ImageView(context);

            int padding = context.getResources().getDimensionPixelSize(
                    R.dimen.activity_horizontal_margin);
            imageView.setPadding(padding, padding, padding, padding);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);

            imageView.setImageResource(mImages[position]);

            ((ViewPager) container).addView(imageView, 0);

            return imageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((ImageView) object);

        }

    }

    public void onDoneClick(View view){
        startActivity(new Intent(this, MyActivity.class));
    }
    //略過按鈕

}

