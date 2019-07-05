package com.ruoyi.admin.core.impl;

import com.ruoyi.admin.core.IService;
import com.ruoyi.admin.core.MyMapper;
import com.ruoyi.admin.core.join.ServiceJoinable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public abstract class AbstractService<T> implements IService<T>, ServiceJoinable<T> {

    @Autowired
    protected MyMapper<T> mapper;

    private Class<T> modelClass;    // 当前泛型真实类型的Class

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }


    public Mapper<T> getMapper() {
        return mapper;
    }


    @Override
    public T getById(Object key) {
        return mapper.selectByPrimaryKey(key);
    }


    /**
     *
     * @param ids
     * @return
     */
    @Override
    public List<T> findByIds(List<Integer> ids) {
        Example example = new Example(modelClass);
        example.createCriteria().andIn("id", (ids));
        return this.mapper.selectByExample(example);
    }


    @Override
    @Transactional
    public int save(T model) {
        return mapper.insert(model);
    }


    @Override
    public int deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * @param ids
     * @return
     */
    @Override
    public int deleteByIds(List<Integer> ids) {
        Example example = new Example(modelClass);
        example.createCriteria().andIn("id", (ids));
        return this.mapper.deleteByExample(example);
    }



    @Override
    public int batchDelete(List<String> list, String property, Class<T> clazz) {
        Example example = new Example(clazz);
        example.createCriteria().andIn(property, list);
        return this.mapper.deleteByExample(example);
    }


    @Override
    public int updateNotNull(T model) {
        return mapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public List<T> findByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int save(List<T> models) {
        return mapper.insertList(models);
    }

    @Override
    public List<T> findList(T t) {
        return mapper.select(t);
    }


    @Override
    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }
    @Override
    public List<T> findAll() {
        return mapper.selectAll();
    }


}
