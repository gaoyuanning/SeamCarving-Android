package com.android.cs190i.project;

import java.io.FileNotFoundException;

import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.imgproc.Imgproc;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageProcessActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_imageprocess);
		
		ImageView im = (ImageView) findViewById(R.id.imageView1);
		Uri imageUri=Uri.parse("file://"+MainActivity.filePath);
		
		Bitmap bm;
		try {
			bm = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
			im.setImageBitmap(bm);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			      
		
		im.setImageURI(imageUri);
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		finish();
	}
	
}
