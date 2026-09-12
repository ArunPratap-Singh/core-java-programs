package methodChaining;

public class ResumeBuilder {
	
		private String fullName;
		private int age;
		private String gender;
		private String email;
		private String phoneNumber;
		private String address;
		private String careerObjective;
		private String highestQualification;
		private String universityName;
		private String graduationYear;
		private double percentage;
		private String technicalSkills;
		private String programmingLanguages;
		private String testingTools;
		private String databaseSkills;
		private String projectName;
		private String projectDescription;
		private String experienceLevel;
		private String companyName;
		private String jobTitle;
		private String totalExperience;
		private String certifications;
		private String linkedinProfile;
		private String githubProfile;
		private String resumeStatus;

		// Setter Methods

		public ResumeBuilder setFullName(String fullName) {
			this.fullName = fullName;
			return this;
		}

		public ResumeBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public ResumeBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}

		public ResumeBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public ResumeBuilder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public ResumeBuilder setAddress(String address) {
			this.address = address;
			return this;
		}

		public ResumeBuilder setCareerObjective(String careerObjective) {
			this.careerObjective = careerObjective;
			return this;
		}

		public ResumeBuilder setHighestQualification(String highestQualification) {
			this.highestQualification = highestQualification;
			return this;
		}

		public ResumeBuilder setUniversityName(String universityName) {
			this.universityName = universityName;
			return this;
		}

		public ResumeBuilder setGraduationYear(String graduationYear) {
			this.graduationYear = graduationYear;
			return this;
		}

		public ResumeBuilder setPercentage(double percentage) {
			this.percentage = percentage;
			return this;
		}

		public ResumeBuilder setTechnicalSkills(String technicalSkills) {
			this.technicalSkills = technicalSkills;
			return this;
		}

		public ResumeBuilder setProgrammingLanguages(String programmingLanguages) {
			this.programmingLanguages = programmingLanguages;
			return this;
		}

		public ResumeBuilder setTestingTools(String testingTools) {
			this.testingTools = testingTools;
			return this;
		}

		public ResumeBuilder setDatabaseSkills(String databaseSkills) {
			this.databaseSkills = databaseSkills;
			return this;
		}

		public ResumeBuilder setProjectName(String projectName) {
			this.projectName = projectName;
			return this;
		}

		public ResumeBuilder setProjectDescription(String projectDescription) {
			this.projectDescription = projectDescription;
			return this;
		}

		public ResumeBuilder setExperienceLevel(String experienceLevel) {
			this.experienceLevel = experienceLevel;
			return this;
		}

		public ResumeBuilder setCompanyName(String companyName) {
			this.companyName = companyName;
			return this;
		}

		public ResumeBuilder setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
			return this;
		}

		public ResumeBuilder setTotalExperience(String totalExperience) {
			this.totalExperience = totalExperience;
			return this;
		}

		public ResumeBuilder setCertifications(String certifications) {
			this.certifications = certifications;
			return this;
		}

		public ResumeBuilder setLinkedinProfile(String linkedinProfile) {
			this.linkedinProfile = linkedinProfile;
			return this;
		}

		public ResumeBuilder setGithubProfile(String githubProfile) {
			this.githubProfile = githubProfile;
			return this;
		}

		public ResumeBuilder setResumeStatus(String resumeStatus) {
			this.resumeStatus = resumeStatus;
			return this;
		}

		// Print Methods

		public ResumeBuilder printFullName() {
			System.out.println("Full Name: " + fullName);
			return this;
		}

		public ResumeBuilder printAge() {
			System.out.println("Age: " + age);
			return this;
		}

		public ResumeBuilder printGender() {
			System.out.println("Gender: " + gender);
			return this;
		}

		public ResumeBuilder printEmail() {
			System.out.println("Email: " + email);
			return this;
		}

		public ResumeBuilder printPhoneNumber() {
			System.out.println("Phone Number: " + phoneNumber);
			return this;
		}

		public ResumeBuilder printAddress() {
			System.out.println("Address: " + address);
			return this;
		}

		public ResumeBuilder printCareerObjective() {
			System.out.println("Career Objective: " + careerObjective);
			return this;
		}

		public ResumeBuilder printHighestQualification() {
			System.out.println("Highest Qualification: " + highestQualification);
			return this;
		}

		public ResumeBuilder printUniversityName() {
			System.out.println("University Name: " + universityName);
			return this;
		}

		public ResumeBuilder printGraduationYear() {
			System.out.println("Graduation Year: " + graduationYear);
			return this;
		}

		public ResumeBuilder printPercentage() {
			System.out.println("Percentage: " + percentage);
			return this;
		}

		public ResumeBuilder printTechnicalSkills() {
			System.out.println("Technical Skills: " + technicalSkills);
			return this;
		}

		public ResumeBuilder printProgrammingLanguages() {
			System.out.println("Programming Languages: " + programmingLanguages);
			return this;
		}

		public ResumeBuilder printTestingTools() {
			System.out.println("Testing Tools: " + testingTools);
			return this;
		}

		public ResumeBuilder printDatabaseSkills() {
			System.out.println("Database Skills: " + databaseSkills);
			return this;
		}

		public ResumeBuilder printProjectName() {
			System.out.println("Project Name: " + projectName);
			return this;
		}

		public ResumeBuilder printProjectDescription() {
			System.out.println("Project Description: " + projectDescription);
			return this;
		}

		public ResumeBuilder printExperienceLevel() {
			System.out.println("Experience Level: " + experienceLevel);
			return this;
		}

		public ResumeBuilder printCompanyName() {
			System.out.println("Company Name: " + companyName);
			return this;
		}

		public ResumeBuilder printJobTitle() {
			System.out.println("Job Title: " + jobTitle);
			return this;
		}

		public ResumeBuilder printTotalExperience() {
			System.out.println("Total Experience: " + totalExperience);
			return this;
		}

		public ResumeBuilder printCertifications() {
			System.out.println("Certifications: " + certifications);
			return this;
		}

		public ResumeBuilder printLinkedinProfile() {
			System.out.println("LinkedIn Profile: " + linkedinProfile);
			return this;
		}

		public ResumeBuilder printGithubProfile() {
			System.out.println("GitHub Profile: " + githubProfile);
			return this;
		}

		public ResumeBuilder printResumeStatus() {
			System.out.println("Resume Status: " + resumeStatus);
			return this;
		}
	

}
