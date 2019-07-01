package com.ruoyi.generator.service;

import com.ruoyi.generator.domain.TableInfo;

import java.util.List;

/**
 * 代码生成 服务层
 * 
 * @author ruoyi
 */
public interface IGenService
{
    /**
     * 查询ry数据库表信息
     * 
     * @param tableInfo 表信息
     * @return 数据库表列表
     */
    public List<TableInfo> selectTableList(TableInfo tableInfo);

    /**
     * 生成代码
     * 
     *
     * @param tableName 表名称
     * @param moduleName
     * @return 数据
     */
    public byte[] generatorCode( String tableName , String parentModuleName);

    /**
     * 批量生成代码
     * 
     * @param tableNames 表数组
     * @param moduleName
     * @return 数据
     */
    public byte[] generatorCode(String[] tableNames, String parentModuleName);
}
