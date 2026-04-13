package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testTotalMarksCalculation() {
        // Input: CAT=25, Assignment=15, FAT=45
        // Expected Total: 85.0
        Student s = new Student("TestUser", 25, 15, 45);
        assertEquals(85.0, s.totalMarks, 0.01);
    }

    @Test
    public void testGPACalculation() {
        // Total 85 / 10 = 8.5 GPA
        Student s = new Student("TestUser", 25, 15, 45);
        assertEquals(8.5, s.gpa, 0.01);
    }

    @Test
    public void testGradeLogic() {
        // Total 95 should result in an "S" grade
        Student s = new Student("Topper", 30, 20, 45);
        assertEquals("S (Excellent)", s.grade);
        
        // Total 45 should result in an "F" grade
        Student s2 = new Student("FailUser", 10, 10, 25);
        assertEquals("F (Fail)", s2.grade);
    }
}
