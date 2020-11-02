/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndSubClass;

/**
 *
 * @author Kunal
 */
public class Faculty extends Employee {

    private String officeHours;
    private int SubjectNo;

    public Faculty(String name, String officeHours, int subjectNo) {
        super(name);
        this.officeHours = officeHours;
        this.SubjectNo = subjectNo;
    }
    
    public Faculty(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Faculty Class\nName of Faculty: " + super.getName();
    }
}
