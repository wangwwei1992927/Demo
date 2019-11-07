
# 学生类
## 获取学生信息
**请求地址:** `localhost:8080/student/getStuInfo`

**请求方式:** `GET`

**内容格式:** `application/x-www-form-urlencoded`

**描述:** 获取学生信息


**请求参数:**

参数名|类型|说明|是否必填|版本号
---|---|---|---|---
name|string|姓名|true|-

**请求例子:**
```
localhost:8080/student/getStuInfo?name=锦程.曾
```
**响应数据:**

字段名 | 类型|说明|版本号
---|---|---|---
id|int64|id|-
name|string|姓名|-
sex|int32|性别|-
hobby|string|爱好|-
userVoList|array|用户列表|-
└─id|int64|id|-
└─name|string|姓名|-

**响应例子:**
```
{
	"id":617,
	"name":"锦程.曾",
	"sex":0,
	"hobby":"x08rtw",
	"userVoList":[
		{
			"id":415,
			"name":"锦程.曾"
		}
	]
}
```

