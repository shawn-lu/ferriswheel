package com.micmiu.mvc.ferriswheel.examples.core.mybatis.mapper;

import com.micmiu.mvc.ferriswheel.examples.core.mybatis.entity.Blog;
import com.micmiu.mvc.ferriswheel.orm.mybatis.mapper.GenerateMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlogMapper extends GenerateMapper<Blog, Long> {

	@Select("select * from t_blog where url = #{url}")
	Blog findByURL(String url);

	List<Blog> queryAll();

	Integer selectCountAll();
}

