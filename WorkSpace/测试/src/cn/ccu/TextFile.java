package cn.ccu;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
  测试File类的基本用法
 * @author dell
 *
 */
public class TextFile {
	
	public static void main(String[] args) throws IOException {
		File f = new File("d:/a.txt");
		System.out.println(f);						//为文件创建对象
		f.renameTo(new File("d:/bb.txt"));		//更改文件名字
		
		System.out.println(System.getProperty("user.dir"));		//打印文件所在目录。默认eclipse
		
		File f2 = new File("gg.txt");		
	//	f2.createNewFile();				创建新文件夹
		//f2.delete();
		System.out.println("File是否存在:"+f2.exists());
		System.out.println("Flie是否是目录"+f2.isDirectory());
		System.out.println("File是否是文件"+f2.isFile());
		System.out.println(" File最后修改时间"+new Date(f2.lastModified()));
		System.out.println("File的大小:"+f2.length());
		System.out.println("File的文件名"+f2.getName());
		System.out.println("File的目标路径"+f2.getAbsolutePath());
		
		//创建目录（文件夹）
		File f3 = new File("d:/电影/华语/大陆");
		boolean flag = f3.mkdir();		//使用mkdir来创建目录，如果创建路径中有一级不存在，就会创建失败噢
		System.out.println(flag);		//创建失败
		
		File f4 = new File("d:/电影/华语/大陆");
		boolean flag1 = f4.mkdirs();	//使用midirs来创建目录，即使创建路径中有不存在的级，也不会创建失败
		System.out.println(flag1);		//创建成功
	}
}
