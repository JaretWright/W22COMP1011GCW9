import java.util.HashMap;
import java.util.Set;

public class Student implements Comparable<Student> {
    private String firstName, lastName;
    private int studentNum;
    private HashMap<String, Integer> courses;

    public Student(String firstName, String lastName, int studentNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNum(studentNum);
        courses = new HashMap<>();
    }

    /**
     * This method will add a course code and a grade to the courses completed
     * @return
     */
    public void addGrade(String courseCode, int grade)
    {
        //course codes look like COMP 1011 -> 4 upper case letters followed by 4 numbers
        if (courseCode.matches("[A-Z]{4}\\s\\d{4}"))
        {
            if (grade >= 0 && grade <= 100)
            {
                courses.put(courseCode,grade);
            }
            else
                throw new IllegalArgumentException("grade must be in the range 0-100");
        }
        else
            throw new IllegalArgumentException("Course code must be 4 upper case letters, " +
                    "a space and 4 digits");
    }

    public Set<String> getCourseCodes()
    {
        return courses.keySet();
    }

    public double getAvgGrade()
    {
        if (courses.size()==0)
            return 0;

        double sum = 0;
        for (int grade : courses.values())
        {
            sum += grade;
        }
        return sum / courses.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public HashMap<String, Integer> getCourses() {
        return courses;
    }

    public void setCourses(HashMap<String, Integer> courses) {
        this.courses = courses;
    }

    public String toString()
    {
        return String.format("%d %s, %s", studentNum,firstName, lastName);
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.studentNum - otherStudent.studentNum;
    }
}
