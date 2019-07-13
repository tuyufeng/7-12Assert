package com.bw;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
    //1.断言为真（就是表达结果或参数必须为真，否则抛出自己的自定义异常）；
	public static  void  isTrue(boolean b,String message) {
		if(!b) {
			//b不是真的
			throw  new CMSRuntimeException(message);
		}
	}
	
	
	//(2) 断言为假；
	public static void  isFalse(boolean  b,String message) {
		if(b) {
			//b为真
			throw  new CMSRuntimeException(message);
		}
	}
	
	
	//(3) 断言对象不为空；
	public static void  isNotNull(Object obj,String message) {
		if(obj==null) {
			//b为空
			throw  new CMSRuntimeException(message);
		}
	}
	
	
	//(4) 断言对象必须空；
	public  static void isNull(Object obj,String message) {
		if(obj!=null) {
			//不为空报异常
			throw  new CMSRuntimeException(message);
		}
	}
	
	
	//(5) 断言 List 或 Set 集合不为空，没有元素也算空；
	public static void isEmpty(Collection c,String message) {
		if(c.size()==0 || c==null) {
			//集合为空或者元素为空
			throw  new CMSRuntimeException(message);
		}
	}
	
	
	
	//(6) 断言 Map 集合不为空，没有元素也算空；
	public static void  isNotEmpty(Map map,String message) {
		if(map==null || map.isEmpty()) {
			//map集合为空，元素为空
			throw  new CMSRuntimeException(message);
		}
	}
	
	
	
	//(7) 断言字符串必须有值，去掉空格后，长度必须大于 0；
	public static void hasStr(String src,String message) {
		if(src.trim().length()<=0 || src==null) {
			//字符串为空
			throw  new CMSRuntimeException(message);
		}
	}
	
	
	//(8) 断言值必须是正数(值大于 0)；
	public static void isPostive(boolean b,String message) {
        if(!b) {
        	//不是正数
        	throw  new CMSRuntimeException(message);
        }
	}
}
