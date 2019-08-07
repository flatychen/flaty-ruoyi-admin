package com.ruoyi.admin.oa.model;

import org.springframework.util.CollectionUtils;

import java.util.List;

public class OaUserResponse {


    /**
     * code : 0
     * msg : success
     * data : {"userInfo":{"userId":7536,"username":"meidddd","password":"699486aa95e61d6bba2fa1b136234597","deptId":10164,"realName":"老赵","mobile":"13710646655","status":"1","createTime":"2019-07-02T23:34:03.000+0000","modifyTime":"2019-07-24T09:00:08.000+0000","lastLoginTime":"2019-07-18T18:32:06.000+0000","ssex":"0","description":null,"avatar":"1d22f3e41d284f50b2c8fc32e0788698.jpeg","staffId":"AY-027976","birthDay":null,"email":"dswe@aoyuan.net","positionName":"java开发工程师","wxOpenid":null,"type":1,"module":0,"projectName":null,"imgUrl":"","orgId":"aa934fc4-e7b9-4aeb-91af-4a176e9d10ac","loginToken":null},"depts":[{"deptId":10164,"parentId":10098,"deptName":"广东奥智云科技有限公司","orderNum":8,"createTime":"2019-06-26T23:16:26.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":null,"oaid":"aa934fc4-e7b9-4aeb-91af-4a176e9d10ac","code":"9595","disable":1,"order":8,"parentOrg":"AMJSS","managerAccount":null,"orgType":2,"parentOaid":"178febf3-0ce2-4202-a6c4-fd8017a667b3"},{"deptId":10098,"parentId":10001,"deptName":"奥园健康生活集团","orderNum":6,"createTime":"2019-06-26T22:31:45.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":null,"oaid":"178febf3-0ce2-4202-a6c4-fd8017a667b3","code":"AMJSS","disable":1,"order":6,"parentOrg":"AY","managerAccount":"mshua","orgType":1,"parentOaid":"ee020155-b049-4dd3-8112-319dba91799d"},{"deptId":10001,"parentId":10000,"deptName":"奥园集团有限公司","orderNum":1,"createTime":"2019-06-27T03:11:06.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":"AY","oaid":"ee020155-b049-4dd3-8112-319dba91799d","code":"AY","disable":1,"order":1,"parentOrg":null,"managerAccount":"ssryuan","orgType":1,"parentOaid":"00000000-0000-0000-0000-000000000000"}]}
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public boolean success() {
        return 0 == code;
    }

    public boolean notExist() {
        return 0 == code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * userInfo : {"userId":7536,"username":"meidddd","password":"699486aa95e61d6bba2fa1b136234597","deptId":10164,"realName":"老赵","mobile":"13710646655","status":"1","createTime":"2019-07-02T23:34:03.000+0000","modifyTime":"2019-07-24T09:00:08.000+0000","lastLoginTime":"2019-07-18T18:32:06.000+0000","ssex":"0","description":null,"avatar":"1d22f3e41d284f50b2c8fc32e0788698.jpeg","staffId":"AY-027976","birthDay":null,"email":"dswe@aoyuan.net","positionName":"java开发工程师","wxOpenid":null,"type":1,"module":0,"projectName":null,"imgUrl":"","orgId":"aa934fc4-e7b9-4aeb-91af-4a176e9d10ac","loginToken":null}
         * depts : [{"deptId":10164,"parentId":10098,"deptName":"广东奥智云科技有限公司","orderNum":8,"createTime":"2019-06-26T23:16:26.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":null,"oaid":"aa934fc4-e7b9-4aeb-91af-4a176e9d10ac","code":"9595","disable":1,"order":8,"parentOrg":"AMJSS","managerAccount":null,"orgType":2,"parentOaid":"178febf3-0ce2-4202-a6c4-fd8017a667b3"},{"deptId":10098,"parentId":10001,"deptName":"奥园健康生活集团","orderNum":6,"createTime":"2019-06-26T22:31:45.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":null,"oaid":"178febf3-0ce2-4202-a6c4-fd8017a667b3","code":"AMJSS","disable":1,"order":6,"parentOrg":"AY","managerAccount":"mshua","orgType":1,"parentOaid":"ee020155-b049-4dd3-8112-319dba91799d"},{"deptId":10001,"parentId":10000,"deptName":"奥园集团有限公司","orderNum":1,"createTime":"2019-06-27T03:11:06.000+0000","modifyTime":"2019-07-24T00:06:45.000+0000","englishName":"AY","oaid":"ee020155-b049-4dd3-8112-319dba91799d","code":"AY","disable":1,"order":1,"parentOrg":null,"managerAccount":"ssryuan","orgType":1,"parentOaid":"00000000-0000-0000-0000-000000000000"}]
         */

        /**
         * userId : 7536
         * username : meidddd
         * password : 699486aa95e61d6bba2fa1b136234597
         * deptId : 10164
         * realName : 老赵
         * mobile : 13710646655
         * status : 1
         * createTime : 2019-07-02T23:34:03.000+0000
         * modifyTime : 2019-07-24T09:00:08.000+0000
         * lastLoginTime : 2019-07-18T18:32:06.000+0000
         * ssex : 0
         * description : null
         * avatar : 1d22f3e41d284f50b2c8fc32e0788698.jpeg
         * staffId : AY-027976
         * birthDay : null
         * email : dswe@aoyuan.net
         * positionName : java开发工程师
         * wxOpenid : null
         * type : 1
         * module : 0
         * projectName : null
         * imgUrl :
         * orgId : aa934fc4-e7b9-4aeb-91af-4a176e9d10ac
         * loginToken : null
         */

