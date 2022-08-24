package manga;

import java.io.File;
import java.io.IOException;

public class Class {
	public static void main(String[] args) throws IOException {
		File f=new File("E:\\File\\newfile\\photo.txt");
		File f1=new File("E:\\File\\newFile\\pho.txt");
		//boolean b=f.mkdir();
		//boolean b=f.mkdirs();
		boolean b=f.createNewFile();
		System.out.println(b);
		boolean c=f.canExecute();
		System.out.println(c);
	boolean c1=	f.canRead();
	System.out.println(c1);
		boolean c2=f.canWrite();
		System.out.println(c2);
		String[]l=f.list();
}}
