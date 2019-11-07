package com.example.demo;

import com.power.common.util.DateTimeUtil;
import com.power.doc.builder.ApiDocBuilder;
import com.power.doc.builder.HtmlApiDocBuilder;
import com.power.doc.constants.DocGlobalConstants;
import com.power.doc.model.*;
import org.junit.Test;


/**
 * @description: 文档生成测试
 * @author: WangWei
 * @create: 2019-10-24 15:03
 */

public class DocCreateTest extends TopTest {

    @Test
    public void createDoc(){
        ApiConfig config = new ApiConfig();
        config.setServerUrl("localhost:8080/");
        //true会严格要求注释，推荐设置true
        config.setStrict(true);
        //true会将文档合并导出到一个markdown
        config.setAllInOne(false);
        //生成html时加密文档名不暴露controller的名称
        config.setMd5EncryptedHtmlName(true);
        //指定文档输出路径
        //@since 1.7 版本开始，选择生成静态html doc文档可使用该路径：DocGlobalConstants.HTML_DOC_OUT_PATH;
        config.setOutPath(DocGlobalConstants.HTML_DOC_OUT_PATH);
        // @since 1.2,如果不配置该选项，则默认匹配全部的controller,
        // 如果需要配置有多个controller可以使用逗号隔开
        config.setPackageFilters("com.example.demo.controller");
        //不指定SourcePaths默认加载代码为项目src/main/java下的,如果项目的某一些实体来自外部代码可以一起加载
        //设置请求头，如果没有请求头，可以不用设置
//        config.setRequestHeaders(
//                ApiReqHeader.header().setName("user-info").setType("string").setDesc("请球头")
//        );
        config.setRevisionLogs(
                RevisionLog.getLog().setRevisionTime("2018/12/15").setAuthor("chen").setRemarks("测试").setStatus("创建").setVersion("V1.0")
        );
        config.setCustomResponseFields(
                CustomRespField.field().setName("success").setDesc("成功返回true,失败返回false"),
                CustomRespField.field().setName("message").setDesc("接口响应信息")
        );

        long start = System.currentTimeMillis();
        //ApiDocBuilder.builderControllersApi(config);
        HtmlApiDocBuilder.builderControllersApi(config);


        //@since 1.7+版本开始，smart-doc支持生成带书签的html文档，html文档可选择下面额方式
        //HtmlApiDocBuilder.builderControllersApi(config);
        //@since 1.7+版本开始，smart-doc支撑生成AsciiDoc文档，你可以把AsciiDoc转成HTML5的格式。
        //@see https://gitee.com/sunyurepository/api-doc-test
        //AdocDocBuilder.builderControllersApi(config);
        long end = System.currentTimeMillis();
        DateTimeUtil.printRunTime(end, start);

    }

}
