package Project;

public class ProjectTest {

	public static void main(String[] args) {
	Project iD = new Project();
	
	iD.setDescription("good");
	iD.setName("ahmad");
	System.out.println(iD.elevatorPitch());
	System.out.println(iD.elevatorPitch("ahmad","good"));
	}

}
