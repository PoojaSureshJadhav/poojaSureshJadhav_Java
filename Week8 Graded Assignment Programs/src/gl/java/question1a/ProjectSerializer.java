package gl.java.question1a;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectSerializer {

	List<Employee> elist1 = new ArrayList<>();
	List<Employee> elist2 = new ArrayList<>();
	List<Employee> elist3 = new ArrayList<>();
	Map<Project, List<Employee>> projectMap1 = new HashMap<>();

	public void serializeProjectDetails(Map<Project, List<Employee>> projectMap) {
		// Serialization logic
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("projectData.ser"))) {
			oos.writeObject(projectMap);
			System.out.println("Serialized Map of Project Successfully....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deserializeProjectDetails() {
		// DeSerialization logic
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("projectData.ser"))) {
			Map<Project, List<Employee>> deserializedMap = (Map<Project, List<Employee>>) ois.readObject();

			// Displaying the DeSerialized data
			for (Map.Entry<Project, List<Employee>> entry : deserializedMap.entrySet()) {
				Project project = entry.getKey();
				List<Employee> employees = entry.getValue();

				System.out.println("The Project\n" + project + " Has the following Employees");
				System.out.println("Employees .............");
				for (Employee employee : employees) {
					System.out.println(employee);
				}
				System.out.println();
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Sample data and usage
		ProjectSerializer projectSerializer = new ProjectSerializer();

		
		
		//Code to populate e_lists and projectMap1 with sample data
		Project project1 = new Project("P1","Music Synthesizer",23);
		Project project2 = new Project("P2","Vehicle Movement Tracker",13);
		Project project3 = new Project("P3","Liquid Viscosity Finder",15);
		
		Employee e1 = new Employee("E001","Harsha","9383993933","RTNagar",1000);
		Employee e2 = new Employee("E002","Harish","9354693933","Jayanagar",2000);
		Employee e3 = new Employee("E003","Meenal","9383976833","Malleswaram",1500);		
		projectSerializer.elist1.add(e1);
		projectSerializer.elist1.add(e2);
		projectSerializer.elist1.add(e3);
		
		Employee e4 = new Employee("E004","Sundar","9334593933","Vijayanagar",3000);
		Employee e5 = new Employee("E005","Suman","9383678933","Indiranagar",2000);
		Employee e6 = new Employee("E006","Suma","9385493933","KRPuram",1750);		
		projectSerializer.elist2.add(e4);
		projectSerializer.elist2.add(e5);
		projectSerializer.elist2.add(e6);
		
		Employee e7 = new Employee("E007","Chitra","9383978933","Koramangala",4000);
		Employee e8 = new Employee("E008","Suraj","9383992133","Malleswaram",3000);
		Employee e9 = new Employee("E009","Manu","9345193933","RTNagar",2000);		
		projectSerializer.elist3.add(e7);
		projectSerializer.elist3.add(e8);
		projectSerializer.elist3.add(e9);
		
		projectSerializer.projectMap1.put(project1, projectSerializer.elist1);
		projectSerializer.projectMap1.put(project2, projectSerializer.elist2);
		projectSerializer.projectMap1.put(project3, projectSerializer.elist3);
		
		System.out.println("SerializeData");		
		projectSerializer.serializeProjectDetails(projectSerializer.projectMap1);

		System.out.println("DeSerializeData");
		projectSerializer.deserializeProjectDetails();
		
	}

	@Override
	public String toString() {
		return "ProjectSerializer [elist1=" + elist1 + ", elist2=" + elist2 + ", elist3=" + elist3 + ", projectMap1="
				+ projectMap1 + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

//	@Override
//	public String toString() {
//		return "ProjectSerializer [elist1=" + elist1 + ", elist2=" + elist2 + ", elist3=" + elist3 + ", projectMap1="
//				+ projectMap1 + "]";
//	}
	
}
