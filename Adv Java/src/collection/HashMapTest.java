package collection;
import java.util.*;
import java.io.*;
class HashMapTest{
	
	
	static HashMap<Integer,String> hm = new HashMap<Integer, String>();
	//1. add student record

	public static void insertData()throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			// System.out.println("enter key and value:");
			System.out.println("Enter roll no:");
			int rollno = Integer.parseInt(br.readLine());

			System.out.println("Enter the name:");
			String name = br.readLine();

			hm.put(rollno, name);

	}

	//2. display all student 

	public static void displayData(){

			System.out.println("Records all students:");
			for(@SuppressWarnings("rawtypes") Map.Entry m: hm.entrySet()){

				System.out.println(m.getKey()+" "+m.getValue());

			}
	}

	public static void main(String args[]) throws IOException{

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//user choice

			System.out.println("1. insert data"+"\n"+"2. display data"+"\n"+"3. exit");

		   int flag = 1;

			while(flag == 1){

			System.out.println("enter your operation choice:");
			int choice = Integer.parseInt(br.readLine());

			switch(choice){

				case 1: insertData();
						break;

			    case 2: displayData();
			    		break;

			    case 3: flag = 0;		

			    default: System.out.println("not in above");	
			}
		}

	}
}