package JavaBasicsPkg;

import java.util.Scanner;

public class studentsMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentCount = sc.nextInt();
        
        int[][] students = new int[studentCount][3];

//        for (int i = 0; i < studentCount; i++) {
//        	System.out.println("For Student " + (i+1) + ": ");
//        	for(int j=0; j<3; j++)
//        	{
//        		System.out.print("Enter marks of Subject " + (j+1) + ": ");
//                int marks = sc.nextInt();
//                students[i][j] = marks;
//        	}
//        	
//        }
        int studentIndex = 1;
        for (int[] student : students) {
            System.out.println("For Student " + studentIndex + ": ");
            int subjectIndex = 1;
            for (int marks : student) {
                System.out.print("Enter marks of Subject " + subjectIndex + ": ");
                marks = sc.nextInt();
                // Assigning the entered marks back to the array
                student[subjectIndex - 1] = marks;
                subjectIndex++;
            }
            studentIndex++;
        }
        
        
        for (int[] row : students) {
            for (int marks : row) {
                System.out.print(marks + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < studentCount; i++) {
            int totalMarks = students[i][0] + students[i][1] + students[i][2];
            double percentage = (totalMarks / 3.0);
            System.out.println("Student " + (i+1) + "'s Percentage: " + percentage);
        }
        
        
	}

}
