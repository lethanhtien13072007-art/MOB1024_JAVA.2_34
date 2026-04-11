package Main;

import java.util.List;
import java.util.Scanner;

import entity.Student;
import repository.repositoryStudent;

public class Lab06Main {

		static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) {
			repositoryStudent stur = new repositoryStudent();
			boolean running = true;
			

			while (running) {
				printMenu();
				int choice = getChoice();
				
				switch (choice) {
					case 1 -> {
						System.out.println("Add student:");
						System.out.print("Enter name: ");
						String nameAdd = scanner.nextLine();

						System.out.print("Enter gender: ");
						String genderAdd = scanner.nextLine();

						System.out.print("Enter GPA: ");
						double gpaAdd = scanner.nextDouble();

						Student studentAdd = new Student();
						studentAdd.setStudent_name(nameAdd);
						studentAdd.setGender(genderAdd);
						studentAdd.setGpa(gpaAdd);

						stur.insertStudent(studentAdd);	
						break;
					}
					
					case 2 -> {
						System.out.println("Display all student:");
						List<Student> list = stur.findAll();
						list = stur.findAll();
						list.stream().forEach(System.out::println);
						break;
					}
					
					case 3 -> {
						System.out.println("Remove Student");
						System.out.print("Enter ID to delete: ");
					    int idDetele = scanner.nextInt();

					    boolean deleted = stur.deleteStudent(idDetele);

					    if (deleted) {
					    	System.out.println("Delete successful!");
					    } else {
					        System.out.println("Student not found or delete failed!");
					    }
					    break;
					}
					
					case 4 -> {
						System.out.println("Update Student");
						System.out.print("Enter ID to update: ");
				        int id = scanner.nextInt();
				        scanner.nextLine();

				        System.out.print("Enter new name: ");
				        String name = scanner.nextLine();

				        System.out.print("Enter new gender: ");
				        String gender = scanner.nextLine();

				        System.out.print("Enter new GPA: ");
				        float gpa = scanner.nextFloat();

				        Student studentUpdate = new Student(id, name, gender, gpa);

				        boolean updated = stur.updateStudent(studentUpdate);

				        if (updated) {
				            System.out.println("Update successful!");
				        } else {
				            System.out.println("Update failed!");
				        }
						break;
					}
					
					case 0 -> {
						System.out.println("Exitting");
						running = false;
					}
				}
				
			}
			
			
		}
		
	    static void printMenu() {
	        System.out.println("\n===== MENU =====");
	        System.out.println("1. Add Student");
	        System.out.println("2. Display All Students");
	        System.out.println("3. Remove Student");
	        System.out.println("4. Update Student");
	        System.out.println("0. Exit");
	        System.out.print("Your choice: ");
	    }
	    static int getChoice() {
	        try {
	            return Integer.parseInt(scanner.nextLine());
	        } catch (NumberFormatException e) {
	            return -1;
	        }
	    }
	 
	}	

