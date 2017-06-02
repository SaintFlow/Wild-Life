package commonflow.wildlife;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.FileInputStream;
import java.util.List;

import commonflow.wildlife.dummy.AnimalPicture;
import commonflow.wildlife.dummy.DBHandler;

/**
 * Created by Randy on 5/29/2017.
 */
public class CustomPagerAdapter extends PagerAdapter
{

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    DBHandler db;
    List<AnimalPicture> animals;

    public CustomPagerAdapter(Context context, String animal)
    {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        db = new DBHandler(context);

        animals = db.getAnimalList(animal);


    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        Bitmap b = null;
        try
        {
            FileInputStream fis = mContext.openFileInput(animals.get(position).getAnimal_picture_url());
            //Log.d("name", animals.toString());
            b = BitmapFactory.decodeStream(fis);
        } catch (Exception io)
        {
            io.printStackTrace();
        }
        imageView.setImageBitmap(b);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == ((LinearLayout) object);
    }

    @Override
    public int getCount()
    {
        return animals.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
