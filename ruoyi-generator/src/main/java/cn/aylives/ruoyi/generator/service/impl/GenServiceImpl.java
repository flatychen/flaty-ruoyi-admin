//package cn.aylives.ruoyi.generator.service.impl;
//
//import Constants;
//import StringUtils;
//import GenConfig;
//import ColumnInfo;
//import TableInfo;
//import cn.aylives.ruoyi.generator.mapper.GenMapper;
//import IGenService;
//import GenUtils;
//import VelocityInitializer;
//import org.apache.commons.io.IOUtils;
//import org.apache.velocity.Template;
//import org.apache.velocity.VelocityContext;
//import org.apache.velocity.app.Velocity;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.StringWriter;
//import java.util.List;
//import java.util.zip.ZipEntry;
//import java.util.zip.ZipOutputStream;
//
///**
// * 代码生成 服务层处理
// *
// * @author ruoyi
// */
//@Service
//public class GenServiceImpl implements IGenService
//{
//    private static final Logger log = LoggerFactory.getLogger(GenServiceImpl.class);
//
//    @Autowired
//    private GenMapper genMapper;
//
//    /**
//     * 查询ry数据库表信息
//     *
//     * @param tableInfo 表信息
//     * @return 数据库表列表
//     */
//    @Override
//    public List<TableInfo> selectTableList(TableInfo tableInfo)
//    {
//        return genMapper.selectTableList(tableInfo);
//    }
//
//    /**
//     * 生成代码
//     *
//     * @param tableName 表名称
//     * @return 数据
//     */
//    @Override
//    public byte[] generatorCode(String tableName , String parentModuleName)
//    {
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        ZipOutputStream zip = new ZipOutputStream(outputStream);
//        generatorCode(tableName, zip,parentModuleName);
//        IOUtils.closeQuietly(zip);
//        return outputStream.toByteArray();
//    }
//
//    /**
//     * 批量生成代码
//     *
//     * @param tableNames 表数组
//     * @return 数据
//     */
//    @Override
//    public byte[] generatorCode(String[] tableNames , String parentModuleName)
//    {
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        ZipOutputStream zip = new ZipOutputStream(outputStream);
//        for (String tableName : tableNames)
//        {
//            generatorCode(tableName, zip,parentModuleName);
//        }
//        IOUtils.closeQuietly(zip);
//        return outputStream.toByteArray();
//    }
//
//    /**
//     * 查询表信息并生成代码
//     */
//    private void generatorCode(String tableName, ZipOutputStream zip,String parentModuleName)
//    {
//        // 查询表信息
//        TableInfo table = genMapper.selectTableByName(tableName);
//        // 查询列信息
//        List<ColumnInfo> columns = genMapper.selectTableColumnsByName(tableName);
//
//        // 表名转换成Java属性名
//        String className = GenUtils.tableToJava(table.getTableName());
//        table.setClassName(className);
//        table.setClassname(StringUtils.uncapitalize(className));
//        // 列信息
//        table.setColumns(GenUtils.transColums(columns));
//        // 设置主键
//        table.setPrimaryKey(table.getColumnsLast());
//
//        VelocityInitializer.initVelocity();
//
//        String packageName = GenConfig.getPackageName()+"." + parentModuleName;
//        String moduleName = GenUtils.getModuleName(packageName);
//
//        VelocityContext context = GenUtils.getVelocityContext(table,parentModuleName);
//
//        // 获取模板列表
//        List<String> templates = GenUtils.getTemplates();
//        for (String template : templates)
//        {
//            // 渲染模板
//            StringWriter sw = new StringWriter();
//            Template tpl = Velocity.getTemplate(template, Constants.UTF8);
//            tpl.merge(context, sw);
//            try
//            {
//                // 添加到zip
//                zip.putNextEntry(new ZipEntry(GenUtils.getFileName(template, table, moduleName)));
//                IOUtils.write(sw.toString(), zip, Constants.UTF8);
//                IOUtils.closeQuietly(sw);
//                zip.closeEntry();
//            }
//            catch (IOException e)
//            {
//                log.error("渲染模板失败，表名：" + table.getTableName(), e);
//            }
//        }
//    }
//}
