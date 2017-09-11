package cn.come.demo.utils;

import java.util.Arrays;
import java.util.List;

public class Functions {

	//拼接功能代码
		public static String appendFunctionCode(String[] funcode){
			StringBuffer sb = new StringBuffer();
			for(int i = 0; i < funcode.length; i++){
			sb. append(funcode[i]).append(",");
			}
			String string = sb.toString();
			return string.substring(0, string.length()-1);
		}
		
		
	//拼接功能名称
	public static String appendFunctionName(String[] func) {
		FunctionName[] values = FunctionName.values();
		List<String> strArr = Arrays.asList(func);
		String funname="";
		for (int i = 0; i < values.length; i++) {
			if (strArr.contains(values[i].getKey())) {
				funname =funname+values[i].getValue()+ ",";
			}
		}
		funname=funname.substring(0, funname.length()-1);
		return funname;

	}
	
	
	
	/*public static void main(String[] args) {
		String[] s={"1","2","4","5"};
		String functionCode = appendFunctionCode(s);
		String functionName = appendFunctionName(s);
		System.out.println(functionCode);
		System.out.println(functionName);
	}
*/
}
