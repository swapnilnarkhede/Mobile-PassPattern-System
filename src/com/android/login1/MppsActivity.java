package com.android.login1;



import android.R.color;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MppsActivity extends Activity implements OnClickListener 
{
    /** Called when the activity is first created. */
	SQLiteDatabase db;
	Button []btn_arr =new Button[25];
	String key="";
	String check;
	String pass;
	Editor editor;
	String someString;
	int i=0;
	boolean flag=false;
	int no=0;
	
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        
        btn_arr[0]=(Button) findViewById(R.id.one);
	    btn_arr[1]=(Button) findViewById(R.id.two);
	    btn_arr[2]=(Button) findViewById(R.id.three);
	    btn_arr[3]=(Button) findViewById(R.id.four);
	    btn_arr[4]=(Button) findViewById(R.id.five);
	    btn_arr[5]=(Button) findViewById(R.id.six);
	    btn_arr[6]=(Button) findViewById(R.id.seven);
	    btn_arr[7]=(Button) findViewById(R.id.eight);
	    btn_arr[8]=(Button) findViewById(R.id.nine);
	    btn_arr[9]=(Button) findViewById(R.id.ten);
	    btn_arr[10]=(Button) findViewById(R.id.eleven);
	    btn_arr[11]=(Button) findViewById(R.id.tvelve);
	    btn_arr[12]=(Button) findViewById(R.id.thirteen);
	    btn_arr[13]=(Button) findViewById(R.id.fourteen);
	    btn_arr[14]=(Button) findViewById(R.id.fifteen);
	    btn_arr[15]=(Button) findViewById(R.id.sixteen);
	    btn_arr[16]=(Button) findViewById(R.id.seventeen );
	    btn_arr[17]=(Button) findViewById(R.id.eighteen);
	    btn_arr[18]=(Button) findViewById(R.id.ninteen);
	    btn_arr[19]=(Button) findViewById(R.id.tventy);
	    btn_arr[20]=(Button) findViewById(R.id.tventy1);
	    btn_arr[21]=(Button) findViewById(R.id.tventy2);
	    btn_arr[22]=(Button) findViewById(R.id.tventy3);
	    btn_arr[23]=(Button) findViewById(R.id.tventy4);
	    btn_arr[24]=(Button) findViewById(R.id.tventy5);
        
      //create table and databse
	    db=openOrCreateDatabase("MyPass", SQLiteDatabase.OPEN_READWRITE, null);
	    db.execSQL("create table if not exists pass(no integer,pass text)");
	    
    random();    
    
	for(int i=0;i<25;i++)
	      btn_arr[i].setOnClickListener(this);
	
	
    }

    
    
    private void random() 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<25;i++)
        {
        	int j=(int) (0+Math.random()*10);
        btn_arr[i].setText(""+j);
       // btn_arr[i].setBackgroundColor(color.transparent);
        }
	}	
    
    
    



	public void onClick(View v) 
	{

		switch(v.getId())
		{
		case R.id.one:
			  key=key+"a";
			  //btn_arr[0].setBackgroundColor(Color.CYAN);
			  break;
			             
		case R.id.two:
            key=key+"b";
            //btn_arr[1].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.three:
            key=key+"c";
           // btn_arr[2].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.four:
            key=key+"d";
            //btn_arr[3].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.five:
            key=key+"e";
            //btn_arr[4].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.six:
            key=key+"f";
            //btn_arr[5].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.seven:
            key=key+"g";
            //btn_arr[6].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.eight:
            key=key+"h";
            //btn_arr[7].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.nine:
            key=key+"i";
            //btn_arr[8].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.ten:
            key=key+"j";
            //btn_arr[9].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.eleven:
            key=key+"k";
            //btn_arr[10].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.tvelve:
            key=key+"l";
            //btn_arr[11].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.thirteen:
            key=key+"m";
            //btn_arr[12].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.fourteen:
            key=key+"n";
            //btn_arr[13].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.fifteen:
            key=key+"o";
            //btn_arr[14].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.sixteen:
            key=key+"p";
            //btn_arr[15].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.seventeen:
            key=key+"q";
            //btn_arr[16].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.eighteen:
            key=key+"r";
            //btn_arr[17].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.ninteen:
            key=key+"s";
           // btn_arr[18].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.tventy:
            key=key+"t";
            //btn_arr[19].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.tventy1:
            key=key+"u";
           // btn_arr[20].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.tventy2:
            	key=key+"v";
            //	btn_arr[21].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.tventy3:
            	key=key+"w";
            	//btn_arr[22].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.tventy4:
            	key=key+"x";
            	//btn_arr[23].setBackgroundColor(Color.CYAN);
            break;
            
		case R.id.tventy5:
            	key=key+"y";
            	//btn_arr[24].setBackgroundColor(Color.CYAN);
            break;

		}
		
		
		i=i+1;
		if(i==4)
		{
		
			//open DB and get data 
		Cursor cur=db.query("pass", null, null, null, null, null, null);
	
	    if(cur.getCount() > 0)
	    {
	    	cur.moveToFirst();
	    	no=cur.getInt(0);
    		someString=cur.getString(1);
	    }
		
		
			
		if(no==1)
			{
				//Toast.makeText(getApplicationContext(),"password="+key+"new pass"+someString, Toast.LENGTH_LONG).show();
				if(someString.equalsIgnoreCase(key))
				{
					Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_LONG).show();
					Intent intent = new Intent(MppsActivity.this,LoginActivity.class);
					startActivity(intent);
					finish();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_LONG).show();
					finish();
				}
			}
		else
			{
			                if(flag==false)
			                 {
			                	 flag= true;
			                	 check = key;
			                	 i=0;
			                	 Toast.makeText(getApplicationContext(),"Enter the password again=", Toast.LENGTH_LONG).show();
			                	 key="";
			                	 random();
			                 }
			                 else
			                 { 
			                	 if(key.equalsIgnoreCase(check))
			                	 {
			                		 no=1;
			                		 ContentValues values=new ContentValues();
			                		 values.put("no", no);
			                		 values.put("pass", check);
			                		 db.insert("pass", null,values);
			                		Intent intent = new Intent(MppsActivity.this,LoginActivity.class);
			    					startActivity(intent);
			    					finish();
			                	 }
			                	 else
			                	 {
			                		 Toast.makeText(getApplicationContext(), "Wrong password", Toast.LENGTH_LONG).show();
			                	     finish();
			                	 }
			                	 
			                 }
			}
	  
		}
		
		
		
	}		  
	     	
		

		

	
	
	
    
    
}