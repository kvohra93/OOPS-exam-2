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
public class Driver {

    
    public static void main(String[] args) {
        Person p = new Person("Andrew Gomez");
        Student s = new Student("Judy Thompson");
        Employee e = new Employee("Anop Makheeja");
        Faculty f = new Faculty("Mat Hew");
        Staff st = new Staff("Domino D");

        System.out.println(p.toString());
        System.out.println("-------------------------");
        System.out.println(s.toString());
        System.out.println("-------------------------");
        System.out.println(e.toString());
        System.out.println("-------------------------");
        System.out.println(f.toString());
        System.out.println("-------------------------");
        System.out.println(st.toString());
        System.out.println("-------------------------");
    }

}
