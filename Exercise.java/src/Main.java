class Student {
    int studentId;
    String name;
    double gpa;

    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }
}

class Node {
    Student student;
    Node left, right;

    public Node(Student student) {
        this.student = student;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Student student) {
        root = insertRec(root, student);
    }

    private Node insertRec(Node root, Student student) {
        if (root == null) {
            root = new Node(student);
            return root;
        }

        if (student.studentId < root.student.studentId)
            root.left = insertRec(root.left, student);
        else if (student.studentId > root.student.studentId)
            root.right = insertRec(root.right, student);

        return root;
    }

    public Student search(int studentId) {
        return searchRec(root, studentId);
    }

    private Student searchRec(Node root, int studentId) {
        if (root == null || root.student.studentId == studentId)
            return root == null ? null : root.student;

        if (studentId < root.student.studentId)
            return searchRec(root.left, studentId);
        else
            return searchRec(root.right, studentId);
    }

    public void delete(int studentId) {
        root = deleteRec(root, studentId);
    }

    private Node deleteRec(Node root, int studentId) {
        if (root == null)
            return root;

        if (studentId < root.student.studentId)
            root.left = deleteRec(root.left, studentId);
        else if (studentId > root.student.studentId)
            root.right = deleteRec(root.right, studentId);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.student = minValue(root.right);
            root.right = deleteRec(root.right, root.student.studentId);
        }
        return root;
    }

    private Student minValue(Node root) {
        Student minv = root.student;
        while (root.left != null) {
            minv = root.left.student;
            root = root.left;
        }
        return minv;
    }

    public void updateGPA(int studentId, double newGPA) {
        Student student = search(studentId);
        if (student != null) {
            student.gpa = newGPA;
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public double calculateAverageGPA() {
        int[] count = new int[1];
        double totalGPA = calculateTotalGPA(root, count);
        return totalGPA / count[0];
    }

    private double calculateTotalGPA(Node root, int[] count) {
        if (root == null) {
            return 0;
        }

        count[0]++;
        return root.student.gpa + calculateTotalGPA(root.left, count) + calculateTotalGPA(root.right, count);
    }

    public Student findHighestGPAStudent() {
        Node highestNode = findHighestGPA(root);
        return highestNode == null ? null : highestNode.student;
    }

    private Node findHighestGPA(Node root) {
        if (root == null || root.right == null)
            return root;

        return findHighestGPA(root.right);
    }


    public void studentsInGPARange(Node root, double minGPA, double maxGPA) {
        if (root == null)
            return;

        if (root.student.gpa >= minGPA && root.student.gpa <= maxGPA) {
            System.out.println("ID: " + root.student.studentId + ", Name: " + root.student.name + ", GPA: " + root.student.gpa);
        }

        if (root.student.gpa > minGPA)
            studentsInGPARange(root.left, minGPA, maxGPA);

        if (root.student.gpa < maxGPA)
            studentsInGPARange(root.right, minGPA, maxGPA);
    }

    // Functionality to find students with a GPA above a certain threshold
    public void studentsAboveThreshold(Node root, double threshold) {
        if (root == null)
            return;

        if (root.student.gpa > threshold) {
            System.out.println("ID: " + root.student.studentId + ", Name: " + root.student.name + ", GPA: " + root.student.gpa);
        }

        studentsAboveThreshold(root.left, threshold);
        studentsAboveThreshold(root.right, threshold);
    }
}


public class Main {
        public static void main(String[] args) {
            BinarySearchTree bst = new BinarySearchTree();
    
            // Inserting students
            bst.insert(new Student(101, "X", 3.8));
            bst.insert(new Student(102, "Y", 3.5));
            bst.insert(new Student(103, "Z", 3.9));
            bst.insert(new Student(104, "A", 3.7));
            bst.insert(new Student(105, "B", 4.0));
    
            // Search for a student by ID
            Student searchedStudent = bst.search(103);
            if (searchedStudent != null) {
                System.out.println("Searched Student: ID - " + searchedStudent.studentId +
                        ", Name - " + searchedStudent.name + ", GPA - " + searchedStudent.gpa);
            } else {
                System.out.println("Student not found.");
            }
    
            // Delete a student record by ID
            bst.delete(102);
    
            // Update GPA of a student
            bst.updateGPA(101, 4.2);
    
            // Calculate average GPA of all students
            double averageGPA = bst.calculateAverageGPA();
            System.out.println("Average GPA: " + averageGPA);
    
            // Find the student with the highest GPA
            Student highestGPAStudent = bst.findHighestGPAStudent();
            if (highestGPAStudent != null) {
                System.out.println("Student with the highest GPA: ID - " + highestGPAStudent.studentId +
                        ", Name - " + highestGPAStudent.name + ", GPA - " + highestGPAStudent.gpa);
            } else {
                System.out.println("No student found.");
            }
    
            // Additional functionalities:
            // Find students within a specified GPA range
            System.out.println("Students in GPA range 3.5 to 4.0:");
            bst.studentsInGPARange(bst.root, 3.5, 4.0);
    
            // Find students with GPA above a certain threshold
            System.out.println("Students with GPA above 3.8:");
            bst.studentsAboveThreshold(bst.root, 3.8);
        }
    }