        private int userId;
        private String username;
        private String password;
        private int deptId;
        private String realName;
        private String mobile;
        private String status;
        private String createTime;
        private String modifyTime;
        private String lastLoginTime;
        private String ssex;
        private Object description;
        private String avatar;
        private String staffId;
        private Object birthDay;
        private String email;
        private String positionName;
        private Object wxOpenid;
        private int type;
        private int module;
        private Object projectName;
        private String imgUrl;
        private String orgId;
        private Object loginToken;
        private List<DeptsBean> depts;


        public DeptsBean getLatestDept() {
            if (!CollectionUtils.isEmpty(depts)) {
               return depts.get(0);
            }
            return null;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getDeptId() {
            return deptId;
        }

        public void setDeptId(int deptId) {
            this.deptId = deptId;
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getModifyTime() {
            return modifyTime;
        }

        public void setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
        }

        public String getLastLoginTime() {
            return lastLoginTime;
        }

        public void setLastLoginTime(String lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        public String getSsex() {
            return ssex;
        }

        public void setSsex(String ssex) {
            this.ssex = ssex;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getStaffId() {
            return staffId;
        }

        public void setStaffId(String staffId) {
            this.staffId = staffId;
        }

        public Object getBirthDay() {
            return birthDay;
        }

        public void setBirthDay(Object birthDay) {
            this.birthDay = birthDay;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPositionName() {
            return positionName;
        }

        public void setPositionName(String positionName) {
            this.positionName = positionName;
        }

        public Object getWxOpenid() {
            return wxOpenid;
        }

        public void setWxOpenid(Object wxOpenid) {
            this.wxOpenid = wxOpenid;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getModule() {
            return module;
        }

        public void setModule(int module) {
            this.module = module;
        }

        public Object getProjectName() {
            return projectName;
        }

        public void setProjectName(Object projectName) {
            this.projectName = projectName;
        }

        public String getImgUrl() {
            return imgUrl;
        }

        public void setImgUrl(String imgUrl) {
            this.imgUrl = imgUrl;
        }

        public String getOrgId() {
            return orgId;
        }

        public void setOrgId(String orgId) {
            this.orgId = orgId;
        }

        public Object getLoginToken() {
            return loginToken;
        }

        public void setLoginToken(Object loginToken) {
            this.loginToken = loginToken;
        }

        public List<DeptsBean> getDepts() {
            return depts;
        }

        public void setDepts(List<DeptsBean> depts) {
            this.depts = depts;
        }


        public static class DeptsBean {
            /**
             * deptId : 10164
             * parentId : 10098
             * deptName : 广东奥智云科技有限公司
             * orderNum : 8
             * createTime : 2019-06-26T23:16:26.000+0000
             * modifyTime : 2019-07-24T00:06:45.000+0000
             * englishName : null
             * oaid : aa934fc4-e7b9-4aeb-91af-4a176e9d10ac
             * code : 9595
             * disable : 1
             * order : 8
             * parentOrg : AMJSS
             * managerAccount : null
             * orgType : 2
             * parentOaid : 178febf3-0ce2-4202-a6c4-fd8017a667b3
             */

            private int deptId;
            private int parentId;
            private String deptName;
            private int orderNum;
            private String createTime;
            private String modifyTime;
            private Object englishName;
            private String oaid;
            private String code;
            private int disable;
            private int order;
            private String parentOrg;
            private Object managerAccount;
            private int orgType;
            private String parentOaid;

            public int getDeptId() {
                return deptId;
            }

            public void setDeptId(int deptId) {
                this.deptId = deptId;
            }

            public int getParentId() {
                return parentId;
            }

            public void setParentId(int parentId) {
                this.parentId = parentId;
            }

            public String getDeptName() {
                return deptName;
            }

            public void setDeptName(String deptName) {
                this.deptName = deptName;
            }

            public int getOrderNum() {
                return orderNum;
            }

            public void setOrderNum(int orderNum) {
                this.orderNum = orderNum;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getModifyTime() {
                return modifyTime;
            }

            public void setModifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
            }

            public Object getEnglishName() {
                return englishName;
            }

            public void setEnglishName(Object englishName) {
                this.englishName = englishName;
            }

            public String getOaid() {
                return oaid;
            }

            public void setOaid(String oaid) {
                this.oaid = oaid;
            }

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public int getDisable() {
                return disable;
            }

            public void setDisable(int disable) {
                this.disable = disable;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public String getParentOrg() {
                return parentOrg;
            }

            public void setParentOrg(String parentOrg) {
                this.parentOrg = parentOrg;
            }

            public Object getManagerAccount() {
                return managerAccount;
            }

            public void setManagerAccount(Object managerAccount) {
                this.managerAccount = managerAccount;
            }

            public int getOrgType() {
                return orgType;
            }

            public void setOrgType(int orgType) {
                this.orgType = orgType;
            }

            public String getParentOaid() {
                return parentOaid;
            }

            public void setParentOaid(String parentOaid) {
                this.parentOaid = parentOaid;
            }

        }
    }
}

