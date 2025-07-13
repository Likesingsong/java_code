package IO_Stream.custom;

public class Student {
    private String stuId;
    private String name;
    private int age;
    private String school;

    public Student() {
    }

    public Student(String stuId, String name, int age, String school) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
        this.school = school;

    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString() {
        return String.format("id: %s| name: %s| age: %d| school: %s", stuId, name, age, school);
    }
}
