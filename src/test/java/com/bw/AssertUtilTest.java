package com.bw;

import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AssertUtilTest {

	@Test
	public void testIsTrue() {
	  // AssertUtil.isTrue(1>2, "断言为真");	
	   AssertUtil.isTrue(1<2, "断言为真");	
	}

	@Test
	public void testIsFalse() {
		//AssertUtil.isFalse(1<2, "断言为假");
		AssertUtil.isFalse(1>2, "断言为假");
	}

	@Test
	public void testIsNotNull() {
		//AssertUtil.isNotNull(null, "断言对象不为空");不能通过断言
		AssertUtil.isNotNull("  ", "断言对象不为空");//"","  "通过断言
	}

	@Test
	public void testIsNull() {
	//	AssertUtil.isNull(null, "断言对象必须空");
		AssertUtil.isNull(1, "断言对象必须空");
	}

	@Test
	public void testIsEmpty() {
		List c = new ArrayList();
		c.add(1);
		AssertUtil.isEmpty(c, "断言 List 或 Set 集合不为空，没有元素也算空");
	}

	@Test
	public void testIsNotEmpty() {
		Map map =new HashMap();
		map.put("name", "张三");
		
		AssertUtil.isNotEmpty(map, "断言 Map 集合不为空，没有元素也算空");
	}

	@Test
	public void testHasStr() {
		AssertUtil.hasStr(null, "断言字符串必须有值，去掉空格后，长度必须大于 0");
	}

	@Test
	public void testIsPostive() {
		AssertUtil.isPostive(-1<0, "断言值必须是正数(值大于 0)");
	}

	
	@Test
	public void test() {
		BigDecimal a = new BigDecimal("66.27");
		BigDecimal b = new BigDecimal("100");
		
		System.out.println("乘法："+a.multiply(b));
		System.out.println("减法："+a.subtract(b));
		System.out.println("加法："+a.add(b));
		System.out.println("除法："+a.divide(b));
	}

}
