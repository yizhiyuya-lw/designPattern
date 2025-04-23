package com.lw.designpattern.decorator;

/**
 * 装饰模式实现模型
 * @author lw
 * @create 2025-04-23-22:02
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();

        decoratorA.setComponent(component);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }


    public static abstract class Component {
        public abstract void operation();
    }

    public static class ConcreteComponent extends Component {

        @Override
        public void operation() {
            System.out.println("具体对象的操作");
        }
    }

    public static abstract class Decorator extends Component {

        protected Component component;

        public void setComponent(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            if (component != null) {
                component.operation();
            }
        }
    }

    public static class ConcreteDecoratorA extends Decorator {
        @Override
        public void operation() {
            super.operation();
            System.out.println("ConcreteDecoratorA...");
        }
    }

    public static class ConcreteDecoratorB extends Decorator {
        @Override
        public void operation() {
            super.operation();
            otherMethod();
            System.out.println("ConcreteDecoratorB...");
        }

        private void otherMethod() {
            System.out.println("otherMethod");
        }
    }
}
