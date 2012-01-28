package com.android.login1;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


import android.app.Activity;
import android.os.Bundle;
//import android.os.StrictMode;
//import android.os.StrictMode.ThreadPolicy;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity 
{
	//Button b1;
	//EditText name,pass;
	Button ok;
	EditText name;
	EditText pass;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ok=(Button) findViewById(R.id.btn_ok);
        name=(EditText) findViewById(R.id.name);
        pass=(EditText) findViewById(R.id.pass);
        ok.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				String strname=name.getText().toString();
				String strpass=pass.getText().toString();
				
				if(strname.equals("") || (strpass.equals("")))
				{
					Toast.makeText(getApplicationContext(), "Your Text Field is Empty Please Fill Data", 1000).show();
				}
				
				
				else
				{
					String val=executeHttpGet(strname,strpass);
					if (val.trim().equals("1"))
	              {
	              	        	
	              	Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_SHORT).show();
	              }
	              
	              else if (val.trim().equals("0"))
	              {
	              	
	              	Toast.makeText(getApplicationContext(), "Login successfully" + "  " +strname, Toast.LENGTH_SHORT).show();
	              }
				}
				
			}
		});
       
    }
    public String executeHttpGet(String user,String pass)  {

        StringBuffer b = new StringBuffer();
        InputStream is = null;
        URL url;
        HttpURLConnection con = null;
//        ThreadPolicy tp = ThreadPolicy.LAX;
//        StrictMode.setThreadPolicy(tp);
        String site="";
        try {
            String sUrl =
 "http://192.168.100.44:8086/MyLogin/login?user="+user+"&pass="+pass;
            url = new URL(sUrl);
                        con = (HttpURLConnection) url.openConnection();
                        con.setReadTimeout(10000 /* milliseconds */);
                        con.setConnectTimeout(25000 /* milliseconds */);
                        con.setRequestMethod("GET");
                        con.setDoInput(true);
                        //this.page=url.getPath();
                   site=url.getQuery();
                        //con.addRequestProperty("Referer", "http://blog.dahanne.net");
                        // Start the query
                        con.connect();
                        is = con.getInputStream();


            int ch;
            while ((ch = is.read()) != -1) {
                b.append((char) ch);
            }
            if (is != null) {
                is.close();
            }

            if (con != null) {
                con.disconnect();
            }
        } catch (Exception e) {
                Toast.makeText(this,
                    "error is "+e.toString() +" "+site,
                    Toast.LENGTH_SHORT).show();
             e.printStackTrace();
        }
      //  this.page=b.toString();
       // category = b.toString().split("#");

return b.toString();
        }

}
