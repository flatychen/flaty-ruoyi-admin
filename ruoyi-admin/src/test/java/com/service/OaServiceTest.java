package com.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.ruoyi.admin.RuoYiApplication;
import com.ruoyi.admin.oa.model.OaUserResponse;
import com.ruoyi.admin.oa.service.impl.OaServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = RuoYiApplication.class)
@Profile("dev")
@Slf4j
public class OaServiceTest {

    @Autowired
    OaServiceImpl oaService;

    @Test
    public void ancestorsTest() {
        String s = "// 20190806164321\n" + "// http://admin-user-center-test.aylives.cn/user/getUserInfoByUserName?userName=mflong\n" + "\n" + "{\n" + "  \"code\": 0,\n" + "  \"msg\": \"success\",\n" + "  \"data\": [\n" + "    {\n" + "      \"userId\": 17168,\n" + "      \"username\": \"mflong\",\n" + "      \"password\": \"92ef4cefdc936b82a0074da1deb4a2cd\",\n" + "      \"deptId\": 12700,\n" + "      \"realName\": \"缪飞龙\",\n" + "      \"mobile\": \"16626707937\",\n" + "      \"status\": \"0\",\n" + "      \"createTime\": \"2019-07-02T23:37:44.000+0000\",\n" + "      \"modifyTime\": \"2019-07-02T23:37:44.000+0000\",\n" + "      \"lastLoginTime\": null,\n" + "      \"ssex\": \"0\",\n" + "      \"description\": null,\n" + "      \"avatar\": \"default.jpg\",\n" + "      \"staffId\": \"AY-041642\",\n" + "      \"birthDay\": null,\n" + "      \"email\": \"1576680020@qq.com\",\n" + "      \"positionName\": \"\",\n" + "      \"wxOpenid\": null,\n" + "      \"type\": 1,\n" + "      \"module\": 0,\n" + "      \"projectName\": null,\n" + "      \"imgUrl\": null,\n" + "      \"orgId\": \"0bd46f15-ce78-4c99-80f7-6d7e2e9eee7d\",\n" + "      \"loginToken\": null,\n" + "      \"depts\": [\n" + "        {\n" + "          \"deptId\": 12700,\n" + "          \"parentId\": 11713,\n" + "          \"deptName\": \"奥园春晓花园项目\",\n" + "          \"orderNum\": 14.0,\n" + "          \"createTime\": \"2019-06-26T23:22:05.000+0000\",\n" + "          \"modifyTime\": \"2019-07-24T00:06:45.000+0000\",\n" + "          \"englishName\": null,\n" + "          \"oaid\": \"0bd46f15-ce78-4c99-80f7-6d7e2e9eee7d\",\n" + "          \"code\": \"wygs914\",\n" + "          \"disable\": 1,\n" + "          \"order\": 14,\n" + "          \"parentOrg\": \"9309\",\n" + "          \"managerAccount\": null,\n" + "          \"orgType\": 1,\n" + "          \"parentOaid\": \"ae6056e9-dab8-41d7-9918-76e66bf67f19\"\n" + "        },\n" + "        {\n" + "          \"deptId\": 11713,\n" + "          \"parentId\": 10545,\n" + "          \"deptName\": \"广州市\",\n" + "          \"orderNum\": 1.0,\n" + "          \"createTime\": \"2019-06-26T23:20:22.000+0000\",\n" + "          \"modifyTime\": \"2019-07-24T00:06:45.000+0000\",\n" + "          \"englishName\": null,\n" + "          \"oaid\": \"ae6056e9-dab8-41d7-9918-76e66bf67f19\",\n" + "          \"code\": \"9309\",\n" + "          \"disable\": 1,\n" + "          \"order\": 1,\n" + "          \"parentOrg\": \"9308\",\n" + "          \"managerAccount\": null,\n" + "          \"orgType\": 1,\n" + "          \"parentOaid\": \"054ef020-184b-4931-965a-16f8ce901a3d\"\n" + "        },\n" + "        {\n" + "          \"deptId\": 10545,\n" + "          \"parentId\": 10240,\n" + "          \"deptName\": \"华南区域\",\n" + "          \"orderNum\": 0.0,\n" + "          \"createTime\": \"2019-06-26T23:17:58.000+0000\",\n" + "          \"modifyTime\": \"2019-07-24T00:06:45.000+0000\",\n" + "          \"englishName\": null,\n" + "          \"oaid\": \"054ef020-184b-4931-965a-16f8ce901a3d\",\n" + "          \"code\": \"9308\",\n" + "          \"disable\": 1,\n" + "          \"order\": 0,\n" + "          \"parentOrg\": \"F1\",\n" + "          \"managerAccount\": null,\n" + "          \"orgType\": 1,\n" + "          \"parentOaid\": \"52527d90-5f71-4336-9094-19cc083e97bf\"\n" + "        },\n" + "        {\n" + "          \"deptId\": 10240,\n" + "          \"parentId\": 10161,\n" + "          \"deptName\": \"区域公司\",\n" + "          \"orderNum\": 1.0,\n" + "          \"createTime\": \"2019-06-26T23:16:54.000+0000\",\n" + "          \"modifyTime\": \"2019-07-24T00:06:45.000+0000\",\n" + "          \"englishName\": null,\n" + "          \"oaid\": \"52527d90-5f71-4336-9094-19cc083e97bf\",\n" + "          \"code\": \"F1\",\n" + "          \"disable\": 1,\n" + "          \"order\": 1,\n" + "          \"parentOrg\": \"AYWYZB\",\n" + "          \"managerAccount\": null,\n" + "          \"orgType\": 1,\n" + "          \"parentOaid\": \"184d058e-7cd9-4344-bef1-0ee55d012f7e\"\n" + "        },\n" + "        {\n" + "          \"deptId\": 10161,\n" + "          \"parentId\": 10098,\n" + "          \"deptName\": \"奥园物业服务有限公司\",\n" + "          \"orderNum\": 2.0,\n" + "          \"createTime\": \"2019-06-26T23:16:26.000+0000\",\n" + "          \"modifyTime\": \"2019-07-24T00:06:45.000+0000\",\n" + "          \"englishName\": null,\n" + "          \"oaid\": \"184d058e-7cd9-4344-bef1-0ee55d012f7e\",\n" + "          \"code\": \"AYWYZB\",\n" + "          \"disable\": 1,\n" + "          \"order\": 2,\n" + "          \"parentOrg\": \"AMJSS\",\n" + "          \"managerAccount\": \"jiangyue\",\n" + "          \"orgType\": 1,\n" + "          \"parentOaid\": \"178febf3-0ce2-4202-a6c4-fd8017a667b3\"\n" + "        },\n" + "        {\n" + "          \"deptId\": 10098,\n" + "          \"parentId\": 10001,\n" + "          \"deptName\": \"奥园健康生活集团\",\n" + "          \"orderNum\": 6.0,\n" + "          \"createTime\": \"2019-06-26T22:31:45.000+0000\",\n" + "          \"modifyTime\": \"2019-07-24T00:06:45.000+0000\",\n" + "          \"englishName\": null,\n" + "          \"oaid\": \"178febf3-0ce2-4202-a6c4-fd8017a667b3\",\n" + "          \"code\": \"AMJSS\",\n" + "          \"disable\": 1,\n" + "          \"order\": 6,\n" + "          \"parentOrg\": \"AY\",\n" + "          \"managerAccount\": \"mshua\",\n" + "          \"orgType\": 1,\n" + "          \"parentOaid\": \"ee020155-b049-4dd3-8112-319dba91799d\"\n" + "        },\n" + "        {\n" + "          \"deptId\": 10001,\n" + "          \"parentId\": 0,\n" + "          \"deptName\": \"奥园集团有限公司\",\n" + "          \"orderNum\": 1.0,\n" + "          \"createTime\": \"2019-06-27T03:11:06.000+0000\",\n" + "          \"modifyTime\": \"2019-07-24T00:06:45.000+0000\",\n" + "          \"englishName\": \"AY\",\n" + "          \"oaid\": \"ee020155-b049-4dd3-8112-319dba91799d\",\n" + "          \"code\": \"AY\",\n" + "          \"disable\": 1,\n" + "          \"order\": 1,\n" + "          \"parentOrg\": null,\n" + "          \"managerAccount\": \"ssryuan\",\n" + "          \"orgType\": 1,\n" + "          \"parentOaid\": \"00000000-0000-0000-0000-000000000000\"\n" + "        }\n" + "      ]\n" + "    }\n" + "  ]\n" + "}";
        OaUserResponse response = JSON.parseObject(s, new TypeReference<OaUserResponse>() {
        });
        oaService.saveUserAndDept(response.getData());

    }



}