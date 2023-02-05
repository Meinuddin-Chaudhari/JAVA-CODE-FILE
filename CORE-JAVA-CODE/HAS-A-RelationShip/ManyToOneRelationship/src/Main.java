public class Main {

	public static void main(String[] args) {
	
		Branch branch = new Branch();
		branch.setbId("IND100");
		branch.setbName("bengaluru");

		Student s1 = new Student();

		    s1.setsId("56");
			s1.setsName("ayan");
			s1.setsAddr("nallasopara");
			s1.setBranch(branch);
			
			Student s2 = new Student();

		    s2.setsId("78");
			s2.setsName("jishan");
			s2.setsAddr("miraroad");
			s2.setBranch(branch);
			
			Student s3 = new Student();

		    s3.setsId("89");
			s3.setsName("rehan");
			s3.setsAddr("malad");
			s3.setBranch(branch);
			
			System.out.println("Student details are :: ");
			System.out.println("ID    :: " + s1.getsId());
			System.out.println("NAME  :: " + s1.getsName());
			System.out.println("ADDR  :: " + s1.getsAddr());
			System.out.println("BID   :: " + s1.getBranch().getbId());
			System.out.println("BNAME :: " + s1.getBranch().getbName());
			System.out.println("========================================");

			System.out.println("ID  :: " + s2.getsId());
			System.out.println("NAME:: " + s2.getsName());
			System.out.println("ADDR:: " + s2.getsAddr());
			System.out.println("BID   :: " + s2.getBranch().getbId());
			System.out.println("BNAME :: " + s2.getBranch().getbName());
			System.out.println("========================================");

			System.out.println("ID  :: " + s3.getsId());
			System.out.println("NAME:: " + s3.getsName());
			System.out.println("ADDR:: " + s3.getBranch().getbId());
			System.out.println("BID   :: " + s3.getBranch().getbId());
			System.out.println("BNAME :: " + s3.getBranch().getbName());		
	}
}
