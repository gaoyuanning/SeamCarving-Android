package com.android.cs190i.project;

import java.io.File;

import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

public class ImageScaling 
{
	public static Mat normalScaling(Mat imageI, int width, int height)
	{
		Mat imageO = new Mat(new Size(width,height), CvType.CV_8UC1);
		Imgproc.resize(imageI, imageO, new Size(width, height));
		return imageO;
	}
	
}
