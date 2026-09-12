package immutableClassProgram;

public final class College {

	private final int collegeId;
	private final String collegeName;
	private final String university;
	private final String principalName;
	private final String course;
	private final String location;
	private final int studentCount;

	College(int collegeId, String collegeName, String university, String principalName, String course, String location, int studentCount) {

		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.university = university;
		this.principalName = principalName;
		this.course = course;
		this.location = location;
		this.studentCount = studentCount;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public String getCourse() {
		return course;
	}

	public String getLocation() {
		return location;
	}

	public int getStudentCount() {
		return studentCount;
	}

}
