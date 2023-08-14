package array;

public class StudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stu[] = {"Su Su","Aung Aung","Zin Zin","Min Min","Khin Thu"};
		
		int mark[] = {45,65,23,78,34};
		
		for(int i=0; i<mark.length; i++) {
			if(mark[i]>=50) {
				System.out.println(stu[i]+" is pass.");
			}else {
				System.out.println(stu[i]+" is fail");
			}
		}

	}

}
 