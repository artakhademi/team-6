package edu.depaul.cdm.se452.concept.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GradeKey implements Serializable {
    @Column (name = "CLASS_ID")
    private int classId;
    @Column (name = "STUDENT_ID")
    private int studentId;

    public GradeKey(int classId, int studentId){
        this.classId = classId;
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o){

        if(this == o) return true;
        else if(!(o instanceof GradeKey)) return false;

        GradeKey g = (GradeKey) o;
        if(this.classId == g.classId && this.studentId == g.studentId) return true;
        else return false;
    }
}
