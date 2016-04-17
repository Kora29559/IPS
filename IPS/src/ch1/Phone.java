package ch1;

public class Phone {
	public String name;
	public String os;
	public double inch;
	public double kg;
	public int pixel;
	
	public void capture(){
		System.out.println("名字:"+name);
		System.out.println("操作系统:"+os);
		System.out.println("尺寸:"+inch);
		System.out.println("重量:"+kg);
		System.out.println("像素:"+pixel);
	}

}
