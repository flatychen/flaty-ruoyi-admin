package cn.aylives.ruoyi.admin.oa.model;

import lombok.Data;

@Data
public class OaResult<T> {


    /**
     * code : 0
     * msg : success
     * data : {"userInfo":{"userId":7536,"username":"meidddd","password":"699486aa95e61d6bba2fa1b136234597","deptId":10164,"realName":"老赵","mobile":"13710646655","status":"1","createTime":"2019-07-02T23:34:03.000+0000","modifyTime":"2019-07-24T09:00:08.000+0000","lastLoginTime":"2019-07-18T18:32:06.000+0000","ssex":"0","description":null,"avatar":"1d22f3e41d284f50b2c8fc32e0788698.jpeg","staffId":"AY-027976","birthDay":null,"email":"dswe@aoyuan.net","positionName":"java开发工程师","wxOpenid":null,"type":1,"module":0,"projectName":null,"imgUrl":"","orgId":"aa934fc4-e7b9-4aeb-91af-4a176e9d10ac","loginToken":null},"depts":[{"deptId":10164,"parentId":10098,"deptName":"广东奥智云科技有限公司","orderNum":8,"createTime":"2019-06-26T23:16:26.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":null,"oaid":"aa934fc4-e7b9-4aeb-91af-4a176e9d10ac","code":"9595","disable":1,"order":8,"parentOrg":"AMJSS","managerAccount":null,"orgType":2,"parentOaid":"178febf3-0ce2-4202-a6c4-fd8017a667b3"},{"deptId":10098,"parentId":10001,"deptName":"奥园健康生活集团","orderNum":6,"createTime":"2019-06-26T22:31:45.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":null,"oaid":"178febf3-0ce2-4202-a6c4-fd8017a667b3","code":"AMJSS","disable":1,"order":6,"parentOrg":"AY","managerAccount":"mshua","orgType":1,"parentOaid":"ee020155-b049-4dd3-8112-319dba91799d"},{"deptId":10001,"parentId":10000,"deptName":"奥园集团有限公司","orderNum":1,"createTime":"2019-06-27T03:11:06.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":"AY","oaid":"ee020155-b049-4dd3-8112-319dba91799d","code":"AY","disable":1,"order":1,"parentOrg":null,"managerAccount":"ssryuan","orgType":1,"parentOaid":"00000000-0000-0000-0000-000000000000"}]}
     */

    private int code;
    private String msg;
    private T data;

    public boolean success() {
        return 0 == code;
    }


    public boolean tokenNotValid() {
        {
            return -2 == code;
        }
    }
}
