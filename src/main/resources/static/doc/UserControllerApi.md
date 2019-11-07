
# 用户类
## 获取学生信息
**请求地址:** `localhost:8080/user/getStuInfo`

**请求方式:** `GET`

**内容格式:** `application/x-www-form-urlencoded`

**描述:** 获取学生信息


**请求参数:**

参数名|类型|说明|是否必填|版本号
---|---|---|---|---
name|string|姓名|true|-

**请求例子:**
```
localhost:8080/user/getStuInfo?name=锦程.曾
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
	"id":86,
	"name":"锦程.曾",
	"sex":0,
	"hobby":"amg5zw",
	"userVoList":[
		{
			"id":60,
			"name":"锦程.曾"
		}
	]
}
```

## 接口描述: 根据id获取用户信息
**请求地址:** `localhost:8080/user/getInfo`

**请求方式:** `POST`

**内容格式:** `application/json; charset=utf-8`

**描述:** 接口描述: 根据id获取用户信息


**请求参数:**

参数名|类型|说明|是否必填|版本号
---|---|---|---|---
id|int64|id|true|-
name|string|姓名|false|-

**请求例子:**
```
{
	"id":364,
	"name":"锦程.曾"
}
```
**响应数据:**

字段名 | 类型|说明|版本号
---|---|---|---
id|int64|id|-
name|string|姓名|-

**响应例子:**
```
{
	"id":139,
	"name":"锦程.曾"
}
```

