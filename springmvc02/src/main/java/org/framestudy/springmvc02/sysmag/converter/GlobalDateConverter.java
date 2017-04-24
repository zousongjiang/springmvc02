package org.framestudy.springmvc02.sysmag.converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.framestudy.springmvc02.sysmag.utils.PropertiesUtil;
import org.springframework.core.convert.converter.Converter;
/**
 * 定义一个全局类型转换器
 * @author Administrator
 *
 */
public class GlobalDateConverter implements Converter<String, Date> {

	/**
	 * text 来至于页面的数据
	 */
	@Override
	public Date convert(String text) {
		// TODO Auto-generated method stub
		Date date = null;
		SimpleDateFormat format = null;
		try {
			PropertiesUtil util = new PropertiesUtil();
			Properties prop = util.getProperties();
			Set<Object> keys = prop.keySet();//获取键的集合
			if(text != null && !"".equals(text)){
				for (Object object : keys) {
					String key = (String) object;
					Pattern p = Pattern.compile(key);
					Matcher m = p.matcher(text);
					if(m.matches()){
						format = new SimpleDateFormat(prop.getProperty(key));
						date = format.parse(text);
						break;
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return date;
	}

}
