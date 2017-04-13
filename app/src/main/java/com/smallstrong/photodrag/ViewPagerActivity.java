package com.smallstrong.photodrag;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smallstrong.dragimage.DragImage;
import com.smallstrong.dragimage.OnPhotoTapListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 2017/4/6.
 */

public class ViewPagerActivity extends AppCompatActivity {
    private CusViewPager cusViewPager;
    private List<DragImage> dragImageList = new ArrayList<>();
    private List<Integer> imageRes = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        cusViewPager = (CusViewPager) findViewById(R.id.vp);
        imageRes.add(R.mipmap.view_guide_img_1);
        imageRes.add(R.mipmap.view_guide_img_2);
        imageRes.add(R.mipmap.view_guide_img_3);
        imageRes.add(R.mipmap.ic_launcher);
        imageRes.add(R.mipmap.ic_redpackage);


        for (Integer imageRe : imageRes) {
            DragImage dragImage = (DragImage) View.inflate(this, R.layout.item_image, null);
            dragImage.setImageResource(imageRe);
            dragImageList.add(dragImage);
            dragImage.setOnPhotoTapListener(new OnPhotoTapListener() {
                @Override
                public void onPhotoTap(ImageView view, float x, float y) {
                    finish();
                }
            });
        }
        cusViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return imageRes.size();
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                container.addView(dragImageList.get(position));
                return dragImageList.get(position);
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView(dragImageList.get(position));
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }
        });
    }


}
