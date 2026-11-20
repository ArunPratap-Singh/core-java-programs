package builderPattern;

public class Student {

    private String name;
    private int age;
    private int id;
    private String course;
    private String college;
    private double percentage;

    private Student() {

    }

    private Student(String name, int age, int id, String course, String college, double percentage) {

        this.name = name;
        this.age = age;
        this.id = id;
        this.course = course;
        this.college = college;
        this.percentage = percentage;

    }

    private Student(Builder b) {
        
    	this(b.name, b.age, b.id, b.course, b.college, b.percentage);
    }

    @Override
    public String toString() {
       
    	return "Student [Name is: " + name + ", Age is: " + age + ", Id is: " + id + ", Course is: " + course + ", College is: " + college + ", Percentage is: " + percentage + "]";
    }

    static class Builder {

        private String name;
        private int age;
        private int id;
        private String course;
        private String college;
        private double percentage;

        public Builder setName(String name) {
            
        	this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            
        	this.age = age;
            return this;
        }

        public Builder setId(int id) {
            
        	this.id = id;
            return this;
        }

        public Builder setCourse(String course) {
            
        	this.course = course;
            return this;
        }

        public Builder setCollege(String college) {
            
        	this.college = college;
            return this;
        }

        public Builder setPercentage(double percentage) {
            
        	this.percentage = percentage;
            return this;
        }

        public Student build() {
           
        	return new Student(this);
        }

    }

}



