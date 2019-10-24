
# 学生类
## 获取学生信息
**URL:** `localhost:8080/student/getStuInfo`

**Type:** `GET`

**Content-Type:** `application/x-www-form-urlencoded`

**Description:** 获取学生信息


**Request-parameters:**

Parameter|Type|Description|Required|Since
---|---|---|---|---
name|string|姓名|true|-

**Request-example:**
```
localhost:8080/student/getStuInfo?name=梓晨.阎
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
	"id":129,
	"name":"梓晨.阎",
	"sex":1,
	"hobby":"guwy5t",
	"userVoList":[
		{
			"id":379,
			"name":"梓晨.阎"
		}
	]
}
```

