package com.lw.designpattern.chainpattern;

/**
 * @author lw
 * @create 2025-04-27-16:06
 */
public class MajordomoManager extends AbstractManager {

    public MajordomoManager(String name) {
        super(name);
    }

    @Override
    public void handle(Request request) {
        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(this.name + " : " + request.getRequestContent() + " 天数: " + request.getNumber() + " 被批准");
        } else {
            // 交由上级处理
            if (superior != null) {
                superior.handle(request);
            }
        }
    }
}
