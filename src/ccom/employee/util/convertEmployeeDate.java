package ccom.employee.util;

import java.util.Arrays;

public class convertEmployeeDate {

	public String convertDate(String date)
	{
		String[] str = date.split("-");
        int length = str.length;
        String convert="";

		System.out.println(Arrays.toString(str));
		for(int i=length-1;i>=0;i--) {
			  if(i<=str.length-1 && i!=0) {
				  convert+=str[i]+"-";
			  }
			  else {
				  convert+=str[i];
			  }
			  System.out.println(convert);
		}
		
		return convert;
	}

}
