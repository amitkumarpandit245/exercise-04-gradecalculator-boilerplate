package com.stackroute;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GradeCalculator {

	public static Map<Integer, String> calculateGrade(Map<Integer, Integer> scores) {
		
		Map<Integer,String> result=new TreeMap<>();
		if(scores!=null)
		{
		scores.forEach((k,v)->{
			if(v>=80 && v<=100){
				result.put(k, "A");
			}
			else if(v>=60 && v<80){
				result.put(k, "B");
			}
			else if(v>=45 && v<60){
				result.put(k, "C");
			}
			else if(v>=0 && v<45){
				result.put(k, "D");
			}
			else{
				
			}
		});
		}
		else{
			return null;
		}
		return result;
	}

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	//Use Scanner to get input from console
    	Map<Integer,Integer> in=new LinkedHashMap<>();
    	//GradeCalculator.calculateGrade(new LinkedHashMap(){{put(102,67);put(103,87);put(104,40);put(105,102);}}).forEach((k,v)->System.out.println(k+" "+v));
    	Scanner s=new Scanner(System.in);
    	int numberOfStudent=s.nextInt();
    	for(int i=0;i<numberOfStudent;i++){
    		int key=s.nextInt();
    		int value=s.nextInt();
    		in.put(key, value);
    	}
        Map<Integer,String> result=GradeCalculator.calculateGrade(in);
    	result.forEach((k,v)->System.out.println(k+" "+v));
	}
}