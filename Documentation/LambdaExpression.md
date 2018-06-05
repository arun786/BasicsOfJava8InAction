# Lambda Expression

    import lombok.*;
    
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * Step 1 Create an Interface, which takes in an Object and returns a boolean
     */
    interface StudentPredicate {
        public boolean test(Student student);
    }
    
    /**
     * Created by Adwiti on 6/4/2018.
     */
    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public class Student {
        private int id;
        private String name;
        private int age;
    
        /**
         * Step 2 : Build a list of students
         *
         * @return
         */
        public static List<Student> StudentBuilder() {
            List<Student> students = new ArrayList<>();
            students.add(new Student(1, "sachin", 12));
            students.add(new Student(2, "rahul", 11));
            students.add(new Student(3, "sourav", 13));
            students.add(new Student(4, "dhoni", 16));
            students.add(new Student(5, "kaif", 15));
            students.add(new Student(6, "kohli", 19));
            students.add(new Student(7, "kumble", 17));
            students.add(new Student(8, "dinesh", 21));
            return students;
        }
    
        public static void main(String args[]) {
            List<Student> students = StudentBuilder();
            /**
             * lambda expression can be used for filtering student whose age is less than 15
             */
            List<Student> studentAgeLessthan15 = filterStudent(students, (student -> student.getAge() < 15));
            System.out.println(studentAgeLessthan15);
    
            /**
             * whose id is greater than 4
             */
            List<Student> studentWhoseIdIsGreaterThan4 = filterStudent(students, (student -> student.getId() > 4));
            System.out.println(studentWhoseIdIsGreaterThan4);
    
        }
    
        /**
         * Step 3 : Build a filter method which takes in Predicate and filters the data based on what is passed
         * to the filter
         *
         * @param students
         * @param studentPredicate
         * @return
         */
        public static List<Student> filterStudent(List<Student> students, StudentPredicate studentPredicate) {
            List<Student> filteredStudents = new ArrayList<>();
            for (Student student : students) {
                if (studentPredicate.test(student)) {
                    filteredStudents.add(student);
                }
            }
            return filteredStudents;
        }
    }