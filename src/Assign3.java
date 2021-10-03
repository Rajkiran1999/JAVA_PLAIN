import java.util.Scanner;

public class Assign3 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of feedbacks n: ");
		int n = sc.nextInt();
		names[] cs = new names[n];
		// Initialising cs:
		cs = initialiser(n);
		// Printing cs:
		printer(cs);

	}

	public static names[] initialiser(int n) {
		names[] cus = new names[n];
		names temp = new names();
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < n; j++) {
			cus[j] = new names();
		}
		System.out.println("Enter the details of the N customers Name, mobile number and feedback respectively.");
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Enter the name of the " + (i + 1) + "th customer: ");
			String name = sc.next();
			temp.setName(name);
			cus[i].name = temp.getName();
			System.out.println("Enter the mobile number of the " + i + "th customer: ");
			String mob = sc.next();
			temp.setMobilenum(mob);
			cus[i].mobilenum = temp.getMobilenum();
			System.out.println("Enter the feedback of the " + i + "th customer: ");
			double feed = sc.nextDouble();
			temp.setFeedbackRating(feed);
			cus[i].feedbackRating = temp.getFeedbackRating();
		}
		return cus;
	}

	public static void printer(names[] cust) {
		for (int j = 0; j < cust.length; j++) {
			System.out.println();
			System.out.println("Given are the details of the " + (j + 1) + "th" + " customer:");
			System.out.print("Name: ");
			System.out.println(cust[j].name);
			System.out.print("Mobile number: ");
			System.out.println(cust[j].mobilenum);
			System.out.print("Feedback: ");
			System.out.println(cust[j].feedbackRating);
		}
	}

}

class names {
	String name = "", mobilenum = "";
	double feedbackRating = 0;

	public names() {

	}

	public names(String Name, String mobno, double feedback) {
		name = Name;
		mobilenum = mobno;
		feedbackRating = feedback;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobilenum() {
		return mobilenum;
	}

	public void setMobilenum(String mobilenum) {
		this.mobilenum = mobilenum;
	}

	public double getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

}
