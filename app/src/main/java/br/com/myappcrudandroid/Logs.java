package br.com.myappcrudandroid;

/**
 * Created by Diego Pereira on 08/05/2020.
 */

import java.io.FileOutputStream;
import android.app.Activity;
import android.widget.Toast;

public class Logs extends Activity {

    private String data = "";
    private String file = "log";

    public void escrever(String id, String operacao){
        data = "reste";
        try {
            FileOutputStream fOut = openFileOutput(file, MODE_WORLD_READABLE);
            fOut.write(data.getBytes());
            fOut.close();
            Toast.makeText(getBaseContext(), "file saved", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            System.err.println("PROBLEMAS AO GRAVAR INFORMAÇÕES NO ARQUIVO DE LOG++++++++++: "+ e);
        }
    }
}