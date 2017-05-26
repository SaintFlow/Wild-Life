package commonflow.wildlife.dummy;

import android.content.Context;
import android.graphics.Bitmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * Created by Commo on 5/11/2017.
 */
public class FileChecker {

    private File outputStream;
    private String filename = "pictures.txt";
    private Context c;

    public FileChecker(Context context)
    {
        c = context;
        File outputStream = context.getFileStreamPath(filename);
        if (outputStream == null || !outputStream.exists())
        {
            outputStream = new File(context.getFilesDir(), filename);
            try {
                outputStream.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void createNewFile(Bitmap bm, String filename)
    {
        FileOutputStream out = null;
        try
        {
            out = new FileOutputStream(filename);
            bm.compress(Bitmap.CompressFormat.PNG, 100, out);
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (out != null)
                {
                    out.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }

    public void writeToFile(String line)
    {
        try {
/*            OutputStream writer = c.openFileOutput(filename, c.MODE_APPEND);

            writer.write(line.getBytes());
            writer.close();*/

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c.openFileOutput(filename, c.MODE_APPEND));
            outputStreamWriter.write(line + "\n");
            outputStreamWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> getAnimalLocations(String animal)
    {
        int num;
        ArrayList<String> animalList = new ArrayList<String>();
        try {
            InputStream inputStream = c.openFileInput(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";

            while((line = bufferedReader.readLine()) != null)
            {
                String[] split = line.split(", ");
                if (split[0].equals(animal))
                {
                    animalList.add(split[1]);
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return animalList;
    }

    public String printFile()
    {
        String line = "";
        String outt = "";
        try {
            InputStream inputStream = c.openFileInput(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            while((line = bufferedReader.readLine()) != null)
            {
                outt = outt + line;
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return outt;
    }

    public void deleteFile()
    {
        File outputStream = c.getFileStreamPath(filename);
        outputStream.delete();
    }
}
