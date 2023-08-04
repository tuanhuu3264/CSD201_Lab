/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student implements Comparable<Student> {

    String code, name;
    int mark;
    Scanner sc = new Scanner(System.in);

    public Student(String code, String name, int mark) {
        this.code = code.trim().toUpperCase();
        this.name = name.trim().toUpperCase();
        this.mark = mark;
    }

    public String toString() {
        return this.code + "," + this.name + "," + this.mark;
    }

    @Override
    public int compareTo(Student o) {
        return this.code.compareTo(o.code);
    }

    public void update() {
        String newName;
        String newMark;
        System.out.print("New name, ENTER FOR BYPRASSING: ");
        newName = sc.reset().nextLine().trim().toUpperCase();
        if (!newName.isEmpty()) {
            this.name = newName;
        }
        newMark = sc.reset().nextLine().trim();
        if ((!newMark.isEmpty()) && (Integer.parseInt(newMark) >= 0)) {
            this.mark = Integer.parseInt(newMark);
        }

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
