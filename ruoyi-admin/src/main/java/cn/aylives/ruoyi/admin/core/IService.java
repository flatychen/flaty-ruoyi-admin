package cn.aylives.ruoyi.admin.core;

import cn.aylives.ruoyi.admin.core.join.ServiceJoinable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

@Service
public interface IService<T> extends ServiceJoinable<T> {
	
	int save(T model);//持久化

	int save(List<T> models);//批量持久化


	int deleteById(Integer id);//通过主鍵刪除

	int deleteByIds(List<Integer> ids);//批量刪除 eg：ids -> “1,2,3,4”


	int batchDelete(List<String> list, String property, Class<T> clazz);


	int updateNotNull(T model);//更新

	T getById(Object id);//通过ID查找


	List<T> findList(T t); // 条件查询


	List<T> findByCondition(Condition condition);//根据条件查找

	List<T> findAll();//获取所有

	List<T> findByExample(Object example);
}