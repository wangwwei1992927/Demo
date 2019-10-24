
# 用户类
## 获取学生信息
**URL:** `localhost:8080/user/getStuInfo`

**Type:** `GET`

**Content-Type:** `application/x-www-form-urlencoded`

**Description:** 获取学生信息


**Request-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-

**Request-example:**
```
localhost:8080/user/getStuInfo?name=梓晨.阎
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|id|-
name|string|姓名|-
sex|int32|性别|-
hobby|string|爱好|-
userVoList|array|用户列表|-
└─id|int64|id|-
└─name|string|姓名|-

**Response-example:**
```
{
	"id":977,
	"name":"梓晨.阎",
	"sex":1,
	"hobby":"pz7ous",
	"userVoList":[
		{
			"id":266,
			"name":"梓晨.阎"
		}
	]
}
```

## 接口描述: 根据id获取用户信息
**URL:** `localhost:8080/user/getInfo`

**Type:** `POST`

**Content-Type:** `application/json; charset=utf-8`

**Description:** 接口描述: 根据id获取用户信息


**Request-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
id|int64|id|true|-
name|string|姓名|false|-

**Request-example:**
```
{
	"id":433,
	"name":"梓晨.阎"
}
```
**Response-fields:**

Field | Type|Description|Since
---|---|---|---
id|int64|id|-
name|string|姓名|-

**Response-example:**
```
{
	"id":296,
	"name":"梓晨.阎"
}
```

