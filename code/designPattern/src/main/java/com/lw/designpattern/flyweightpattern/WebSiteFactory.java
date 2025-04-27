package com.lw.designpattern.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式 -- 工厂类
 * @author lw
 * @create 2025-04-27-20:33
 */
public class WebSiteFactory {

    private Map<String, WebSite> flyWeights = new HashMap<>();

    public WebSite getWebSite(String key) {
        if (!flyWeights.containsKey(key)) {
            flyWeights.put(key, new ConcreteWebSite(key));
        }
        return flyWeights.get(key);
    }

    public int getWebSiteCount() {
        return flyWeights.size();
    }
}
