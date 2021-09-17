//package com.example.demo;
//
//import org.fit.cssbox.demo.ImageRenderer;
//import org.fit.cssbox.layout.Dimension;
//import org.junit.jupiter.api.Test;
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
//
//import java.io.*;
//
//class ReloadImageTest {
//
//
////	@Test
//	void contextLoads() {
//		ImageRenderer render = new ImageRenderer();
//
//		Dimension dimension = new Dimension(420, 800);
//		render.setWindowSize(dimension, false);
////		String url = "http://172.20.240.204:5500/dom_to_image.html";
//
//		String url="http://127.0.0.1:5501/index.html";
//		File file;
//		InputStream inputStream = null;
//		byte[] data = null;
//
//		try {
//			//创建一个临时文件
//			file = File.createTempFile("temp", ".png");
//			//将html转为png
//			FileOutputStream out = new FileOutputStream(file);
//
//			render.renderURL(url, out);
//			//字节流读取png
//			inputStream = new FileInputStream(file);
//			data = new byte[inputStream.available()];
//			inputStream.read(data);
//
//			out.close();
//			inputStream.close();
//			file.deleteOnExit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		BASE64Encoder encoder = new BASE64Encoder();
//		String ss = encoder.encode(data).replaceAll("\n", "").replaceAll("\r", "");
//
//		System.out.println(ss);
//		generateImage(ss);
//	}
//
//	//把base64转成本地图片
//	public static boolean generateImage(String imgStr) {
//		if(imgStr == null){
//			return false;
//		}
//
//		BASE64Decoder decoder = new BASE64Decoder();
//		try{
//			byte[] b = decoder.decodeBuffer(imgStr);
//
//			for (int i = 0;i<b.length;++i){
//				if(b[i]<0){
//					b[i]+=256;
//				}
//			}
//			OutputStream out = new FileOutputStream(new File("d:/html.png"));
//
//			out.write(b);
//			out.flush();
//			out.close();
//			return true;
//		} catch (IOException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//
//}
