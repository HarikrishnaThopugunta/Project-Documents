package com.itcinfotech.passbyvaluevspassbyrefrence;

public class JavaIsPassByValueOrPassByReferenceDemo {

    public static void main(String[] args) {

        final Student s = new Student(1);

        System.out.println("before call s===>" +s.hashCode());
        System.out.println("before call student id ===>" +s.getId());
        s.setId(2);

        m1(s);//12345

        System.out.println("after called s ==>" + s.hashCode());
        System.out.println("after call student id ===>" +s.getId());
        //s= new Student(12345);
    }

    public static void m1(Student formalStudentObj) {//12345
        ///
        formalStudentObj.setId(3);
        System.out.println("before formalStudentObj===>" +formalStudentObj.hashCode());
        System.out.println("before formalStudentObj id===>" +formalStudentObj.getId());

      //  Student newLocalStudent = new Student(22222);//new

       // formalStudentObj = newLocalStudent;
        System.out.println("after formalStudentObj===>" +formalStudentObj.hashCode());
        System.out.println("after formalStudentObj id ===>" +formalStudentObj.getId());

    }

}


class Student {

    private Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
