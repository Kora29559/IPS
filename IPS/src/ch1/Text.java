package ch1;

public class Text {
	public static void main(String[] args) {
		System.out.println("************************");
		Phone phone1=new Phone();
		phone1.name="ÈýÐÇN1700";
		phone1.os="°²×¿";
		phone1.inch=4.2;
		phone1.kg=200;
		phone1.pixel=800;
		phone1.capture();
		System.out.println("************************");
		Phone phone2=new Phone();
		phone2.name="iPhone6s";
		phone2.os="ios";
		phone2.inch=4.7;
		phone2.kg=143;
		phone2.pixel=1200;
		phone2.capture();
		System.out.println("************************");
	}

}
