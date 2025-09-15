package Activities;

abstract class book{
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}

class mybook extends book{
	public void setTitle(String s) {
		title=s;
	}
}

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mybook newNovel = new mybook();
		String title = "Wow book!";
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());
	}

}
