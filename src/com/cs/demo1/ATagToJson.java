package com.cs.demo1;

import com.alibaba.fastjson.JSONObject;



import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ATagToJson {




    public static void main(String[] args) {
        String testStr = "<p>测试&nbsp;<a href=\"http://www.baidu.com\" target=\"_self\" title=\"测试\">测试</a>&nbsp;&nbsp;<a href=\"http://www.google.com/\" target=\"_self\" title=\"测试\">测试</a>&nbsp;<a href=\"http://www.aiqiyi.com/\" target=\"_self\" title=\"测试\">测试</a> 测试</p>";
        String testStr2 = "<a href=\"https://s.etx365.cn/picture/202002/dc70e778ed6b90b1f20e0384ae566bb8.jpg\" target=\"_blank\"><img width=\"320\" style=\"height:360\" src=\"https://s.etx365.cn/picture/202002/thumbs/dc70e778ed6b90b1f20e0384ae566bb8.jpg\"/></ a>";
        String convertHtml = convertHtml(testStr2);
        System.out.println(convertHtml);
    }


    private static String convertHtml(String content) {
        List<ATag> groupVOList = new LinkedList<>();
        List<ATagOfPart> matcher = getMatcher("<a[^>]*>([^<]*)</a>", content);
        if (matcher.isEmpty()) return JSONObject.toJSONString(groupVOList);
        for (ATagOfPart htmlGroupVO : matcher) {
            ATag groupVO = new ATag();
            groupVO.setaContent(htmlGroupVO.getaContent());
            String group = htmlGroupVO.getGroup();
            groupVO.setHref(getMatcherOfHrefOrTitle("href=\"(.*?)\"", group));
            groupVO.setTitle(getMatcherOfHrefOrTitle("title=\"(.*?)\"", group));
            groupVO.setTarget(getMatcherOfHrefOrTitle("target=\"(.*?)\"", group));
            groupVOList.add(groupVO);
        }
        return JSONObject.toJSONString(groupVOList);
    }


    public static List<ATagOfPart> getMatcher(String regex, String source) {
        List<ATagOfPart> list = new LinkedList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        /*String group = matcher.group();
        String group1 = matcher.group(1);*/


        while(matcher.find()) {
            ATagOfPart htmlGroupVO = new ATagOfPart(matcher.group(), matcher.group(1));
            list.add(htmlGroupVO);
        }
        return list;
    }


    private static String getMatcherOfHrefOrTitle(String regex, String source){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);
        if (matcher.find()) return matcher.group(1);
        return null;
    }
}
class ATag{


    /** a标签的内容 */
    private String aContent;
    /** a标签的链接 */
    private String href;
    /** a标签的title */
    private String title;
    /** a便签的target*/
    private String target;


    public ATag() {
    }


    public ATag(String aContent, String href, String title, String target) {
        this.aContent = aContent;
        this.href = href;
        this.title = title;
        this.target = target;
    }


    public String getaContent() {
        return aContent;
    }


    public void setaContent(String aContent) {
        this.aContent = aContent;
    }


    public String getHref() {
        return href;
    }


    public void setHref(String href) {
        this.href = href;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getTarget() {
        return target;
    }


    public void setTarget(String target) {
        this.target = target;
    }
}


class ATagOfPart {
    /** a标签的全部 */
    private String group;
    /** a标签的内容 */
    private String aContent;


    public ATagOfPart() {
    }


    public ATagOfPart(String group, String aContent) {
        this.group = group;
        this.aContent = aContent;
    }


    public String getGroup() {
        return group;
    }


    public void setGroup(String group) {
        this.group = group;
    }


    public String getaContent() {
        return aContent;
    }


    public void setaContent(String aContent) {
        this.aContent = aContent;
    }
}
