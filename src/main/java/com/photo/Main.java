package com.photo;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	static {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

	public static void main(String[] args) {
		CascadeClassifier faceDetector = new CascadeClassifier(
				"/Users/wangliang/Downloads/opencv-3.4.1/data/haarcascades/haarcascade_frontalface_alt.xml");
		String imagePath = "/Users/wangliang/Downloads/20170803144332211.png";
		Mat image = Imgcodecs.imread(imagePath);
		Mat dst = new Mat();
		Imgproc.cvtColor(image, dst, Imgproc.COLOR_BGR2HSV);
		Mat dst2 = new Mat();
		double[] b1 = new double[] {78, 43, 46};
		Scalar lowerb = new Scalar(b1);
		double[] b2 = new double[] {110, 255, 255};
		Scalar upperb = new Scalar(b2);
		Core.inRange(dst, lowerb, upperb, dst2);
		LOG.info(image.toString());

	}
}
