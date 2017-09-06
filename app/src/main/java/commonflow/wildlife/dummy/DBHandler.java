package commonflow.wildlife.dummy;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Randy on 5/23/2017.
 * Handles the database and SQL requests
 */
public class DBHandler extends SQLiteOpenHelper
{

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "animals";

    private static final String TABLE_ANIMAL_DETAIL = "animalPic";

    private static final String KEY_ID = "id";
    private static final String KEY_ANIMAL = "animal";
    private static final String KEY_PICTURE_URL = "picture_url";
    //private static final String KEY_DESCRIPTION = "description";

    public DBHandler(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    //creating tables
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_ANIMAL_DETAIL_TABLE = "CREATE TABLE " + TABLE_ANIMAL_DETAIL + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + KEY_ANIMAL + " TEXT,"
                + KEY_PICTURE_URL + " TEXT " + ")";
        db.execSQL(CREATE_ANIMAL_DETAIL_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        //Drop the older table if it existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ANIMAL_DETAIL);

        //Create table again
        onCreate(db);
    }

    public void addNewAnimalPicture(AnimalPicture apc)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(KEY_ANIMAL, apc.getAnimal_name());
        values.put(KEY_PICTURE_URL, apc.getAnimal_picture_url());



        //Inserting row
        db.insert(TABLE_ANIMAL_DETAIL, null, values);
        db.close();
    }

    public boolean deleteAnimalPicture(int delID)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        return db.delete(TABLE_ANIMAL_DETAIL, KEY_ID + "=" + delID, null) > 0;
    }

    /*public int getAnimalSize(String animal)
    {
        String selectQuery = "SELECT COUNT(" + KEY_ID + ") FROM " + TABLE_ANIMAL_DETAIL;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        int size = cursor.getInt(0);
        cursor.close();
        return size;
    }*/

    public List<AnimalPicture> getAnimalList(String animal)
    {
        List<AnimalPicture> animalList = new ArrayList<>();
        String selectQuery = "SELECT  * FROM " + TABLE_ANIMAL_DETAIL
                + " WHERE animal='" + animal + "'";

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);


        //looping through all rows and adding to list
        if(cursor.moveToFirst())
        {
            do {
                    AnimalPicture aniPic = new AnimalPicture();
                    //aniPic.setAnimal_id(Integer.parseInt(cursor.getString(0)));
                    aniPic.setAnimal_id(cursor.getInt(0));
                    aniPic.setAnimal_name(cursor.getString(1));
                    aniPic.setAnimal_picture_url(cursor.getString(2));

                    animalList.add(aniPic);

            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return animalList;

    }
}
