
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class cricket implements serializable{
	String name;
	int run;
	float average;
	public cricket(String name,int run,float average) {
		super();
		this.name=name;
		this.run=run;
		this.average=average;
		
	}
	void display() {
		System.out.println(name);
		System.out.println(run);
		System.out.println(average);
	}
	

public class cricketer {

	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		cricket c=new cricket("sachin",2000,48.5f);
		c.display();
		String path="c://ioprg//input.txt";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
	}
	}

}
