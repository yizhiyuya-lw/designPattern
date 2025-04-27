package com.lw.designpattern.chainpattern;

/**
 * 责任链模式 -- 实际处理器
 * @author lw
 * @create 2025-04-27-16:03
 */
public class CommonManager extends AbstractManager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void handle(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(this.name + " : " + request.getRequestContent() + " 天数: " + request.getNumber() + " 被批准");
        } else {
            // 交由上级处理
            if (superior != null) {
                superior.handle(request);
            }
        }
    }
}
