package com.lw.designpattern.chainpattern;

/**
 * 职责链模式 -- 处理请求接口
 * @author lw
 * @create 2025-04-27-16:00
 */
public interface Manager {

    void setSuperior(Manager manager);

    void handle(Request request);
}
