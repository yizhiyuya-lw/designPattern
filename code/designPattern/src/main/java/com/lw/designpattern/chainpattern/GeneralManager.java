package com.lw.designpattern.chainpattern;

/**
 * @author lw
 * @create 2025-04-27-16:06
 */
public class GeneralManager extends AbstractManager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handle(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(this.name + " : " + request.getRequestContent() + " 天数: " + request.getNumber() + " 被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500) {
            System.out.println(this.name + " : " + request.getRequestContent() + " 数量: " + request.getNumber() + " 被批准");
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500) {
            System.out.println(this.name + " : " + request.getRequestContent() + " 数量: " + request.getNumber() + " 再说吧");
        } else {
            if (superior != null) {
                superior.handle(request);
            }
        }
    }
}
