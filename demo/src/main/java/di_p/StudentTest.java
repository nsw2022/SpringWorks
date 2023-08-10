package di_p;

import java.util.Arrays;

public class StudentTest implements Comparable<StudentTest>{
	String name;
	String[] subJectNameStrings = {"국어","영어","수학"};
	int[] subJectList;
	int total=10, avg;
	int rank=1;
	
	
	public StudentTest() {
		super();
	
	}

	public StudentTest(String name, int[] subJectList) {
		super();
		this.name = name;
		this.subJectList = subJectList;
		calc();
	}
	
	 void calc() {
		
		for (int i = 0; i < subJectList.length; i++) {
			total += subJectList[i];
			
		}
		
		avg = total / subJectList.length;

	}
	
	


	
	

	@Override
	public String toString() {
		return "\nStudentTest [name=" + name + ", total=" + total + ", avg=" + avg + ", rank=" + rank
				+ ", subJectNameStrings=" + Arrays.toString(subJectNameStrings) + ", subJectList="
				+ Arrays.toString(subJectList) + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getSubJectList() {
		return subJectList;
	}

	public void setSubJectList(int[] subJectList) {
		this.subJectList = subJectList;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public int getAvg() {
		return avg;
	}


	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	/*
	@Override
	public int compareTo(StudentTest o) {
		
		return Integer.compare(rank, o.rank)*-1;
	}
	*/

	@Override
	public int compareTo(StudentTest o) {
		
		return Integer.compare(rank, o.rank)*-1;
	}
	
	
	



	
}

