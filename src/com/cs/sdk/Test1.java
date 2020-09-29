package com.cs.sdk;

import com.alibaba.xxpt.gateway.shared.client.http.ExecutableClient;
import com.alibaba.xxpt.gateway.shared.client.http.PostClient;

public class Test1 {
    public static void main(String[] args) {
        ExecutableClient executableClient =ExecutableClient.getInstance();
        executableClient.setAccessKey("App Key");
        executableClient.setSecretKey("App Secret");
        executableClient.setDomainName("https://openplatform.dg-work.cn");
        executableClient.setProtocal("https");
        executableClient.init();

        String api ="/gettoken.json";
        PostClient postClient = executableClient.newPostClient(api);
//设置参数
        postClient.addParameter("appkey", "PCBD-86pkP8143huxRLxq8ZYbQN3mq");
        postClient.addParameter("appsecret", "DAQv00QhhcEW8ELUZInuBjxbmEh7I4BcH6lt9ODC");
//调用API
        String apiResult = postClient.post();
        System.out.println(apiResult);
    }
}
